
<jsp:include page="../header.jsp" flush="true"/>

<div class="addPost">
<h4>EditPost</h4>
<form action="update?id=${post.pid}"  method="POST" enctype="multipart/form-data">
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Ueberschrift des Posts :</label>
  <input type="text" class="form-control" name="ptitle" id="exampleFormControlInput1" value="${post.ptitle}">
</div>


<div class="mb-3">
<select class=" mb-3 " aria-label=".form-select example" name="category">
  <option  value="nichts" >Suchen Sie Ein Kategorie aus </option>
  <option value="nachrichten">Nachrichten</option>
  <option value="sport">Sport</option>
  <option value="wirtschaft">Wirtschaft</option>
  <option value="anderes">anderes</option>
</select>
</div>


<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Haschtag Eingabe :</label>
  <input type="text" class="form-control" name="tag" id="exampleFormControlInput1" value='
  <c:forEach items="${post.hashtags}" var="tag">
				    	<c:out value="${tag.name}"/>
				    </c:forEach>
  
  '>
</div>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Ein Bild auswaehlen :</label>
  <input type="file" class="form-control" name="file" id="exampleFormControlInput1" placeholder="">
</div>
<div class="mb-3">
  <label for="exampleFormControlTextarea1" class="form-label">Example textarea</label>
  <textarea class="form-control" name="pcontent" id="exampleFormControlTextarea1" rows="3" >${post.pcontent}</textarea>
</div>
<input type="Submit" class="form-control btn btn-success"  Value="Speichern">

</form>
</div>