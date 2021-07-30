<%@ include file="../header.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<section class="ftco-section">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-6 text-center mb-5">
				
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-md-6 col-lg-4">
					<div class="login-wrap py-5">
					<div class="img d-flex align-items-center justify-content-center" style="background-image:url(images/xbg.jpg.pagespeed.ic.3DwAHJh7F3.webp)"></div>
					${SPRING_SECURITY_LAST_EXCEPTION.message}
					<h3 class="py-5 mb-0">Login</h3>
					<form action="login" method="POST" class="login-form">
						<div class="form-group">
							<input type="text" class="form-control" name="username" placeholder="Username" required>
						</div>
						<div class="form-group">
							<input type="password" class="form-control" name="password" placeholder="Password" required>
						</div>
						<div class="form-group">
						
						</div>
						
						<div class="form-group d-md-flex">
							<div class="w-100 text-md-right">
								<a href="#">Forgot Password</a>
							</div>
						</div>
						<div class="form-group">
						<button type="submit" class="btn form-control btn-success rounded submit px-3">Get Started</button>
						</div>
					</form>
					<div class="w-100 text-center mt-4 text">
						<p class="mb-0">Don't have an account?</p>
						<a href="registr">Sign Up</a>
					</div>
			</div>
		 </div>
			</div>
		</div>
</section>
<%@ include file="../footer.jsp" %>