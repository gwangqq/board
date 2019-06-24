package com.kitri.cafe.service;

import java.util.List;
import java.util.Map;

import com.kitri.cafe.board.model.BoardDto;

public interface BoardService {

	int writeArticle(BoardDto boardDto);
	List<BoardDto> listArticle(Map<String, String> parameter);
	BoardDto viewArticle(int seq);
	int modifyArticle(BoardDto boardDto);
	void deleteArticle(int seq);
}
