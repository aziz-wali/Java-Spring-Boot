<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../header.jsp" flush="true"/>
<h1>Index seite</h1>
<div class="suche-form text-center">
<form action="" method="post">

<input type="text" name="search" value="" placeholder="wonach suchen Sie ?">
<button>Suchen</button>
</form>
<%=session.getAttribute("first_name") %>
<jsp:include page="post/posts.jsp" flush="true"/>
<hr class="separator">

<%@ include file="../footer.jsp" %>