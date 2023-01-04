<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page isELIgnored="false"%>
<%@page import="com.dbcon.DBConnect" %> 
<%@page import="com.entity.User" %> 	
<%@page import="com.dao.UserDao" %> 


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style>.navbar {
  padding-top: 10px;
  padding-bottom: 10px;
}

/* navbar brand name */

.navbar-dark .navbar-brand {
  color: #ff305b;
  font-size: 24px;
}
.navbar-dark:hover .navbar-brand {
  color: #ff305b;
}

/* navbar toggler */

.navbar-dark .navbar-toggler {
  border: none;
  color: transparent;
}

/* active link */

.navbar-dark .navbar-nav .nav-link.active, .navbar-dark .navbar-nav .show>.nav-link {
  color: #ff305b;
}

/* navbar link */

.navbar-dark .navbar-nav .nav-link {
  color: #fff;
}

.navbar-dark .navbar-nav .nav-link:focus,
.navbar-dark .navbar-nav .nav-link:hover {
  color: #ff305b
}

/* media query extra small screen */

@media (max-width: 767px) {
  .navbar-dark .navbar-nav .nav-link {
    padding-top: 3px;
    padding-bottom: 3px;
}
}

/* dropdown menu */

.dropdown-menu {
  background-color: #333;
  border-top: 1px solid #ff305b;
  min-width: 200px;
}

.dropdown-menu .dropdown-item {
  color: #fff;
  padding: 7px 20px;
  transition: padding .5s ease;
  -webkit-transition: padding .5s ease;
  -moz-transition: padding .5s ease;
  -ms-transition: padding .5s ease;
  -o-transition: padding .5s ease;
}
.dropdown-menu .dropdown-item:focus,
.dropdown-menu .dropdown-item:hover {
  color: #fff;
  background-color: #ff305b;
  padding-left: 25px;
}
.dropdown-menu .dropdown-item.active,
.dropdown-menu .dropdown-item:active {
  color: #fff;
  background-color: #0d6efd;
}

.dropdown-menu .dropdown-divider {
  border-top: 1px solid #ff305b;
}</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container">
    <a class="navbar-brand" href="index.jsp"><i class="fa-solid fa-train"></i> QuickTicket</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
      
      <c:if test ="${empty userObj }">
      
      <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
        </li>
        
        
        <li class="nav-item">
        <a class="nav-link " aria-current="page" href="view_train.jsp">View Trains</a></li>
        
        <li class="nav-item">
          <a class="nav-link" href="feedback.jsp">Feedback</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link" href="contact.jsp">Contact</a>
        </li>
        
       <!--  <li class="nav-item">
          <a class="nav-link" href="user_login.jsp"><i class="fa-solid fa-right-to-bracket"></i>
            Login</a>
        </li> -->
      <div class="dropdown">
						<button class="btn btn-success dropdown-toggle" type="button"
							id="dropdownMenuButton1" data-bs-toggle="dropdown"
							aria-expanded="false">
							<i class="fa-solid fa-circle-user"></i> Sign up / Sign in
						</button>
						<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
							<li><a class="dropdown-item" href="register.jsp"  >Sign up</a></li>
							
							<li><a class="dropdown-item" href="user_login.jsp">Sign in</a></li>
						</ul>
					</div>
      
      </c:if>
      
                
        <c:if test="${not empty userObj }">
        
       
       
        				<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="view_train.jsp">View Trains</a></li>

						<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="book_train.jsp">Book Train</a></li>
						<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="feedback.jsp">Feedback</a></li>
						
						<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="query_form.jsp">Query</a></li>
						
						<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="contact.jsp">Contact</a></li>

					<div class="dropdown">
						<button class="btn btn-success dropdown-toggle" type="button"
							id="dropdownMenuButton1" data-bs-toggle="dropdown"
							aria-expanded="false">
							<i class="fa-solid fa-circle-user"></i> ${userObj.name }
						</button>
						<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
							<li><a class="dropdown-item" href="#!" data-bs-toggle="modal" data-bs-target="#profile-modal">profile</a></li>
							
							<li><a class="dropdown-item" href="userLogout">Logout</a></li>
						</ul>
					</div>
						<!-- Modal -->
						<div class="modal fade" id="profile-modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true" >
            <div class="modal-dialog" role="document">
                <div class="modal-content" style="background: linear-gradient(#141e30, #243b55); color:white;">
                    
                    	<div class="modal-body" style="color:white;">
                        	<div class="container text-center">
                        <i class="fa-regular fa-user" style="border-radius:50%;max-width: 150px;"></i>
                           
                            <br>
                            <h5 class="modal-title mt-3" id="exampleModalLabel"> ${userObj.name } </h5>
                            <!--//details-->

                            <div id="profile-details" >
                                <table class="table" style="color: #ff305b;">

                                    <tbody>
                                        <tr>
                                            <th scope="row"> ID :</th>
                                            <td> ${userObj.id }</td>

                                        </tr>
                                        <tr>
                                            <th scope="row">UserName :</th>
                                            <td>${userObj.name }</td>

                                        </tr>
                                        <tr>
                                            <th scope="row"> Email : </th>
                                            <td>${userObj.email }</td>

                                        </tr>
                                        <tr>
                                            <th scope="row">Phone :</th>
                                            <td>${userObj.phone }</td>

                                        </tr>
                                        <tr>
                                            <th scope="row">Age :</th>
                                            <td>${userObj.age }</td>

                                        </tr>
                                        
                                        
                                    </tbody>
                                </table>
                            </div>
                            <div id="profile-edit" style="display: none;">
                                <h3 class="mt-2">Please Edit Carefully</h3>
												<c:if test="${not empty sucMsg }">
													<p class="text-center text-success fs-3">${sucMsg}</p>
													<c:remove var="sucMsg" scope="session" />
												</c:if>

												<c:if test="${not empty errorMsg }">
													<p class="text-center text-danger fs-3">${errorMsg}</p>
													<c:remove var="errorMsg" scope="session" />
												</c:if>
												
									<form action="update" method="post" >
                                    <table class="table">
                                        <tr>
                                            <td>ID :</td>
                                            <td>${userObj.id }</td>
                                        </tr>
                                        <tr>
                                            <td style="color: #ff305b;">Name     :</td>
                                            <td> <input type="text" class="form-control" name="name" value="${userObj.name }" > </td>
                                        </tr>
                                         <tr>
                                            <td style="color: #ff305b;">Email :</td>
                                            <td style="color: white;">${userObj.email }</td>
                                        </tr>
                                        <tr>
                                            <td style="color: #ff305b;">Phone     :</td>
                                            <td> <input type="tel" class="form-control" name="phone" value="${userObj.phone }" > </td>
                                        </tr>
                                        <tr>
                                            <td style="color: #ff305b;">Password     :</td>
                                            <td> <input type="password" class="form-control" name="password" value="${userObj.password }" > </td>
                                        </tr>
                                        <tr>
                                            <td style="color: #ff305b;">Age     :</td>
                                            <td> <input type="text" class="form-control" name="age" value="${userObj.age }" > </td>
                                        </tr>
                                       

                                    </table>

                                    <div class="container">
                                        <button type="submit" class="btn btn-outline-primary" onSubmit="myFunc();">Save</button>
                                    </div>

                                </form>    

                            </div>
                            </div>
                            </div>
                             <div class="modal-footer">
	                        	<button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
	                        	<button  id="edit-profile-button" type="button" class="btn btn-success">EDIT</button>
	                        	
                    		</div>
						</div>
						</div>
						</div>
					</c:if>
        
      </ul>
    </div>
  </div>
</nav>
 		<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.0.1/sweetalert.min.js"></script> <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.0.1/sweetalert.min.css">
        <script src="js/myjs.js" type="text/javascript"></script>

        <script>
                                $(document).ready(function () {
                                    let editStatus = false;
                                    $('#edit-profile-button').click(function ()
                                    {
                                        if (editStatus == false)
                                        {
                                            $("#profile-details").hide()
                                            $("#profile-edit").show();
                                            editStatus = true;
                                            $(this).text("Back")
                                        } else
                                        {
                                            $("#profile-details").show()
                                            $("#profile-edit").hide();
                                            editStatus = false;
                                            $(this).text("Edit")
                                        }
                                    })
                                });
        </script>
        <script>
        
        myFunc(){
        	swal("Good job!", "You clicked the button!", "success");
        }
        
        </script>
</body>

</html>
