package com.kitri.cafe.board.dao;

import java.util.List;
import java.util.Map;

import com.kitri.cafe.board.model.AlbumDto;

public interface AlbumDao {
	
	int writeArticle(AlbumDto albumDto);
	List<AlbumDto> listArticle(Map<String, String> parameter);
	AlbumDto viewArticle(int seq);
	int modifyArticle(AlbumDto albumDto);
	void deleteArticle(int seq);
	
}
