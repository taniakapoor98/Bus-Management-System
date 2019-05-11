<%-- 
    Document   : staff
    Created on : 1 Apr, 2019, 10:36:13 AM
    Author     : amrik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8" />
  <link rel="shortcut icon" href="download.png" type="image/png" sizes="16x16">
  
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

  <title>
  Staff
  </title>
  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <!--     Fonts and icons     -->
  <link rel="stylesheet" type="text/css" href="./myproject/css/style_drop.css" />
  <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700' rel='stylesheet' type='text/css' />
<script type="text/javascript" src="./myproject/js/modernizr.custom.79639.js"></script>
<noscript><link rel="stylesheet" type="text/css" href="./myproject/css/noJS.css" /></noscript> 
  <link rel="stylesheet" href="./myproject/assets/css/new.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
  <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">

  <!-- CSS Files -->
  <link href="./myproject/assets/css/bootstrap.min.css" rel="stylesheet" />
  <link href="./myproject/assets/css/now-ui-kit.css?v=1.2.0" rel="stylesheet" />
  
  <!-- CSS Just for demo purpose, don't include it in your project -->
  <link href="./myproject/assets/demo/demo.css" rel="stylesheet" />
  <link rel="stylesheet" href="./myproject/assets/css/style.css">
  <link rel="stylesheet" href=".\myproject\assets\css\slider_staff.css">
  
</head> 


<body class="index-page sidebar-collapse">
        <div class="page-header clear-filter" filter-color="orange">
                
           
                <div class="page-header-image" data-parallax="true" style="background-image:url('./myproject/assets/img/img_4831.jpeg');  height: 100%;width:100%;"></div>
                  
               
                <div > <br><br><br><br>
                <h1 class="h1-seo" style="text-align:center;" top="40%">Choose a task</h1> </div>
                <div class="xop-sec">
                        <ul class="xop-grid">
                          <li>
                            <div class="xop-box xop-img-1">
                                <a href="Create.html" style="text-decoration:none;color: white;">
                                <h3>CREATE</h3>
                                <p>Create bus schedule</p>
                              </a>
                            </div>
                          </li>
                          <li>
                             <div class="xop-box xop-img-2">
                                <a href="View.html" style="text-decoration:none;color: white;">
                                 <h3>VIEW</h3>
                                 <p >View bus schedule</p>
                               </a>
                             </div>
                           </li>
                           <li>
                               <div class="xop-box xop-img-3">
                                    <a href="Change.jsp" style="text-decoration:none;color: white;" >
                                   <h3 style="color:white;">CHANGE</h3>
                                   <p>Modify a bus schedule</p>
                                 </a>
                               </div>
                             </li>
                             <li>
                                 <div class="xop-box xop-img-4">
                                        <a href="Delete.jsp" style="text-decoration:none;color: white;">
                                     <h3>DELETE</h3>
                                     <p>Delete a bus schedule</p>
                                   </a>
                                 </div>
                               </li>
                        </ul> 
                     
                      </div>>
                         </div>
              </div>
              
              
  <!-- Navbar -->

  <nav class="navbar navbar-expand-lg bg-primary fixed-top navbar-transparent " color-on-scroll="400">
      <span class="open-slide">
          <a href="#" onclick="openSlideMenu()">
            <svg width="30" height="30">
                <path d="M0,5 30,5" stroke="#fff" stroke-width="2"/>
                <path d="M0,14 30,14" stroke="#fff" stroke-width="2"/>
                <path d="M0,23 30,23" stroke="#fff" stroke-width="2"/>
            </svg>
          </a>
        </span>
        <div id="side-menu" class="side-nav">
          <a href="#" class="btn-close" onclick="closeSlideMenu()">&times;</a>
          <a href="my.html">Home</a>
          <a href="./myproject/about.html">About</a>
          <a href="./myproject/services.html">Services</a>
          <a href="./myproject/contact.html">Contact</a>
        </div>
     
    <div class="container">
      <div class="navbar-translate">
       
       
        <a class="navbar-brand" href="./myproject/about.html" rel="tooltip"  data-placement="bottom" target="_blank" style="font-size: 15px;">
           About Us
        </a>
      
        
        <button class="navbar-toggler navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-bar top-bar"></span>
          <span class="navbar-toggler-bar middle-bar"></span>
          <span class="navbar-toggler-bar bottom-bar"></span>
        </button>
      </div>
  
         
      <div class="collapse navbar-collapse justify-content-end" id="navigation" data-nav-image="./myproject/assets/img/blurred-image-1.jpg">
        
        <ul class="navbar-nav">
          
          <li class="nav-item">
            <a class="nav-link " data-toggle="modal" href="#my_mod2">
      
            <p style="font-size: 15px;">SIGN UP</p>
          </a>
        </li>
          <li class="nav-item dropdown">
            <a href="#" class="nav-link dropdown-toggle" id="navbarDropdownMenuLink1" data-toggle="dropdown">
            
              <p style="font-size: 15px;">Routes</p>
            </a>
            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink1">
              <a class="dropdown-item" target="_top" href="./myproject/mohali.html">
                <i class="now-ui-icons design_bullet-list-67"></i> Mohali
              </a>
              <a class="dropdown-item" target="_top" href="./myproject/pkl.html">
                <i class="now-ui-icons design_bullet-list-67"></i> Punchkula
              </a>
              <a class="dropdown-item" target="_blank" href="./myproject/chd.html" target="_top">
                <i class="now-ui-icons design_bullet-list-67"></i> Chandigarh
              </a>
            </div>
          </li>
         
          <li class="nav-item">
            <a class="nav-link" rel="tooltip" title="Follow us on Twitter" data-placement="bottom" href="https://twitter.com" target="_blank">
              <i class="fab fa-twitter" sizes="16x16"></i>
              <p class="d-lg-none d-xl-none" >Twitter</p>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" rel="tooltip" title="Like us on Facebook" data-placement="bottom" href="https://www.facebook.com" target="_blank">
              <i class="fab fa-facebook-square"></i>
              <p class="d-lg-none d-xl-none">Facebook</p>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" rel="tooltip" title="Follow us on Instagram" data-placement="bottom" href="https://www.instagram.com/kapoortania00" target="_blank">
              <i class="fab fa-instagram"></i>
              <p class="d-lg-none d-xl-none">Instagram</p>
            </a>
          </li>
        </ul>
      </div>
    </div>
    
  </nav>

  <!--nav ends-->
   <!-- Modal -->
   <div class="modal fade" style="background-blend-mode: luminosity;" id="my_mod2" role="dialog">
        
    <div class="modal-dialog" >
       
      <!-- Modal content-->
      <div class="modal-content"style="background-color:lightpink; opacity:.99;">
        
        <div class="modal-header" >   
            <button type="button" class="title-up" id="close_1" style="align-content: right;align-items: right;" data-dismiss="modal">&times;</button>        
        </div>
        <div >
          
       
     
                <form class="form" method="" action="./myproject/my.html#pablo">
                    <div class=" text-center">
                       
                      <h3 class="card-title title-up" style="color:black">Sign Up</h3>
                      <div class="social-line">
                        <a href="#pablo" class="btn btn-neutral btn-facebook btn-icon btn-round">
                          <i class="fab fa-facebook-square"></i>
                        </a>
                        <a href="#pablo" class="btn btn-neutral btn-twitter btn-icon btn-lg btn-round">
                          <i class="fab fa-twitter"></i>
                        </a>
                        <a href="#pablo" class="btn btn-neutral btn-google btn-icon btn-round">
                          <i class="fab fa-google-plus"></i>
                        </a>
                      </div>
                    </div>
                    <div class="card-body">
                      <div class="input-group no-border">
                        <div class="input-group-prepend">
                          <span class="input-group-text">
                            <i class="now-ui-icons users_circle-08"></i>
                          </span>
                        </div> 
                        <input type="text" class="form-control" placeholder="Username..." required>
                      </div>
                      <div class="input-group no-border">
                        <div class="input-group-prepend">
                          <span class="input-group-text">
                            <i class="now-ui-icons ui-1_email-85" style="font-size:16px;"></i>
                          </span>
                        </div>
                        <input type="text" placeholder="Email" class="form-control" required/>
                      </div>
                      <div class="input-group no-border">
                        <div class="input-group-prepend">
                          <span class="input-group-text">
                            <i class="fa fa-lock "></i>
                          </span>
                        </div>
                        <input type="password" class="form-control" placeholder="Password" required>
                      </div>
                      <div class="input-group no-border">
                        <div class="input-group-prepend">
                          <span class="input-group-text">
                            <i class="material-icons" style="font-size:16px;">format_list_bulleted</i>
                          </span>
                        </div>
                       
          
            
                            <div id="dd" class="wrapper-dropdown-2" style="background-color: rgb(240, 238, 238);width:92%;" tabindex="1">
                              <span>Login as</span>
                              <ul class=" dropdown">
                                <li><a href="#" id="m1" style="color:black;" onhover="drop_col()">Student</a></li>
                                <li><a href="#" style="color:black;">Staff</a></li>
                                <li><a href="#" style="color:black;">Admin</a></li>
                              </ul>
                            </div>
                       
                    
      
                      </div>
                      <!-- <div class="checkbox">
                    <input id="checkboxSignup" type="checkbox">
                      <label for="checkboxSignup">
                      Unchecked
                      </label>
                    </div> -->
                    </div>
                    <div class="card-footer text-center" style="background-color:rgb(191, 228, 243);">
                      <input type="submit" class="btn btn-neutral btn-round btn-lg"  />
                    </div>
                  </form>
        </div>
      
      </div>
      
    <!--   Core JS Files   -->
    <script src="./myproject/assets/js/core/jquery.min.js" type="text/javascript"></script>
    <script src="./myproject/assets/js/core/popper.min.js" type="text/javascript"></script>
    <script src="./myproject/assets/js/core/bootstrap.min.js" type="text/javascript"></script>
    <!--  Plugin for Switches, full documentation here: http://www.jque.re/plugins/version3/bootstrap.switch/ -->
    <script src="./myproject/assets/js/plugins/bootstrap-switch.js"></script>
    <!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->
    <script src="./myproject/assets/js/plugins/nouislider.min.js" type="text/javascript"></script>
    <!--  Plugin for the DatePicker, full documentation here: https://github.com/uxsolutions/bootstrap-datepicker -->
    <script src="./myproject/assets/js/plugins/bootstrap-datepicker.js" type="text/javascript"></script>
    <!--  Google Maps Plugin    -->
    <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
    <!-- Control Center for Now Ui Kit: parallax effects, scripts for the example pages etc -->
    <script src="./myproject/assets/js/now-ui-kit.js?v=1.2.0" type="text/javascript"></script>
    <script type="text/javascript" src=".\myproject\assets\js\particles.js"></script>
    <script type="text/javascript" src=".\myproject\assets\js\app.js"></script>
    <script>
      $(document).ready(function() {
        // the body of this function is in assets/js/now-ui-kit.js
        nowuiKit.initSliders();
      });
  
      function scrollToSign() {
  
        if ($('.section-signup').length != 0) {
          $("html, body").animate({
            scrollTop: $('.section-signup').offset().top
          }, 1000);
        }
      }
  
      $(document).ready(function(){
          openLoginModal();
      });
      function closeSlideMenu(){
        document.getElementById('side-menu').style.width = '0px';
        
      }
      function openSlideMenu(){
        document.getElementById('side-menu').style.width = '200px';
       /* document.getElementById('main').style.marginLeft = '200px';*/
      }
      function DropDown(el) {
				this.dd = el;
				this.placeholder = this.dd.children('span');
				this.opts = this.dd.find('ul.dropdown > li');
				this.val = '';
				this.index = -1;
				this.initEvents();
			}
			DropDown.prototype = {
				initEvents : function() {
					var obj = this;

					obj.dd.on('click', function(event){
						$(this).toggleClass('active');
						return false;
					});

					obj.opts.on('click',function(){
						var opt = $(this);
						obj.val = opt.text();
						obj.index = opt.index();
						obj.placeholder.text(obj.val);
					});
				},
				getValue : function() {
					return this.val;
				},
				getIndex : function() {
					return this.index;
				}
			}

			$(function() {

				var dd = new DropDown( $('#dd') );

				$(document).click(function() {
					// all dropdowns
					$('.wrapper-dropdown-2').removeClass('active');
				});

      });
    
    </script>
  </body>
  
  </html>
