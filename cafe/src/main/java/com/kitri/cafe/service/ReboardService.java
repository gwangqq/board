package com.kitri.cafe.service;

import java.util.List;
import java.util.Map;

import com.kitri.cafe.board.model.ReboardDto;
import com.kitri.cafe.util.PageNavigation;

public interface ReboardService {
	
	int writeArticle(ReboardDto reboardDto);
	List<ReboardDto> listArticle(Map<String, String> parameter);
	ReboardDto viewArticle(int seq);
	ReboardDto getArticle(int seq);
	int modifyArticle(ReboardDto reboardDto);
	void deleteArticle(int seq);
	
	
	int replyArticle(ReboardDto reboardDto);

}
