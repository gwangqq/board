package com.kitri.cafe.service;

import java.util.List;
import java.util.Map;

import com.kitri.cafe.board.model.MemoDto;

public interface MemoService {
	void writeMemo(MemoDto memoDto);
	String listMemo(int seq);
	void modifyMemo(MemoDto memoDto);
	String deleteMemo(int seq, int mseq);
}
