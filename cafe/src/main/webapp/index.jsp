<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.kitri.cafe.member.model.MemberDto"%>
<%
response.sendRedirect(request.getContextPath()+"/boardadmin/boardmenu");


MemberDto memberDto = new MemberDto();

memberDto.setId("gwangq");
memberDto.setName("박광규");
memberDto.setEmail("pgg0406@naver.com");

session.setAttribute("userInfo", memberDto);
%>

