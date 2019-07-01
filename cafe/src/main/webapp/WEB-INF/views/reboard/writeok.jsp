<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/commons/template/top.jsp"%>
<%@ include file="/WEB-INF/views/commons/board_common.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="ko">
<head>
<title>글입력 성공</title>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${root}/css/skin_purple.css" type="text/css">
<script type="text/javascript">
$(document).ready(function() {
	
	$("#viewBtn").click(function() {
		//encodingURI, encodingComponent쓰면 쿼리스트링 encoding가능 form에 input hidden으로 보내는거 많이 사용
		$("#bcode").val("${bcode}");
		$("#pg").val("${pg}");
		$("#key").val("${key}");
		$("#word").val("${word}");
		$("#seq").val("${seq}");
		$("#commonForm").attr("method", "GET").attr("action", "${root}/reboard/view").submit();
	});
	
	$("#listBtn").click(function() {
		$("#bcode").val("${bcode}");
		$("#pg").val("1");
		$("#key").val("");
		$("#word").val("");
		$("#commonForm").attr("method", "GET").attr("action", "${root}/reboard/list").submit();
	});
});

</script>

</head>

<body>
<table width="100%" cellpadding="6" cellspacing="2" border="0"
	bgcolor="#ffffff" style="border: #e1e1e1 solid 1px">
	<tr>
		<td class="bg_board_title" width="100%"><img
			src="${root}/img/board/icon_arrow_08.gif" width="3" height="11"
			border="0" align="absmiddle" hspace="6" vspace="6"> <b>게시판</b>
		</td>
	</tr>
	<tr>
		<td height="1" bgcolor="#e1e1e1"
			style="overflow: hidden; padding: 0px;"></td>
	</tr>
	<tr>
		<td class="bg_menu" width="100%" style="padding: 25px" height="35"
			align="center"><b>게시물이 등록되었습니다.</b><br>
		<br>

		<div align="center">
			<img id = "viewBtn" src="${root}/img/board/b_wirtecf.gif" width="91" height="21"
				border="0" align="absmiddle" alt="작성한 글 확인" hspace="10">
			
			<img id = "listBtn" src="${root}/img/board/poll_listbu1.gif" width="62" height="21" 
				border="0" align="absmiddle" alt="목록보기" hspace="10">
		</td>
	</tr>
</table>
<br>
<%@ include file="/WEB-INF/views/commons/template/bottom.jsp"%>