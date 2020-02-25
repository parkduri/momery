package com.duri.memory.service;

import java.util.List;
import java.util.Map;

public interface NoticeService {
	public List<Map<String, Object>> selectList();
	public int selectListCnt();
}
