<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="dec"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<c:url value="/css/simple.css" var="ss"/>
<link rel="STYLESHEET" type="text/css"
	href="${ss}" />
<dec:head />
</head>
<body>
	<table style="width: 100%">
		<tr>
			<td>
				<div>
					<dec:body />
				</div>
			</td>
		</tr>
	</table>
	
	<!-- ======== Footer ======== -->
				<div id="footer" align="center">
				  <hr>
					<small> &copy; ISS NUS SA42 2016 </small>
				</div>
</body>
</html>
