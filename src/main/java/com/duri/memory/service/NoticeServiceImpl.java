package com.duri.memory.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.duri.memory.dao.NoticeDao;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Inject
	private NoticeDao dao;

	@Override
	public List<Map<String, Object>> selectList() {
		return dao.selectList();
	}

	@Override
	public int selectListCnt() {
		return dao.selectListCnt();
	}

}
