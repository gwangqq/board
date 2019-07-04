package com.kitri.cafe.board.controller;




import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kitri.cafe.board.model.MemoDto;
import com.kitri.cafe.member.model.MemberDto;
import com.kitri.cafe.service.MemoService;

@RestController//@Controller + 각 메소드 return type 앞에 @ResponsBody 한번에 합친 것
@RequestMapping("/memo")
public class MemoController {

	@Autowired
	private MemoService memoService;
	
	//JSON으로 넘어온 거는 받을 때 JSON인자 값에 @RequestBody, return type에 @RequestBody 붙여준다
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", headers = {"Content-type=application/json"})
	public String write(@RequestBody MemoDto memoDto, HttpSession session) {
		System.out.println("Controller (post): " + memoDto);
		MemberDto memberDto = (MemberDto) session.getAttribute("userInfo");
		if(memberDto != null) {
		
			memoDto.setId(memberDto.getId());
			memoDto.setName(memberDto.getName());
			memoService.writeMemo(memoDto);
			String json = memoService.listMemo(memoDto.getSeq());
			return json;
		}
		
		return "";
	}
	
	@RequestMapping(method = RequestMethod.GET, consumes = "application/json", headers = {"Content-type=application/json"})
	public String list(int seq) {
		String json = memoService.listMemo(seq);
		return json;
	}
	
//	/memo/{글번호} --> 변수를 받을 때는 {} -->@PathVariable 선언해줘야함 
	@RequestMapping(value = "/{seq}/{mseq}",method = RequestMethod.DELETE, consumes = "application/json", headers = {"Content-type=application/json"})
	public String delete(@PathVariable(name = "seq") int seq, @PathVariable(name = "mseq") int mseq) {
		String json = memoService.deleteMemo(seq, mseq);
		return json;
	}
	
//----------------------------[메모수정]-------------------------------
	
	@RequestMapping(method = RequestMethod.PUT, consumes = "application/json", headers = {"Content-type=application/json"})
	public String modify(@RequestBody MemoDto memoDto, HttpSession session) {
//		System.out.println(memoDto);
		MemberDto memberDto = (MemberDto) session.getAttribute("userInfo");
		if(memberDto != null) {
			memoDto.setId(memberDto.getId());
			memoDto.setName(memberDto.getName());
//			System.out.println("Controller : " + memoDto);
			memoService.updateMemo(memoDto);
			String json = memoService.listMemo(memoDto.getSeq());
			return json;
		}
		
		return "";
	}

}
