package com.kitri.cafe.admin.service;

import java.util.List;

import com.kitri.cafe.admin.board.model.BoardListDto;
import com.kitri.cafe.admin.board.model.BoardTypeDto;
import com.kitri.cafe.admin.board.model.CategoryDto;

public interface BoardAdminService {
	//myBatis로 갈 때, 인자값 하나만!!!!
	List<BoardListDto> getBoardMenuList(int ccode);//0번일 경우 전체 메뉴

	// 카테고리 만들기
	List<CategoryDto> getCategoryList();
	void makeCategory(CategoryDto categoryDto);

	// 게시판 만들기
	List<BoardTypeDto> getBoardTypeList();
	void makeBoard(BoardListDto boardListDto);
	
}
