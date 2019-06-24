package com.kitri.cafe.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitri.cafe.board.model.MemoDto;

@Service
public class MemoServiceImpl implements MemoService {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void writeMemo(MemoDto memoDto) {

	}

	@Override
	public List<MemoDto> listMemo(Map<String, String> parameter) {
		return null;
	}

	@Override
	public void modifyMemo(MemoDto memoDto) {

	}

	@Override
	public void deleteMemo(int mseq) {

	}

}
