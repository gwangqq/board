<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/commons/template/top.jsp"%>
<style>
<!-- 
.menulist{width :230px;}

.category{
	padding: 5px 10px;
	cursor: pointer;
	position: relative;
	fon-weight: bold;
	text-align: left;
	background-color: rgb(40,100,100);
}

.menu{
	display: none;
	text-align: left;
}

.menu a {
	display: block;
	color: rgb(100,40,100);
	background-color: rgb(40,140,140);
	padding: 10px;
	text-decoration: none;
}

.memnu a:hover{
	color: black;
	text-decoration: underline;
}
-->
</style>
<script>
$(document).ready(function() {
	$("#boardmenu p.category").click(function() {
		$(this).next("div.menu").slideDown(500).siblings("div.menu").slideUp("fast");
	});
});
</script>

<div class = "menulist" id = "boardmenu">
	<c:set var="idx" value="0"/>
	<c:forEach varStatus="i"  var ="board" items="${boardmenu}">
		<c:if test="${idx != board.ccode}">
		<p class = "category">${board.cname}</p>
		<c:set var="idx" value = "${board.ccode}"/> 
		<div class = "menu">
		</c:if>
		
		<a href="${root}/${board.control}/write?bcode=${board.bcode}&pg=1&key=&word=">
		${board.bname}
		</a>
		<c:if test="${i.index < boardmenu.size() -1 }">
			<c:if test="${idx != boardmenu.get(i.index+1).ccode}">
			</div>
			</c:if>
		</c:if>
	</c:forEach>
	</div>
</div>

<%@ include file="/WEB-INF/views/commons/template/bottom.jsp"%>