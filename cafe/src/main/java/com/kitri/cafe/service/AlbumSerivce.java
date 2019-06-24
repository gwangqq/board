package com.kitri.cafe.service;

import java.util.List;
import java.util.Map;


import com.kitri.cafe.board.model.AlbumDto;


public interface AlbumSerivce {
	
	int writeArticle(AlbumDto albumDto);
	List<AlbumDto> listArticle(Map<String, String> parameter);
	AlbumDto viewArticle(int seq);
	int modifyArticle(AlbumDto albumDto);
	void deleteArticle(int seq);
}
