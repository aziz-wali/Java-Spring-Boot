<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap.css">
<link rel="stylesheet" href="style.css">
<link href="//netdna.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600' rel='stylesheet' type='text/css'>
</head>
<body>

	<div class="header-top ">
		<div class="container">
			<div class="support top">Support Email: aziz.waly6@gmail.com</div>
			<div class"register-login top"><a href="#">Register</a> Oder <a href="#">einloggen</a></div>
	    </div>
	</div>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container">
    <a class="navbar-brand" href="/posts ">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
	        <li class="nav-item">
	          <a class="nav-link active" aria-current="page" href="#">Profile</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link active" aria-current="page" href="benutzer.jsp">Benutzer</a>
	        </li>
	        <li class="nav-item">
	          <a class="nav-link" href="about.jsp">About</a>
	        </li>
	        <li class="nav-item dropdown">
		          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		            Kategorien
		          </a>
	          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
	            <li><a class="dropdown-item" href="#">Nachrichten</a></li>
	            <li><a class="dropdown-item" href="#">Sport</a></li>
	            <li><a class="dropdown-item" href="#">Technologie</a></li>
	            <li><hr class="dropdown-divider"></li>
	            <li><a class="dropdown-item" href="#">Sonstiges</a></li>
	          </ul>
	        </li>
	      
   			 <li class="nav-item">
	        
	         </li>
	        <li class="nav-item">
	          <a class="nav-link " href="addPost" tabindex="-1" aria-disabled="true">Hinzufuegen</a>
	        </li>
	         <li class="nav-item">
	          <a class="nav-link " href="/posts" tabindex="-1" aria-disabled="true">Show</a>
	        </li>
      </ul>
      
      
    </div>
    <%if(session.getAttribute("username")!=null &&session.getAttribute("username")!="anonymousUser"){ %>
    <div style="float:right;">
     <img src="data:image/jpg;base64,<%=session.getAttribute("image")%>" style="width:50px; height=50px; border-radius:50%"/>
    <a class="nav-link " href="login" tabindex="-1" aria-disabled="true"><%=session.getAttribute("username")%></a>
      <a class="nav-link " href="logout" tabindex="-1" aria-disabled="true">Logout</a>
    
    <%}else{%>
    <a class="nav-link " href="login" tabindex="-1" aria-disabled="true">Login</a>
    </div>
    <%}%>
  </div>
</nav>