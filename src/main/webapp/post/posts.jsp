<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="../header.jsp" flush="true"/>

<div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block w-100" src="/images/n.jpg" alt="First slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="/images/n1.jpg" alt="Second slide">
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="/images/japan.jpg" alt="Third slide">
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>


<div class="container">
 <h1 class="text-center"> Posts</h1>
 <hr class="separator"/>
  <div class="row">
	  <c:forEach  var="post" items="${posts}">
	          <div class="col-lg-5 post  card border-primary mb-3">
		          <div class="card-header"><h3><a href="post?pid=${post.pid}"> <c:out value="${post.ptitle}"/></a></h3></div>
		       <b><a href='category?id=<c:out value="${post.category.cid}"/>'><c:out value="${post.category.name}"/></a></b>
		          <span> <c:out value="${post.date}"/></span>
		          <b>Autor :<a href='user?id=<c:out value="${post.user.id}"/>'><c:out value="${post.user.username}"/></a></b>
		   
		           <img src="data:image/jpg;base64,${post.image}" width="420" height="300"/>
		           <div class="hashtags">
		        	<b>Hashtags:</b><br><c:forEach items="${post.hashtags}" var="tag"><span><a href='hashtag?name=<c:out value="${tag.name}"/>'> ${tag.name} &nbsp;</a> </span> </c:forEach>
		          </div>
		          <p><c:out value="${post.pcontent}"/></p>
	        </div>
	     </c:forEach>
   </div>
   
	<div class="elementor-container elementor-column-gap-default">
		<div class="elementor-column elementor-col-20 elementor-top-column elementor-element elementor-element-911e759 ce-animation-start" data-id="911e759" data-element_type="column">
		<div class="elementor-widget-wrap elementor-element-populated">
		<div class="elementor-element elementor-element-576f2c6 elementor-widget elementor-widget-image ce-animation-start" data-id="576f2c6" data-element_type="widget" data-widget_type="image.default">
		<div class="elementor-widget-container">
		<img width="50" height="45" src="https://preview.codeless.co/livecast/default/wp-content/uploads/2021/04/icon1.png" class="attachment-large size-large" alt="" loading="lazy"> </div>
		</div>
		<div class="elementor-element elementor-element-21bdad6 elementor-widget elementor-widget-heading ce-animation-start" data-id="21bdad6" data-element_type="widget" data-widget_type="heading.default">
		<div class="elementor-widget-container">
		<h2 class="elementor-heading-title elementor-size-default">Top</h2> </div>
		</div>
		</div>
		</div>
		<div class="elementor-column elementor-col-20 elementor-top-column elementor-element elementor-element-7926834 ce-animation-start" data-id="7926834" data-element_type="column">
		<div class="elementor-widget-wrap elementor-element-populated">
		<div class="elementor-element elementor-element-ed4ef44 elementor-widget elementor-widget-image ce-animation-start" data-id="ed4ef44" data-element_type="widget" data-widget_type="image.default">
		<div class="elementor-widget-container">
		<img width="57" height="41" src="https://preview.codeless.co/livecast/default/wp-content/uploads/2021/04/icon2.png" class="attachment-large size-large" alt="" loading="lazy"> </div>
		</div>
		<div class="elementor-element elementor-element-3105220 elementor-widget elementor-widget-heading ce-animation-start" data-id="3105220" data-element_type="widget" data-widget_type="heading.default">
		<div class="elementor-widget-container">
		<h2 class="elementor-heading-title elementor-size-default">Health</h2> </div>
		</div>
		</div>
		</div>
		<div class="elementor-column elementor-col-20 elementor-top-column elementor-element elementor-element-cdb6ac4 ce-animation-start" data-id="cdb6ac4" data-element_type="column">
		<div class="elementor-widget-wrap elementor-element-populated">
		<div class="elementor-element elementor-element-7e02d7f elementor-widget elementor-widget-image ce-animation-start" data-id="7e02d7f" data-element_type="widget" data-widget_type="image.default">
		<div class="elementor-widget-container">
		<img width="53" height="43" src="https://preview.codeless.co/livecast/default/wp-content/uploads/2021/04/icon3.png" class="attachment-large size-large" alt="" loading="lazy"> </div>
		</div>
		<div class="elementor-element elementor-element-1852b23 elementor-widget elementor-widget-heading ce-animation-start" data-id="1852b23" data-element_type="widget" data-widget_type="heading.default">
		<div class="elementor-widget-container">
		<h2 class="elementor-heading-title elementor-size-default">Travel</h2> </div>
		</div>
		</div>
		</div>
		<div class="elementor-column elementor-col-20 elementor-top-column elementor-element elementor-element-b80ad41 ce-animation-start" data-id="b80ad41" data-element_type="column">
		<div class="elementor-widget-wrap elementor-element-populated">
		<div class="elementor-element elementor-element-87d041e elementor-widget elementor-widget-image ce-animation-start" data-id="87d041e" data-element_type="widget" data-widget_type="image.default">
		<div class="elementor-widget-container">
		<img width="50" height="47" src="https://preview.codeless.co/livecast/default/wp-content/uploads/2021/04/icon4.png" class="attachment-large size-large" alt="" loading="lazy"> </div>
		</div>
		<div class="elementor-element elementor-element-886210d elementor-widget elementor-widget-heading ce-animation-start" data-id="886210d" data-element_type="widget" data-widget_type="heading.default">
		<div class="elementor-widget-container">
		<h2 class="elementor-heading-title elementor-size-default">Food</h2> </div>
		</div>
		</div>
		</div>
		<div class="elementor-column elementor-col-20 elementor-top-column elementor-element elementor-element-d8813f5 ce-animation-start" data-id="d8813f5" data-element_type="column">
		<div class="elementor-widget-wrap elementor-element-populated">
		<div class="elementor-element elementor-element-2e4210f elementor-widget elementor-widget-image ce-animation-start" data-id="2e4210f" data-element_type="widget" data-widget_type="image.default">
		<div class="elementor-widget-container">
		<img width="52" height="44" src="https://preview.codeless.co/livecast/default/wp-content/uploads/2021/04/icon5.png" class="attachment-large size-large" alt="" loading="lazy"> </div>
		</div>
		<div class="elementor-element elementor-element-ddc42b7 elementor-widget elementor-widget-heading ce-animation-start" data-id="ddc42b7" data-element_type="widget" data-widget_type="heading.default">
		<div class="elementor-widget-container">
		<h2 class="elementor-heading-title elementor-size-default">Tech</h2> </div>
		</div>
		</div>
		</div>
	</div>
   
</div>
 <jsp:include page="../footer.jsp" flush="true"/>