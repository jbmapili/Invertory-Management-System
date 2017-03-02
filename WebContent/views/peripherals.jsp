
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
	<div align=center>
		<table class="table borderless" id="tableCompUnit">
			<tr>
				<td class="label-right">Unit No.</td>
				<td>
					<%
						String unitNo = request.getParameter("unitNo");

						if (unitNo == null || unitNo == "") {
							out.print("<div class=input-group>");
							out.print("<input type=text class=form-control id=txtUnitNo disabled=disabled>");
							out.print("<span class=\"input-group-btn\">");
							out.print("	<button class=\"btn btn-secondary\" type=button");
							out.print("		data-toggle=modal data-target=#myUnitModal");
							out.print("		id=btnUnitSearch onclick=\"searchUnit()\">");
							out.print("		<span class=\"glyphicon glyphicon-search\"></span>");
							out.print("	</button>");
							out.print("</span></div>");
						} else {
							out.print("<input type=text class=form-control id=txtUnitNo value=" + unitNo + " disabled=disabled>");
						}
					%> <jsp:include page="/views/modals/unitModal.jsp"></jsp:include>
				</td>
				<td class="label-right">Serial No.</td>
				<td><input type="text" id="txtSerialNo" class="form-control" disabled="disabled" value="${a}"/></td>
			</tr>
			<tr>
				<td class="label-right">Unit Name</td>
				<td><input type="text" id="txtUnitName" class="form-control" disabled="disabled" value="${a}"/></td>
				<td class="label-right">Brand</td>
				<td><input type="text" id="txtBrand" class="form-control" disabled="disabled" value="${a}"/></td>
			</tr>
			<tr>
				<td class="label-right">Tag Number</td>
				<td><input type="text" id="txtTagNumber" class="form-control" disabled="disabled" value="${a}"/></td>
				<td class="label-right">Model</td>
				<td><input type="text" id="txtModel" class="form-control" disabled="disabled" value="${a}"/></td>
			</tr>
			<tr>
				<td class="label-right">Type</td>
				<td><input type="text" id="txtType" class="form-control" disabled="disabled" value="${a}"/></td>
				<td class="label-right">Color</td>
				<td><input type="text" id="txtColor" class="form-control" disabled="disabled" value="${a}"/></td>
			</tr>
			<tr>
				<td class="label-right">IP Address</td>
				<td><input type="text" id="txtIpAddress" class="form-control" disabled="disabled" value="${a}"/></td>
				<td class="label-right">Location</td>
				<td><input type="text" id="txtLocation" class="form-control" disabled="disabled" value="${a}"/></td>
			</tr>
			<tr>
				<td class="label-right">Assignee</td>
				<td><input type="text" id="txtAssignee" class="form-control" disabled="disabled" value="${a}"/></td>
				<td class="label-right">Status</td>
				<td><input type="text" id="txtStatus" class="form-control" disabled="disabled" value="${a}"/></td>
			</tr>
		</table>
		<table class="table table-striped table-bordered" id="tableRecord">
			<thead>
				<tr>
					<th>No</th>
					<th>Peripheral Type</th>
					<th>Tag Number</th>
					<th>Brand / Model</th>
					<th>Serial No.</th>
					<th>Acquired Date</th>
					<th>Description</th>
				</tr>
			</thead>
			<tbody id="body">
				<c:forEach var="peripheral" items="${peripherals}">
					<tr>
						<td>${peripheral.peripheralNo}</td>
						<td>${peripheral.peripheralType}</td>
						<td>${peripheral.tagNumber}</td>
						<td>${peripheral.brand} ${peripheral.model}</td>
						<td>${peripheral.serialNo}</td>
						<td>${peripheral.acquiredDate}</td>
						<td>${peripheral.description}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<jsp:include page="/views/spinner.jsp"></jsp:include>
		<div class="btn-group border" id="pagination" align="right"></div>
		<table class="table borderless" id="tableInput">
			<tr>
				<td class="label-right">Peripheral No.</td>
				<td><input type="text" id="ptxtPeripheralNo" class="form-control" readonly="readonly"></td>
				<td></td>
				<td class="label-right">Serial No.</td>
				<td><input type="text" id="ptxtSerialNo" class="form-control" maxlength="6"></td>
				<td></td>
			</tr>
			<tr>
				<td class="label-right">Peripheral Type</td>
				<td><input type="text" id="ptxtPeripheralType" class="required form-control" maxlength="100"></td>
				<td></td>
				<td class="label-right">Brand</td>
				<td><input type="text" id="ptxtBrand" class="form-control" maxlength="200"></td>
				<td></td>
			</tr>
			<tr>
				<td class="label-right">Tag Number</td>
				<td><input type="text" id="ptxtTagNumber" class="form-control" maxlength="100"></td>
				<td></td>
				<td class="label-right">Model</td>
				<td><input type="text" id="ptxtModel" class="form-control" maxlength="200"></td>
				<td></td>
			</tr>
			<tr>
				<td class="label-right">Acquired Date</td>
				<td><input type="text" id="pdtAcquiredDate" class="form-control" placeholder="MM/DD/YYYY"></td>
				<td></td>
				<td class="label-right">Color</td>
				<td><input type="text" id="ptxtColor" class="form-control" maxlength="100"></td>
				<td></td>
			</tr>
			<tr>
				<td class="label-right">Description</td>
				<td><input type="text" id="ptxtDescription" class="form-control" maxlength="1000"></td>
				<td></td>
				<td class="label-right">User ID</td>
				<td><input type="text" id="ptxtUserId" class="form-control" disabled="disabled"></td>
				<td></td>
			</tr>
			<tr>
				<td class="label-right">Remarks</td>
				<td><input type="text" id="ptxtRemarks" class="form-control" maxlength="1000"></td>
				<td></td>
				<td class="label-right">Last Update</td>
				<td><input type="text" id="pdtLastUpdate" class="date form-control" placeholder="MM/DD/YYYY" disabled="disabled"></td>
				<td></td>
			</tr>
			</tbody>
		</table>
		<table class="table borderless">
			<tr>
				<td align="right"><input type="button" id="btnAdd" value="Add" class="btn btn-primary" onclick="addPeripherals()" disabled="disabled"></td>
				<td><input type="button" id="btnDelete" value="Delete" class="btn btn-primary" disabled="disabled" onclick="deleteRecord()"></td>
			</tr>
			<tr>
				<td align="right"><input type="button" id="btnSave" value="Save" class="btn btn-primary" onclick="insertPeripherals()"></td>
				<td><input type="button" id="btnCancel" value="Cancel" class="btn btn-primary"></td>
			</tr>
		</table>
	</div>