<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<!-- Responsive Meta Tag -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- Adding Bootstrap CDN - Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<!-- Adding Font Awesome -->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
	<!-- Adding CSS -->
	<link rel="stylesheet" type="text/css" href="css/app.css">
	<title>OnlineTicket</title>
	<%@include file="component/allcss.jsp"%>
	<style type="text/css">
	
	* {
	box-sizing: border-box;
}


/* Main Home Banner and Input Search Container r*/
.home-banner {
	/* "../" for back to main folder */
	background-image: url("img/fifth.jpg");
	background-size: cover;
	background-repeat: round;
	height: 450px;
}

.input-search-container {
	position: absolute;
	top: 50%;
	left: 50%;
	right: 50%;
}

.inputIcon {
	position: absolute;
	left: 5px;
	font-size: 25px;
	vertical-align: middle;
	color: #AAA;
}

.inputForm {
	width: 225px;
	height: 40px;
	padding-left: 28px;
}

.inputLabel-default {
	position: absolute;
	left: 30px;
	color: grey;
	font-weight: 350;
	font-size: 15px;
	margin-top: 8px;
	transition-duration: 0.3s;
}
	.inputLabel-focusIn {
		position: absolute;
		left: 30px;
		color: #9b9b9b;
		font-size: 10px;	
		margin-top: 1px;
	}

/* Coupons Container */
.holiday-coupon-container {
	width: 540px;
	position: absolute;
	left: 30%;
	right: 30%;
	top: -4em;
}
	.holiday-coupon-container > .d-table-cell {
		height: 100px;
	}

/* Cashback Container */
.cashback-container > div {
	transition: transform .2s;
}
	.cashback-container > div:hover {
		transform: scale(1.05);
	}

/* Introducing On-Time Guarantee & Track My Bus Container
	& IOS/Android Container & We Promise To Deliver Container */
.on-time-guarantee,
.track-my-bus,
.ios-android-container .d-flex,
.we-promise-container > div:nth-child(2) {
	margin: 0 auto;
	max-width: 1200px;
}
	.track-my-bus .d-table-cell {
		height: 260px;
	}

/* Convenience On-The-Go IOS/Android Container */
.ios-android-container > div::after {
	content: "";
	background-image: url(https://i.postimg.cc/MK7ZzDzX/city-scape-app-download.png);
	opacity: 0.2;
	top: 0;
	left: 0;
	bottom: 0;
	right: 0;
	position: absolute;
	z-index: -1;
}
	
	</style>
</head>
<body>
	<%@include file="component/navbar.jsp"%>

	<!-- Main Home Banner and Input Search Container -->
	<div class="position-relative">
		<div>
			<div class="home-banner"><h1 style="color:white;text-align:center">Book Train</h1></div>
		</div>

		<div class="input-search-container">
			<form class="d-flex justify-content-center" action="booktrain" method="post">
				<div class="d-inline-block position-relative">
					<span class="inputIcon"><i class="far fa-building"></i></span>
					<label class="inputLabel-default" for="input-label-from">FROM</label>
					<input id="input-label-from" class="inputForm" type="text" list="input-from-list" name="from">
					<datalist id="input-from-list">
            <!-- <option value="Gurgaon"></option> -->
					</datalist>
				</div>

				<div class="d-inline-block position-relative">
					<span class="inputIcon"><i class="far fa-building"></i></span>
					<label class="inputLabel-default" for="input-label-to">TO</label>
					<input id="input-label-to" class="inputForm" type="text" list="input-to-list" name="to">
					<datalist id="input-to-list">
						<!-- <option value="Delhi"></option> -->
					</datalist>
				</div>

				<!-- <div class="d-inline-block position-relative">
					<span class="inputIcon"><i class="fas fa-calendar-alt"></i></span>
					<label class="inputLabel-default" for="input-label-onward-date">ONWARD DATE</label>
					<input id="input-label-onward-date" class="inputForm" type="text" name="odate">
				</div>

				<div class="d-inline-block position-relative">
					<span class="inputIcon"><i class="fas fa-calendar-alt"></i></span>
					<label class="inputLabel-default" for="input-label-return-date">RETURN DATE</label>
					<input id="input-label-return-date" class="inputForm" type="text" name="rdate">
				</div> -->

				<div class="d-inline-block position-relative">
					 <button type="submit" class="btn btn-danger">Search</button>
				</div>
			</form>
		</div>
	</div>

	<!-- Coupons Container -->
	<div class="position-relative">
		<div class="holiday-coupon-container bg-white p-2 shadow">
			<div class="float-left mr-4 ml-4">
				<img src="https://i.postimg.cc/XYxVCYGb/holiday.png" alt="holiday_coupon">
			</div>

			<div class="d-table-cell align-middle pl-2">
				<div class="lead font-weight-bold">SAVE UPTO RS 375 ON TRAIN TICKETS</div>
				<div class="text-muted">Use code "FIRST" while Booking first time</div>
			</div>
		</div>
	</div>
	
	<!-- Cashback Container -->
	<div class="cashback-container d-flex justify-content-center bg-light mb-5 pb-5 pt-5">
		
		<div class="text-center bg-white shadow m-3 p-2 pl-5 pr-5 mt-5">
			<div class="text-muted font-weight-bold small">Cashback up to Rs 275 on Train tickets.</div>
			<div><img src="https://i.postimg.cc/kg7JGb5s/holiday-cashback.png" alt="Train"></div>
			<div class="text-muted small">Limited Period Offer</div>
			<div class="font-weight-normal">Use code : CCDDEE</div>
		</div>
		
		<div class="text-center bg-white shadow m-3 p-2 pl-5 pr-5 mt-5">
			<div class="text-muted font-weight-bold small">Extra savings</div>
			<div><img src="img/t2.png" alt="Train"></div>
			<div class="text-muted small">Limited Period Offer</div>
			<div class="font-weight-normal">Use code : CCDDEE</div>
		</div>
		

		

		<div class="text-center bg-white shadow m-3 p-2 pl-5 pr-5 mt-5">
			<div class="text-muted font-weight-bold small">Cashback up to Rs 275 on Train tickets.</div>
			<div><img src="https://i.postimg.cc/d1htvc0K/amazon.png" alt="bus"></div>
			<div class="text-muted small">Pay using Amazon Pay</div>
			<div class="font-weight-normal">Limited Period Offer</div>
		</div>
	</div>

	<hr>

	<!-- We Promise To Deliver Container -->
	<div class="we-promise-container bg-light p-3 pb-5">
		<div class="text-center m-4">
			<img src="https://i.postimg.cc/QN5hqb9S/promise.png" alt="promise" width="85">
			<h2 class="text-dark m-2">WE PROMISE TO DELIVER</h2>
		</div>

		<div class="text-center d-flex">
			<div class="border bg-white w-25">
				<div class="p-4"><img src="https://i.postimg.cc/wMKHptPh/maximum-choices.png" alt="maximum_choices" width="120"></div>
				<div class="mb-5 m-4 font-weight-light lead">MAXIMUM CHOICE</div>
				<div class="m-4 p-1 text-muted">We give you the widest number of travel options across thousands of routes.</div>
			</div>

			<div class="border bg-white w-25">
				<div class="p-4"><img src="https://i.postimg.cc/Y2mqs7V6/customer-care.png" alt="customer_care" width="91"></div>
				<div class="mb-5 mt-4 font-weight-light lead">SUPERIOR CUSTOMER SERVICE</div>
				<div class="m-4 p-1 text-muted">We put our experience and relationships to good use and are available to solve your travel issues.</div>
			</div>

			<div class="border bg-white w-25">
				<div class="p-4"><img src="https://i.postimg.cc/JnHmv3Tr/lowest-Fare.png" alt="lowest_Fare" width="120"></div>
				<div class="mb-5 mt-4 font-weight-light lead">LOWEST PRICES</div>
				<div class="m-4 p-1 text-muted">We always give you the lowest price with the best partner offers.</div>
			</div>

			<div class="border bg-white w-25">
				<div class="p-4"><img src="https://i.postimg.cc/k4LMgYVR/benefits.png" alt="benefits" width="120"></div>
				<div class="mb-5 mt-4 font-weight-light lead">UNMATCHED BENEFITS</div>
				<div class="m-4 p-1 text-muted">We take care of your travel beyond ticketing by providing you with innovative and unique benefits.</div>
			</div>
		</div>
	</div>
	
	<%@include file="component/footer.jsp"%>

	<!-- Adding Bootstrap CDN - jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<!-- Adding Bootstrap CDN - Popper JS -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
	<!-- Adding Bootstrap CDN - Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<!-- Adding JavaScript -->
	<script type="text/javascript" src="js/app.js"></script>
	<script>
	
	/* Input Search From Focus-In/Out */
	$(".inputForm").focusin(function(){
		$(this).prev("label").addClass("inputLabel-focusIn");
	});

	// Input Search From Focus-Out */
	$(".inputForm").focusout(function(){
		var inputForm = $(this).val();

		if (inputForm.length > 0) {
			$(this).prev("label").addClass("inputLabel-focusIn");
		} else {
			$(this).prev("label").removeClass("inputLabel-focusIn");
		}
	});

	/* Input Onward/Reture Date Focus-In/Out */
	$("#input-label-onward-date, #input-label-return-date").focusin(function(){
		$(this).attr("type", "date");
	});

	// Input Onward/Reture Date Focus-Out */
	$("#input-label-onward-date, #input-label-return-date").focusout(function(){
		var inputFormDate = $(this).val();

		if (inputFormDate.length > 0) {
			$(this).attr("type", "date");
		} else {
			$(this).attr("type", "text");
		}
	});

	
	</script>
</body>
</html>