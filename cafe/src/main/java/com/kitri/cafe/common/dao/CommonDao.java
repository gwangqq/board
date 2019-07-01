package com.kitri.cafe.common.dao;

import java.util.Map;

public interface CommonDao {

	public int getNextSeq();
	public void updateHit(int seq);
	
	public int getNewArticleCount(int bcode);       
	public int getTotalArticleCount(Map<String, String> parameter);
	
}
