package com.kitri.cafe.service;

import java.util.List;
import java.util.Map;

import com.kitri.cafe.board.model.BbsDto;

public interface BbsService {
	
	int writeArticle(BbsDto bbsDto);
	List<BbsDto> listArticle(Map<String, String> parameter);
	BbsDto viewArticle(int seq);
	int modifyArticle(BbsDto bbsDto);
	void deleteArticle(int seq);
	
}
