<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/commons/template/top.jsp"%>
<%@ include file="/WEB-INF/views/commons/logincheck.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="ko">
<head>
<title>게시판 글쓰기</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${root}/css/skin_purple.css" type="text/css">
<script type="text/javascript">
$(document).ready(function() {
	
	$(".modifyBtn").click(function() {
		$("#bcode").val("${param.bcode}");
		$("#pg").val("${param.pg}");
		$("#key").val("${param.key}");
		$("#word").val("${param.word}");
		$("#seq").val("${article.seq}");
		$("#modifyForm").attr("method", "POST").attr("action", "${root}/reboard/modify").submit();
	});
	
});
</script>

</head>

<body>
<!-- title -->
<table width="100%" cellpadding="0" cellspacing="0" border="0">
	<tr>
		<td><img src="${root}/img/board/m_icon_board.gif" width="9"
			height="9" border="0" align="absmiddle" style="margin-top: -2px">
		<b>자유게시판</b> &nbsp;<font style="font-size: 8pt">|</font>&nbsp; 자유로운 글을
		올리는 공간입니다<br>
		</td>
		<td align="right"></td>
	</tr>
	<tr>
		<td colspan="2" height="19"></td>
	</tr>
</table>

<table border="0" cellpadding="0" cellspacing="0" width="630">
	<tr>
		<td><img src="${root}/img/board/icon_arrow_04.gif" width="4"
			height="11" border="0" align="absmiddle" vspace="4"></td>
		<td width="100%" style="padding-left: 4px"><b>글수정</b></td>
	</tr>
	<tr>
		<td width="630" colspan="2" height="2" class="bg_board_title_02"></td>
	</tr>
</table>
<br>

<form id="modifyForm" name="modifyForm" method="post" action=""
	style="margin: 0px">
<div id="attach_file_hdn"></div>

<input type="hidden" name="bcode" value="" id="bcode">
<input type="hidden" name="pg" value="" id="pg">
<input type="hidden" name="key" value="" id="key">
<input type="hidden" name="word" value="" id="word">
<input type="hidden" name="seq" value="" id="seq">

<table border="0" cellpadding="5" cellspacing="0" width="630"
	style="table-layout: fixed">

	<tr valign="top">
		<td width="95" nowrap style="padding-left: 8px; padding-top: 10px"><img
			src="${root}/img/board/e_dot.gif" width="4" height="4" border="0"
			align="absmiddle"> <b>제목</b></td>
		<td colspan="5">
		<input name="subject" id="subject" type="text" size="76" maxlength="150" class="inp_02" style="width: 300px"
			value="${article.subject}">
			
			<img src="${root}/img/board/i_info.gif" width="12"
			height="11" border="0" align="absmiddle" vspace="8"
			style="margin: 3 3 0 6"><font class="stext">최대 한글 75자,
		영문 150자</font><br>
	</tr>
	<tr>
		<td width="620" nowrap style="padding-left: 8px; padding-top: 10px"
			colspan="5"><img src="${root}/img/board/e_dot.gif" width="4"
			height="4" border="0" align="absmiddle"> <b>글내용</b> <textarea
			name="content" class="inp_02" cols="67" rows="25" scrollbars="no">
${article.content }
			</textarea>
		</td>
	</tr>
</table>
<table width="630" cellpadding="0" cellspacing="0" border="0">
	<tr>
		<td height="5" style="padding: 0px"></td>
	</tr>
	<tr>
		<td class="bg_board_title_02" height="1"></td>
	</tr>
</table>

<table border="0" cellpadding="2" cellspacing="0" width="630">
	<tr>
		<td height="10" style="padding: 0px"></td>
	</tr>
	<tr>
		<td align="center">
			<img src="${root}/img/board/btn_modify.gif" width="42" height="21"
			class = "modifyBtn" border="0" name="register" alt="등록"> 
		
		<a href="javascript:history.back();">
			<img src="${root}/img/board/b_cancel.gif" width="42" height="21"
			border="0" name="cencel" alt="취소"></a></td>
	</tr>
</table>
</form>
<br>
<br>
<%@ include file="/WEB-INF/views/commons/template/bottom.jsp"%>