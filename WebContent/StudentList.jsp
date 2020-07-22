<%@ include file="header_tag.jsp" %>
<jsp:include page="Reports.jsp">
	<jsp:param value="Student List" name="frmHeading"/>
</jsp:include>
<c:if test="${empty requestScope.StudentList}">
	<font color='red'>NO Room LIST</font>
</c:if>
<c:if test="${not empty requestScope.StudentList}">
	<table border="1" width="100%">
		<tr>
			<th>No</th><th>Name</th><th>Phone</th><th>Gmail</th><th>Room Id</th>
		</tr>
		<c:forEach items="${requestScope.StudentList}" var="c" varStatus="s">
			<tr>
				<td>${s.index+1}</td>
				<td>${c.stdName}</td>
				<td>${c.stdPhno}</td>
				<td>${c.stdGmail}</td>
				<td>${c.roomId}</td>
			</tr>
		</c:forEach>	
	</table>
</c:if>