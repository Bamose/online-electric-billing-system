<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="css/login.css">
  </head>
  <body>
    
        <div class="logo">
            <img src="img/logo.png" >
        
    </div>
    <form action="Login" class="form">
      
      <div class="login-box">
 
  <div class="categories">
        <div class="category-choice">
        <input id ="choice" type="checkbox" placeholder="Residential" value="Residential" required/>
    </div>
    <div class="category-choice">
        <input id ="choice" type="checkbox"  placeholder="commercial" value="commercial" required/>
    </div>
    <div class="category-choice">
        <input id="choice" type="checkbox"  placeholder="Industry"value="Industry" required/>
    </div>
    </div>
    <div class="user-box">
      <input type="text" name="email" required="required">
      <label>Email</label>
    </div>
    <div class="user-box">
      <input type="password" name="" required="required">
      <label>Password</label>
    </div>
    <input type="submit" value="login" >
   
  
</div>
    </form>
  </body>
</html>
