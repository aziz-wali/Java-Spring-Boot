${user.username}


<jsp:include page="header.jsp" flush="true"/>

<div class="addPost">
<h4>EditPost</h4>
<form action="updateUser?id=${user.id}"  method="POST" enctype="multipart/form-data">
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Username :</label>
  <input type="text" class="form-control" name="username" id="exampleFormControlInput1" value="${user.username}">
</div>



<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Vorname :</label>
  <input type="text" class="form-control" name="first_name" id="exampleFormControlInput1" value="${user.first_name}">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Nachname :</label>
  <input type="text" class="form-control" name="last_name" id="exampleFormControlInput1" value="${user.last_name}">
</div>
<div class="mb-3">
  <label for="exampleFormControlInput1" class="form-label">Nachname :</label>
  <input type="file" class="form-control" name="file" id="exampleFormControlInput1" value="">
</div>
<input type="Submit" class="form-control btn btn-success"  Value="Speichern">

</form>
</div>