

<jsp:include page="adminHeader.jsp">
	<jsp:param value="Room" name="frmHeading" />
</jsp:include>
<form action="roomPath" method="post">
	<table border="0">
		<tr>
			<td>Enter Room Name:</td>
			<td><input type="text" name="roomName" /></td>
		</tr>
		<tr>
			<td>Choose Room type:</td>
			<td><select name="rooms" id="cars">
					<option value="Mixed">Mixed</option>
					<option value="Female">Female</option>
					<option value="Double">Double</option>
					<option value="Private">Private</option>
			</select></td>
		</tr>
		<tr>
			<td>Choose Floor :</td>
			<td><select name="floors" id="floors">
					<option value="First">First</option>
					<option value="Second">Second</option>
					<option value="Third">Third</option>
					<option value="Fourth">Fourth</option>
			</select></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit"
				value="Submit" /></td>
		</tr>
	</table>


</form>