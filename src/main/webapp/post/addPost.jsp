<jsp:include page="../header.jsp" flush="true"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="addPost">
  <h4> Einen Post Hinzufuegen </h4>
	<form action="save"  method="POST" enctype="multipart/form-data">
	
		<div class="mb-3">
		  <label for="exampleFormControlInput1" class="form-label">Ueberschrift des Posts :</label>
		  <input type="text" class="form-control" name="ptitle" id="exampleFormControlInput1" placeholder="Geben Sie der Ueberschrift ein !!!..">
		</div>
		
		
		<div class="mb-3">
		<select class=" mb-3 " aria-label=".form-select example" name="category">
		 <option selected value="nichts" >------------ </option>
		 <c:forEach  var="category" items="${categories}">
		 	<option  value="${category.cid}"><c:out value="${category.name}"/></option>
		  </c:forEach>
		</select>
		</div>
		
		
		<div class="mb-3">
		  <label for="hashtag" class="form-label">Haschtag Eingabe :</label>
		  <input type="text" class="form-control"  name="hashtag" id="hashtag" placeholder="Geben Sie ein Haschtag ein !!">
		</div>
		
		<div class="mb-3">
		  <label for="file" class="form-label">Ein foto Hinzfuege:</label>
		  <input type="file" class="form-control" name="file" id="file" placeholder="Geben Sie ein Haschtag ein !!">
		</div>
		
		<div class="mb-3">
		  <label for="content" class="form-label">Example textarea</label>
		  <textarea class="form-control" name="pcontent" id="content" rows="3"></textarea>
		</div>
		<input type="hidden" value="<%=session.getAttribute("id") %>" name="user">
		<input type="Submit" class="form-control btn btn-success"  Value="Speichern">

	</form>
</div>