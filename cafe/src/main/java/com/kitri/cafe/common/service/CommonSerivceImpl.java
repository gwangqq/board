package com.kitri.cafe.common.service;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitri.cafe.common.dao.CommonDao;
import com.kitri.cafe.util.CafeConstance;
import com.kitri.cafe.util.NumberCheck;
import com.kitri.cafe.util.PageNavigation;

@Service
public class CommonSerivceImpl implements CommonService{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int getNextSeq() {
		return sqlSession.getMapper(CommonDao.class).getNextSeq();
	}

	@Override
	public PageNavigation getPageNavigation(Map<String, String> parameter) {
		PageNavigation navigation = new PageNavigation();
		
		int bcode = Integer.parseInt(parameter.get("bcode"));
		
		int newArticleCount = sqlSession.getMapper(CommonDao.class).getNewArticleCount(bcode);
		navigation.setNewArticleCount(newArticleCount);
		
		int totalArticleCount = sqlSession.getMapper(CommonDao.class).getTotalArticleCount(parameter);
		navigation.setTotalArticleCount(totalArticleCount);

		int totalPageCount = (totalArticleCount-1) / CafeConstance.ARTICLE_SIZE + 1;//나누어 떨어지는 숫자를 없애면 된다
		navigation.setTotalPageCount(totalPageCount);
		
		int pg = NumberCheck.NotNumberToOne(parameter.get("pg"));
		navigation.setNowFirst(pg <= CafeConstance.PAGE_SIZE);
		navigation.setNowEnd((totalPageCount-1)/CafeConstance.PAGE_SIZE * CafeConstance.PAGE_SIZE < pg);
		navigation.setPageNo(pg);
		return navigation;
	}


}
