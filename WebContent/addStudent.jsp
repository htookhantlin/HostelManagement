<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ include file="header_tag.jsp"%>
<%@ page import="com.hkl.dao.*"%>
<%@ page import="com.hkl.model.*"%>
<%@ page import="java.util.List"%>
<jsp:include page="adminHeader.jsp">
	<jsp:param value="PROUDCT" name="frmHeading" />
</jsp:include>

<form action="studentPath" method="post">
	<table border="0">
		<tr>
			<td>Enter Name:</td>
			<td><input type="text" name="stdName" /></td>
		</tr>
		<tr>
			<td>Choose Rooms:</td>
			<td><select name="stdRooms">
					<option value="0">Select</option>
					<%
						RoomDao roomDao = new RoomDao();
						List<Room> l = roomDao.selectAllRoom();
						System.out.println(l.get(0).getRoomName());
						for (Room r : l) {
					%>
					<option value="<%=r.getRoomId() %>"><%= r.getRoomName() %></option>
					<%
						}
					%>
					
			</select></td>
		</tr>
		<tr>
			<td>Enter Phone Number:</td>
			<td><input type="text" name="stdPh" /></td>
		</tr>
		<tr>
			<td>Enter Gmail:</td>
			<td><input type="text" name="stdGmail" /></td>
		</tr>

		<tr>
			<td colspan="2" align="center"><input type="submit"
				value="Submit" /></td>
		</tr>
	</table>


</form>