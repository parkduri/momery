package com.duri.memory.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDaoImpl implements NoticeDao{

	@Inject
	private SqlSession sqlSession;

	@Override
	public List<Map<String, Object>> selectList() {
		return sqlSession.selectList("noticeMapper.selectList");
	}

	@Override
	public int selectListCnt() {
		return sqlSession.selectOne("noticeMapper.selectListCnt");
	}
}
