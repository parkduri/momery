<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="shortcut icon" href="data:image/x-icon;," type="image/x-icon">
    <meta charset="utf-8">
	<title>Home</title>
</head>
<body>
	<div id ="listBox">
		<h1>게시판</h1>
		<div class="btn-area">
			<!-- <button type="button" id="search">조회</button> -->
			<button type="button" id="btnDel">선택 삭제</button>
			<button type="button" id="btnDelAll">전체 삭제</button>
		</div>
		<table id="listTable">
			<tr>
				<td>글번호</td><td>제목</td><td>아이디</td><td>조회수</td><td>등록일</td>
			</tr>
		</table>
		<div class="btn-area">
			<button type="button" id="btnWrite">글쓰기</button>
			<button type="button" id="btnUpdate">수정</button>
		</div>
	</div>
	<script src="../js/notice.js"></script>
</body>
</html>
