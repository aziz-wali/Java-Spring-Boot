<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="header.jsp" flush="true"/>


<div class="container">
  <h2 class="text-center py-5">${posts[0].user.username}</h2>
 <hr class="separator"/>
  <div class="row">
	  <c:forEach  var="post" items="${posts}">
	          <div class="col-lg-5 post  card border-primary mb-3">
		            <div class="card-header"> <h3><a href="post?pid=${post.pid}"> <c:out value="${post.ptitle}"/></a></h3></div>
		       	  <b><a href='category?id=<c:out value="${post.category.cid}"/>'><c:out value="${post.category.name}"/></a></b>
		          <span> <c:out value="${post.date}"/></span>
		           <img src="data:image/jpg;base64,${post.image}" width="420" height="300"/>
		          Hashtags:<c:forEach items="${post.hashtags}" var="tag"><a href='hashtag?name=<c:out value="${tag.name}"/>'> ${tag.name}</a></c:forEach>
		          <p><c:out value="${post.pcontent}"/></p>
	        </div>
	     </c:forEach>
   </div>
 </div>
 <jsp:include page="footer.jsp" flush="true"/>