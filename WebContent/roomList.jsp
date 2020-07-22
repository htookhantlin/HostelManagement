<%@ include file="header_tag.jsp" %>
<jsp:include page="Reports.jsp">
	<jsp:param value="Room List" name="frmHeading"/>
</jsp:include>
<c:if test="${empty requestScope.RoomList}">
	<font color='red'>NO Room LIST</font>
</c:if>
<c:if test="${not empty requestScope.RoomList}">
	<table border="1" width="100%">
		<tr>
			<th>No</th><th>Name</th><th>Type</th><th>Floor</th>
		</tr>
		<c:forEach items="${requestScope.RoomList}" var="c" varStatus="s">
			<tr>
				<td>${s.index+1}</td>
				<td>${c.roomName}</td>
				<td>${c.roomType}</td>
				<td>${c.floor}</td>
			</tr>
		</c:forEach>	
	</table>
</c:if>