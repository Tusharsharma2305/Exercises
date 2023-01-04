<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>QuickTicket</title>
<script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<%@include file="component/allcss.jsp" %>
<link rel="stylesheet" href=https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/v4-font-face.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<style>

@import url('https://fonts.googleapis.com/css2?family-Poppins:wght@200;300;400;500;600;700;800;900&display-swap');
*
{   
    margin: 0;
    padding: 0; 
    box-sizing: border-box; 
    font-family: 'Poppins', sans-serif;    
    
}
.contact 
{
    margin-right:auto;
    position: relative;
    min-height: 100vh; 
    padding: 50px 100px;
    display: flex; 
    justify-content: center;
    align-items: center;
    flex-direction: column;
    background: url("img/qimg.jpg");
    background-size: cover;
}
.head{
    font-size: 50px;
    font-style:initial;
    margin-bottom: 40px;
    color: brown;
}
.queries{
    font-size: 25px;
    color:#e91e63;
    margin-inline-end: auto;
}
.queries .question1{
    font-size: 30px;
    color:black;
}
.contact .content h2
{
    font-size: 36px;
    font-weight: 500;
    color: rgb(19, 18, 18);
}
.contact .content p
{
    font-weight: 300;
    color: rgb(10, 9, 9);
}
.container
{
    width: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
    margin-top: 30px;
    margin-bottom: 30px;
}
.container .contactInfo
{
    width: 50%;
    display: flex;
    flex-direction:column;
}
.container.contactInfo .box
{
    position: relative;
    padding: 20px 0;
    display: flex;
}
.container .contactInfo .box .icon
{
    min-width: 60px;
    height: 60px;
    background: rgb(161, 109, 31);
    display: flex;
    justify-content: center;
    align-items: center;
    border-radius: 50%;
    font-size: 22px;
}
.container .contactInfo .box .text 
{
    display: flex; 
    margin-left: 20px;
    font-size: 16px;
    color: rgb(11, 1, 30);
    flex-direction: column;
    font-weight: 300;
} 
.container .contactInfo .box .text h3 
{
    font-weight: 500;
    color: #00bcd4;
}
.contactForm
{
    width: 40%;
    padding: 40px;
    background:#FFE4C4;
    margin-top: 30px;
}

.contactForm h2
{
    font-size: 30px;
    color: #333;
    font-weight: 500;
}
.contactForm .inputBox
{
    position: relative;
    width: 100%;
    margin-top: 10px;
}
.contactForm .inputBox input,
.contactForm .inputBox textarea
{
    width: 100%;
    padding: 5px 0;
    font-size: 16px;
    margin: 10px 0;
    border: none;
    border-bottom: 2px solid rgb(197, 15, 15);
    outline: none;
    resize: none;
}
.contactForm .inputBox span
{
    position:absolute; 
    Left: 0;
    padding: 5px 0;
    font-size: 16px;
    margin: 10px 0;
    pointer-events: none;
    transition: 0.5s;
    color: rgb(12, 2, 2);
}
.contactForm .inputBox input:focus ~ span,
.contactForm .inputBox input:valid ~ span, 
.contactForm .inputBox textarea:focus ~span,
.contactForm .inputBox textarea:valid ~span
{
    color: #e91e63; 
    font-size: 12px;
    transform: translateY(-20px);
}
.contactForm .inputBox input[type="submit"]
{
    width: 100px;
    background: #00bcd4;
    color: rgb(21, 21, 200);
    border:none;
    cursor: pointer;
    padding: 10px;
    font-size: 18px;
}
@media (max-width: 991px)
{
    .contact
    {
        padding: 50px;
    }
    .container    
    {
    flex-direction: column;    
    }
    .container .contactInfo
    {    
        margin-bottom: 40px;
    }
    .container .contactInfo,
    .contactform
    {
        width: 100%;
    }
}

</style>
</head>
<body>
<%@include file="component/navbar.jsp" %>
    <section class="contact">
       <u> <h3 class="head" style="color: white">Feedback Form</h3></u>
                <div class="contactForm">
                    <form action="#" method="post">
                        <h2><center><u>Feedback </h2></center></u>
                        <div class="inputBox">
                            <input type="text" name="required="required"> 
                            <span>Full Name</span>
                        </div>
                        <div class="inputBox">
                            <input type="text" name="" required="required">
                            <span>Email</span>
                        </div>
						
						<div class="inputBox">
                            <input type="text" name="" required="required">
                            <span>Phone</span>
                        </div>
                        <div class="inputBox">
                            <textarea required="required"></textarea>
                            <span>feedback</span>
                        </div>
						<p>**Rate Your Experience</p>
						<br>
						<input type="radio" name="rate" value="bad">Excellent
<input type="radio" name="rate" value="good">Good
<input type="radio" name="rate" value="average">Average
<input type="radio" name="rate" value="bad">Bad
                        <div class="inputBox">
                            <button  onclick="testfun()">Send</button>
                        </div>
                    </form>
             </div>
        </div>
    </section>
</body>
<script>

function testfun(){
	Swal.fire(
			'Good job!',
			  'Thank you!',
			  
			  'success'
			)
}




</script>
</html>