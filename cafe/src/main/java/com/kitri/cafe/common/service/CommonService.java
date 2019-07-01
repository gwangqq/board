package com.kitri.cafe.common.service;

import java.util.Map;

import com.kitri.cafe.util.PageNavigation;

public interface CommonService {
	
	int getNextSeq();
	PageNavigation getPageNavigation(Map<String, String> parameter);
}
