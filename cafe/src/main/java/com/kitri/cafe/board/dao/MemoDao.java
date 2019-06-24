package com.kitri.cafe.board.dao;

import java.util.List;
import java.util.Map;

import com.kitri.cafe.board.model.MemoDto;

public interface MemoDao {
	int writeArticle(MemoDto memoDto);
	List<MemoDto> listArticle(Map<String, String> parameter);
	MemoDto viewArticle(int seq);
	int modifyArticle(MemoDto memoDto);
	void deleteArticle(int seq);
}
