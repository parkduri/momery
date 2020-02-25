package com.duri.memory.dao;

import java.util.List;
import java.util.Map;

public interface NoticeDao {

	public List<Map<String, Object>> selectList();

	public int selectListCnt();
}
