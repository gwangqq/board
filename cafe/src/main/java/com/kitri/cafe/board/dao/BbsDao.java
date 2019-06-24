package com.kitri.cafe.board.dao;

import java.util.List;
import java.util.Map;

import com.kitri.cafe.board.model.BbsDto;

public interface BbsDao {

	
	int writeArticle(BbsDto bbsDto);
	List<BbsDto> listArticle(Map<String, String> parameter);
	BbsDto viewArticle(int seq);
	int modifyArticle(BbsDto bbsDto);
	void deleteArticle(int seq);
}
