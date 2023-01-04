<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.dbcon.DBConnect" %> 	
<%@page import="java.sql.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>QuickTicket</title>
<%@include file="component/allcss.jsp"%>
<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
.card-counter{
   /*  box-shadow: 2px 2px 10px #DADADA; */
    margin: 5px;
    padding: 20px 10px;
    background-color: #fff;
    height: 100px;
    border-radius: 5px;
    transition: .3s linear all;
  }



  .card-counter .count-numbers{
    position: absolute;
    right: 35px;
    top: 20px;
    font-size: 32px;
    display: block;
  }

  .card-counter .count-name{
    position: absolute;
    right: 35px;
    top: 65px;
    font-style: italic;
    text-transform: capitalize;
    opacity: 0.5;
    display: block;
    font-size: 18px;
  }
</style>
<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
</head>
<body>
	
	<%@include file="component/navbar.jsp"%>
	
	
	<div id="carouselExampleCaptions" class="carousel slide"
		data-bs-ride="carousel">
		<div class="carousel-indicators">
			<button type="button" data-bs-target="#carouselExampleCaptions"
				data-bs-slide-to="0" class="active" aria-current="true"
				aria-label="Slide 1"></button>
			<button type="button" data-bs-target="#carouselExampleCaptions"
				data-bs-slide-to="1" aria-label="Slide 2"></button>
			<button type="button" data-bs-target="#carouselExampleCaptions"
				data-bs-slide-to="2" aria-label="Slide 3"></button>
		</div>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="img/fourth.jpg" class="d-block w-100" alt="..."
					height="500px">
				<div class="carousel-caption d-none d-md-block">
					<h2>WELCOME TO THE ONLINE TICKETING PLATFORM</h2>
					<p>This is World's Largest platform for online railway tickets</p>
				</div>
			</div>
			<div class="carousel-item">
				<img src="img/second.jpg" class="d-block w-100" alt="..."
					height="500px">
				<div class="carousel-caption d-none d-md-block">
					<h2>WELCOME TO THE ONLINE TICKETING PLATFORM</h2>
					<p>This is World's Largest platform for online railway tickets</p>
				</div>
			</div>
			<div class="carousel-item">
				<img src="img/third.jpg" class="d-block w-100" alt="..."
					height="500px">
				<div class="carousel-caption d-none d-md-block">
					<h2>WELCOME TO THE ONLINE TICKETING PLATFORM</h2>
					<p>This is World's Largest platform for online railway tickets</p>
				</div>
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span>

		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span>

		</button>
	</div>
	<div class="container p-3">
	<h3 class="text-center fs-2 "><span>Key Features of our Platform</span></h3>
		

		<div class="row">
			<div class="col-md-8 p-5">
				<div class="row">
					<div class="col-md-6">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">100% Data Safety</p>
								<p>We ensure our users that their data is totally Secured.</p>
							</div>
						</div>
					</div>
					<div class="col-md-6">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">Fast</p>
								<p>Our Portal is faster then others.</p>
							</div>
						</div>
					</div>
					<div class="col-md-6 mt-2">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">24 x 7 Service</p>
								<p>You can access our portal from Anywhere and Anytime.</p>
							</div>
						</div>
					</div>
					<div class="col-md-6 mt-2">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">Extra Offers</p>
								<p>We Provide Extra Offers on ticket booking</p>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="col-md-4 p-5 ">
				<img alt="" src="img/1.jpg" style="width: 150%; height: 100%">
			</div>
		</div>
	</div>
	
	
	<hr>


	<div class="container">
	<h3 class="text-center fs-2 "><span>Why book from our platform</span></h3>
		<div class="row">
			<div class="col-md-3">
				<div class="card-counter">
					<img alt="" src="img/t1.png">
					
				</div>
			</div>

			<div class="col-md-3">
				<div class="card-counter">
					<img alt="" src="img/t2.png">
					
				</div>
			</div>

			<div class="col-md-3">
				<div class="card-counter">
					<img alt="" src="img/t5.png">
					
				</div>
			</div>

			<div class="col-md-3">
				<div class="card-counter">
					<img alt="" src="img/t4.png">
						
				</div>
			</div>
		</div>
	</div>
	<br><br>
	<br>
	<hr>
	<%@include file="component/footer.jsp"%>
	
	<%-- <% Connection con = Conn.getConnection(); %>  --%>
	
	
</body>
</html>