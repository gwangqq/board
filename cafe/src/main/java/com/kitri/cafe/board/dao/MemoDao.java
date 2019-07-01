package com.kitri.cafe.board.dao;

import java.util.List;
import java.util.Map;

import com.kitri.cafe.board.model.MemoDto;

public interface MemoDao {
	int writeMemo(MemoDto memoDto);
	List<MemoDto> listMemo(int seq);
	MemoDto viewMemo(int seq);
	int modifyMemo(MemoDto memoDto);
	void deleteMemo(int mseq);
	void updateMemo(MemoDto memoDto);
}
