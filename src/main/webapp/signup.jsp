<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <link rel="stylesheet" type="text/css" href="css/signup.css">
  </head>
  <body>
    <form action="Signup" class="form">
        
      
       <div class="container">
  <div class="card">
      <a class="login">Signup</a>
        <div class="categories">
            <div class="category-choice">
            <input id ="choice" type="checkbox" placeholder="Residential" value="Residential" name="resident" />
            <label>Residential</label>
        </div>
        <div class="category-choice">
            <input id ="choice" type="checkbox" placeholder="Commercial" value="Commercial" name="commercial" />
             <label>Commercial</label>
        </div>
        <div class="category-choice">
            <input id="choice" type="checkbox" placeholder="" value="Industry" name="industry" /> <label>Industry</label>
        </div>
        </div>
      <div class="inputBox">
          <input type="text" name="uname" required="required">
          <span class="user">Username</span>
      </div>
      <div class="inputBox">
        <input type="text" name="cname" required="required">
        <span class="user">companyname</span>
    </div>
    <div class="inputBox">
      <input type="text" name="email" required="required">
      <span class="user">Email</span>
  </div>
  <div class="inputBox">
    <input type="text" name="phone" required="required">
    <span class="user">phonenumber</span>
</div>
<div class="inputBox">
  <input type="text" name="address" required="required">
  <span class="user">address</span>
</div>
<div class="inputBox">
  <input type="password" name="password" required="required">
  <span class="user">password</span>
</div>
     

    <input type="submit"  value="Signup" class="enter">

  </div>
</div>
    </form>
    <script>
    const checkboxes = document.querySelectorAll('.category-choice input[type=checkbox]');

    checkboxes.forEach(checkbox => {
      checkbox.addEventListener('change', () => {
        if (checkbox.checked) {
          checkboxes.forEach(cb => {
            if (cb !== checkbox) {
              cb.checked = false;
            }
          });
        }
      });
    });

		</script>
 </body>
</html>