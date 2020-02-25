/**
 * 바날리 js 사용하기
 */


function fn_del(){
	console.log("fn_del");
}
function fn_delAll(){
	console.log("fn_delAll");
}
function fn_write(){
	console.log("fn_write");
}
function fn_update(){
	console.log("fn_update");
}

function init() {


	ajax();
	document.querySelector('#btnDel').addEventListener('click', fn_del); // 선택 삭제
	document.getElementById('btnDelAll').addEventListener('click', fn_delAll); // 전체삭제
	document.getElementById('btnWrite').addEventListener('click', fn_write); // 글등록
	document.getElementById('btnUpdate').addEventListener('click', fn_update); // 글수정	
}


function ajax(){
	const url = "http://localhost:8080/noticeList";
	
	fetch(url)
		.then((result) => {
			console.log(result);
			callbackFunction(result);
		})

		/*
	var xhr = null;
	// XMLHttpRequest 객체 구하기
	xhr = new XMLHttpRequest();
	xhr.addEventListener("load", function(){
		console.log(this.respinseText);
	});
	xhr.onreadystatechange = callbackFunction;
	//open 요청의 초기화. GET/POST 선택. 접속할 URL입력

	xhr.open("GET","http://localhost:8080/noticeList", true);
	xhr.send();
	*/
}
function callbackFunction(data){
	//xhr.readyState 
	/*1 / LOADING / open() 메서드가 호출되고 아직 send() 메서드가 호출되지 않은 상태
	2 / LOADED / send() 메서드가 호출되었지만 STATUS와 헤더는 도착하지 않은 상태
	3 / INTERACTIVE / 데이터의 일부를 받은 상태
	4 / COMPLETED / 데이터를 전부 받은 상태
	*/
	console.log(data);
/*
	var xhr = null;
	if(4 == xhr.readyState && 200 == xhr.status){
		console.log("data>>>", xhr.responseText);
		var result = eval(xhr.responseText);
		console.log("data>>>", result);
		
		var str = "test";
		var tr = document.createElement('tr');
		var td01 = document.createElement('td');
		td01.innerHTML = str;
		tr.appendChild(td01);
		document.getElementById('listTable').appendChild(tr);
	}
	*/
}

init();