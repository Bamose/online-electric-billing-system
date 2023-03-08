<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Online Electric Billing System</title>
    <link rel="stylesheet" href="style/on.css">
    <link rel="stylesheet" href="style/payment.css">
     <style>
  .container {
    background-color: #ffffff;
    padding: 30px;
    box-shadow: 0px 10px 20px rgba(0, 0, 0, 0.1);
    border-radius: 10px;
    text-align: center;
  }
  form {
    margin-bottom: 20px;
  }
  label {
    display: flex;
    flex-direction: column;
    align-items: center;
    margin-bottom: 20px;
  }
  input[type="text"] {
    padding: 10px;
    border-radius: 5px;
    border: none;
    margin-bottom: 20px;
  }
  input[type="submit"] {
    padding: 10px 20px;
    background-color: #00b0ff;
    color: #ffffff;
    border-radius: 5px;
    border: none;
    transition: all 0.3s ease-in-out;
  }
  input[type="submit"]:hover {
    background-color: #009eeb;
    cursor: pointer;
  }
  .kw {
    font-size: 14px;
    margin-top: 10px;
    color: #9e9e9e;
  }
  #space {
    margin-left: 10px;
  }
</style>
     
    <body>
        <section class="payment-heading">
            <header>
                <nav class="navbar">
                    <div class="container">
                        <div class="logo" id="logo">
                        <a class="navbar-brand" href="#">
                            <img src="img/logo.png" >
                        </a>
                        
                    </div>
            
                        <div class="collapse" id="head">
                            <ul class="navbar-nav ml-auto">
                                <li class="nav-item">
                                    <a class="nav-link" href="home.html">Home</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#about">About</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="payment.html">Payment</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#portfolio">Portfolio</a>
                                </li>
                                <!-- <li class="nav-item">
                                    <a class="nav-link" href="#team">Team</a>
                                </li> -->
                                <!-- <li class="nav-item">
                                    <a class="nav-link" href="#testimon">Testimonial</a>
                                </li> -->
                                <li class="nav-item">
                                    <a class="nav-link" href="#blog">Blog</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#contact">Contact</a>
                                </li>
                               <!--  <li class="nav-item">
                                    <a class="nav-link btn btn-primary btn-sm ml-lg-3" href="components.html">Components</a>
                                </li> -->
                            </ul>
                        
                        </div>
                        <div class="buttn">
                            <button class="btn">Login</button>
                            <button class="btn">Signup</button>
                        </div>
                    </div>
                </nav>
                </header>
            </section>
            

<section class="board">
    <div>
     
        <div class="banks">
            <div class="box-1">
                <h6>
                    Payment details
                </h6>
                <div class="colla" id="payent">
                    <ul class="">
                        <li class="nav-item">
                            Credit card
                        </li>
                        <li class="nav-item">
                        M-pesa
                        </li>
                        <li class="nav-item">
                        Crypto
                        </li>
						</ul>
                </div>
                <div class=" bank-list">
                    <div class="debit">
                        <div class="debit-list">
                            <img src="img/telebirr.png" alt="abisiniya">
                        </div>
                        <div class="debit-list">
                            <img src="img/abisiniya.jpg" alt="dashen">
                        </div>
                        <div class="debit-list">
                            <img src="img/dashin.jpg" alt="telebirr">
                        </div>
                    </div>
                    <div class="input-account">
                    <form action = "paid_customer" method = "POST">
                        <div class="list-partition">
                            
                                <label for="Credit card" id="label"> Credit card</label><br>
                                <input class="inputs" type="text" placeholder="Account number"><br>

                            
                        </div>
                        <div class="list-partition">
                            
                             	   
                                <label for="Payment Method" id="label">Payment Method</label><br>
                                <input class="inputs" type="text" placeholder="telebirr"><br>
                               
                            
                        </div>
                        <div class="list-partition">
                            
                                
                                <label for="p-number" id="label"> Phone Number</label><br>
                                <input class="inputs" type="text" placeholder="+251 number"><br>
                                
                          
                            
                        </div>
                         <div class="list-partition">
                          
                                
                                <label for="p-number" id="label"> Month</label><br>
                                <input class="inputs" type="month" placeholder="July" name="month" required/><br>
                                
                            
                            
                        </div>
                        
                        <div class="booking">
                            <div class="cancel-confirm">
                            
                                
                                <input class="confirm-btn" type="button" value="Confirm order" id="confirm">
                                
                            
                        </div>
                        
                            <div class="cancel-confirm">
                            
                                
                                <input class="cancel-btn" type="button" value="cancel order"  id="cancel">
                          
                        
                        </div>
                         
                        </div>
                         </form>
                        
                    </div>
                </div>
                </div>
                
            <div class="box-2">
            <div class="orders">
            <h6> 
               Order details
            </h6>
            </div>
            <form action = "calculation" method = "POST">
            <div class="package-grid">
                <div>
                    <img src="img/house.jpg" width="50px" height="50px">
                </div>
            <div id="package1" class = "package">
                
             <input type ="submit"  value = "Resident"  name ="resident">

            </div>
            <div>
                <img src="img/steel.jpg" width="50px" height="50px">
            </div>
            <div id="package2" class = "package">
                
            <input type ="submit"  value = "Industry"  name ="industry">

            </div>
            <div>
                <img src="img/edna.jpg" width="50px" height="50px" >
            </div>
            <div id ="package3" class = "package">
             <input type ="submit"  value = "commercial"  name ="commercial">
            </div>
            
           
            
            </div>
   </form>

<div class="container">
  <div class="row">
    <div class="col-md-12">
      <%
        String resident = request.getParameter("resident");
        String proceed = request.getParameter("proceed");
        String kwh = request.getParameter("Kwh");
        String o = resident + "hi";
        double result = 0.0;
        double tax = 0.0;
        double total = 0.0;
        double kw =0;
        if (o != null) {
      %>
      <form action ="calculation" method= "POST">
        <div class="form-group">
          <label for="Kwh">KWH</label>
          <input type="text" class="form-control" placeholder="100kw" id="Kwh" name="Kwh" required />
          <small class="form-text text-muted">1kwh = 0.2cent</small>
        </div>
        <input type="submit" class="btn btn-primary btn-md" value="proceed" name="proceed" />
      </form>
      <% 
        }
      %>
      <%     
        if (kwh != null) {
          kw = Double.parseDouble(request.getParameter("Kwh"));
          result = kw * 0.2;
          tax = result * 0.15;
          total = result + tax;
          
          String Total = "total";
          session.setAttribute("paid-amt", Total);
         
      %>
      <div class="table-responsive">
        <table class="table">
          <tbody>
            <tr>
              <td><strong>KWH</strong></td>
              <td><%= kw %></td>
            </tr>
            <tr>
              <td><strong>Result</strong></td>
              <td><%= result %></td>
            </tr>
            <tr>
              <td><strong>Tax</strong></td>
              <td><%= tax %></td>
            </tr>
            <tr>
              <td><strong>Total</strong></td>
              <td><%= total %></td>
            </tr>
          </tbody>
        </table>
      </div>
      <%
        }
        else {
        %>
      <%}%>
    </div>
  </div>

</div>







            
        </div>
        </div>
        </div>
    
    
</section>
<section>
    
</section>

<footer>
    <div class="container">
      <div class="row">
        <div class="col-md-4">
          <h3>About Us</h3>
          <p>The Ethiopian Electric Power (EEP) is a state-owned company engaged in the generation, transmission and distribution of electricity in Ethiopia.</p>
        </div>
        <div class="col-md-4">
          <h3>Contact Us</h3>
          <ul>
            <li>Address: Addis Ababa, Ethiopia</li>
            <li>Phone: +251 111 111 111</li>
            <li>Email: info@eep.com</li>
          </ul>
        </div>
        <div class="col-md-4">
          <h3>Social Media</h3>
          <ul class="social-icons">
            <li><a href="#"><i class="fa fa-twitter"></i></a></li>
            <li><a href="#"><i class="fa fa-facebook"></i></a></li>
            <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
          </ul>
        </div>
      </div>
    </div>
    <div class="copyright">
      <p>Copyright &copy;2022 Ethiopian Electric Power. All rights reserved.</p>
    </div>
  </footer>
  <script>

</script>
    </body>
    </head>
    </html>