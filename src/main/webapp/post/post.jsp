<jsp:include page="../header.jsp" flush="true"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="container p">
		<div class="card border-secondary mb-3 py-3">
		  	<div class="card-header"><h4>${post.ptitle}</h4></div>
		  <div class="single-post">
		  		<div class="post-category">
		  		 	<b>
		  		 		<a href='category?id=<c:out value="${post.category.cid}"/>'><c:out value="${post.category.name}"/></a>
		  		 	</b>
		  		</div>
		  		<span>${post.date}</span>
			   <div class="post-tag">
				    Hashtags:
				   	 <c:forEach items="${post.hashtags}" var="tag">
				    	<a href='hashtag?name=<c:out value="${tag.name}"/>'> ${tag.name}</a>
				    </c:forEach>
			   </div>
				   <img src="data:image/jpg;base64,${post.image}" width="620" height="480"/>
				 <div class="post-control">
				   <button class="btn btn-sm btn-primary"><a href="editPost?pid=${post.pid}">Bearbeiten</a></button>
				     <button class="btn btn-sm btn-danger"><a href="deletePost?pid=${post.pid}">Loeschen</a></button>
				  </div>
		  		<p >${post.pcontent}</p>
		  </div>
		</div>
</div>
<jsp:include page="../footer.jsp" flush="true"/>