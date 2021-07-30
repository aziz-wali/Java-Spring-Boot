
<jsp:include page="../header.jsp" flush="true"/>
<div class="reg text-center">
	<h3 class="float-left">Registration</h3>

	<form action="registration" method="POST">
		 <div class="form-group py-3">
		<input type="text" class="form-control" name="username" placeholder="Username" required>
		</div>
	
	
		<div class="form-group">
		<input type="text" class="form-control" name="first_name" placeholder="Vorname " required>
		</div>
	
	    <div class="form-group">
		<input type="text" class="form-control" name="last_name" placeholder="Nachname " required>
		</div>
	
	 	<div class="form-group">
		<input type="email" class="form-control" name="email" placeholder="Email " required>
		</div>
	
		 <div class="form-group">
		<input type="password" class="form-control" name="password" placeholder="Password " required>
		</div>
	
		<input type="submit" value="Speichern" class="btn btn-success form-control "><br>
    </form>
</div>
<jsp:include page="../footer.jsp" flush="true"/>