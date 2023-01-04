<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>QuickTicket</title>
<link rel="stylesheet" href="component/style.css" type="text/css" />
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

<body style="align-items: center;">
<%@include file="component/navbar.jsp" %>
<div class="containe" >

    <form action="ticket" method="post" >

        <div class="row">

            <div class="col">

                <h3 class="title">payment</h3>

                <div class="inputBox">
                    <span>cards accepted :</span>
                    <img src="img/card_img.png" alt="">
                </div>
                <div class="inputBox">
                    <span>name on card :</span>
                    <input type="text" placeholder="mr. john deo">
                </div>
                <div class="inputBox">
                    <span>credit card number :</span>
                    <input type="number" placeholder="1111-2222-3333-4444">
                </div>
                <div class="inputBox">
                    <span>exp month :</span>
                    <input type="text" placeholder="january">
                </div>

                <div class="flex">
                    <div class="inputBox">
                        <span>exp year :</span>
                        <input type="number" placeholder="2022">
                    </div>
                    <div class="inputBox">
                        <span>CVV :</span>
                        <input type="text" placeholder="1234">
                    </div>
                </div>

            </div>
    
        </div>

        <input type="submit" value="pay" class="submit-btn" onclick="openPop()">

    </form>

</div>    
    
</body>
</html>