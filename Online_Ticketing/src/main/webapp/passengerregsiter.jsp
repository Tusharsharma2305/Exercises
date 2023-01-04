<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Online Ticket</title>
<style>.containe{
 
  justify-content: center;
  align-items: center;
  padding:25px;
  min-height: 80vh;
  
}

.containe form{
  padding:20px;
  width:700px;
  background: #fff;
  box-shadow: 0 5px 10px rgba(93, 92, 92, 0.1);
}

.containe form .row{
  display: flex;
  flex-wrap: wrap;
  gap:15px;
}

.containe form .row .col{
  flex:1 1 250px;
}

.containe form .row .col .title{
  font-size: 20px;
  color:rgb(7, 5, 5);
  padding-bottom: 5px;
  text-transform: uppercase;
}

.containe form .row .col .inputBox{
  margin:15px 0;
}

.containe form .row .col .inputBox span{
  margin-bottom: 10px;
  display: block;
}

.containe form .row .col .inputBox input{
  width: 100%;
  border:1px solid #ccc;
  padding:10px 15px;
  font-size: 15px;
  text-transform: none;
}

.containe form .row .col .inputBox input:focus{
  border:1px solid #000;
}

.containe form .row .col .flex{
  display: flex;
  gap:15px;
}

.containe form .row .col .flex .inputBox{
  margin-top: 5px;
}

.containe form .row .col .inputBox img{
  height: 34px;
  margin-top: 5px;
  filter: drop-shadow(0 0 1px #000);
}

.containe form .submit-btn{
  width: 50%;
  padding:12px;
  font-size: 17px;
  background: #02893a;
  color:#fff;
  margin-top: 5px;
  cursor: pointer;
}

.containe form .submit-btn:hover{
  background: #014d20;
}</style>

<%@include file="component/allcss.jsp" %>
</head>
<body>
<%@include file="component/navbar.jsp" %>
<div class="containe">

    <form action="Register" method="post">
    
        <h3 class="title"> Ticket Booking</h3>
         <div class="row">
         
             <div class="col">
               <div class="inputBox">
                    <span>Full name :</span>
                    <input type="text" placeholder="john deo" name="fullname">
                </div>
                <div class="inputBox">
                    <span>Phone Number :</span>
                    <input type="number" placeholder="xxxxxxxxxx" name="phno">
                </div>
                <div class="inputBox">
                    <span>Address :</span>
                    <input type="text" placeholder="Agra" name="address">
                </div>
               <div class="inputBox">
                    <span>Coupan:</span>
                   <input type="text" placeholder="" name="coupan">
               </div>
                
              </div>
              
              <div class="col">
              
               <div class="inputBox">
                    <span>Aadhaar Card :</span>
                   <input type="number" placeholder="xxxx-xxxx-xxxx" name="aadharnumber">
               </div>
                <div class="inputBox">
                    <span>Travel Date:</span>
                   <input type="date" placeholder="01/01/2022" name="tdate">
               </div>
               <div class="inputBox">
                    <span>Return Date:</span>
                   <input type="date" placeholder="01/01/2022" name="rdate">
               </div>
                
                <div style="margin-top:50px; width: 100%;padding:10px 15px;font-size: 15px;text-transform: none;">
                
                <a style="text-decoration:none;" href="payment.jsp" class="submit-btn">Proceed to Payment</a>
                
                </div>
              </div>
               

            
       </div>
     
               
    </form>
    <a href="AddPassenger.jsp" style="text-align:center;" >
       <button>Add more passenger</button>
       </a>

</div>  

    
</body>
</html>