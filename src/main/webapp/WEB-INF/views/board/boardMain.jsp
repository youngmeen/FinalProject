<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%-- <%@ page session="false"%> --%>

<%@ include file="../includes/header.jsp"%>
<%@ include file="../includes/mainSideBar.jsp"%>


<div class="main-content">
	<section class="section">
		<h1 class="section-header">
			<div>Board</div>
		</h1>
	</section>

	<!-- 이곳에 메인화면 디자인 하면 됩니다. -->
	<div class="panel-body">
		<table width="50%"
			class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th>#번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>수정일</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1</td>
					<td>gg</td>
					<td>gg</td>
					<td>gg</td>
					<td>gg</td>
				</tr>
			</tbody>
		</table>

	</div>
</div>

<%@ include file="../includes/footer.jsp"%>