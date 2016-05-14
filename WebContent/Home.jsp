<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>
<head>
<style type="text/css">
	html, body
	{
		height: 100%;
	}
	
	body
	{
		margin: 0px;
		padding: 0px;
		background: #111111;
		font-family: 'Daniel', sans-serif;
		font-size: 12pt;
		font-weight: 200;
		color: #FFF;
	}
	
	
	h1, h2, h3
	{
		margin: 0;
		padding: 0;
	}
	
	p, ol, ul
	{
		margin-top: 0;
	}
	
	ol, ul
	{
		padding: 0;
		list-style: none;
	}
	
	p
	{
		line-height: 180%;
	}
	
	strong
	{
	}
	
	a
	{
		color: #ee0000;
	}
	
	a:hover
	{
		text-decoration: none;
	}
	
	.container
	{
		overflow: hidden;
		margin: 0em auto;
		width: 1200px;
	}
	
/********************************************************************************

*/
/* Image Style                                                                   

*/
/********************************************************************************

*/ 
	}

	.image
	{
		display: inline-block;
	}
	
	.image img
	{
		display: block;
		width: 100%;
	}
	
	.image-full
	{
		display: block;
		width: 100%;
		margin: 0 0 2em 0;
	}
	
	.image-left
	{
		float: left;
		margin: 0 2em 2em 0;
	}
	
	.image-centered
	{
		display: block;
		margin: 0 0 2em 0;
	}
	
	.image-centered img
	{
		margin: 0 auto;
		width: auto;
	}

/********************************************************************************

*/
/* List Styles                                                                   

*/
/********************************************************************************

*/

	ul.style1
	{
	}
	
	ol.actions
	{
		font-size: 22pt;
	}
	
	ul.actions li
	{
		display: inline-block;
		 font-weight: bold;
		padding: 0em 0.50em;
	}


/********************************************************************************

*/
/* Social Icon Styles                                                            

*/
/********************************************************************************

*/

	ul.contact
	{
		margin: 0;
		padding: 2em 0em 0em 0em;
		list-style: none;
	}
	
	ul.contact li
	{
		display: inline-block;
		padding: 0em 0.30em;
		font-size: 1em;
	}
	
	ul.contact li span
	{
		display: none;
		margin: 0;
		padding: 0;
	}
	
	ul.contact li a
	{
		color: #FFF;
	}
	
	ul.contact li a:before
	{
		display: inline-block;
		background: #3f3f3f;
		width: 40px;
		height: 40px;
		line-height: 40px;
		border-radius: 20px;
		text-align: center;
		color: #FFFFFF;
	}
	
	ul.contact li a.icon-twitter:before { background: #2DAAE4; }
	ul.contact li a.icon-facebook:before { background: #39599F; }
	ul.contact li a.icon-dribbble:before { background: #C4376B;	}
	ul.contact li a.icon-tumblr:before { background: #31516A; }
	ul.contact li a.icon-rss:before { background: #F2600B; }

/********************************************************************************

*/
/* Button Style                                                                  

*/
/********************************************************************************

*/

	.button
	{
		display: inline-block;
		padding: 1em 2em 1em 2em;
		letter-spacing: 0.10em;
		margin-top: 2em;
		padding: 1.40em 3em;
		border: 2px solid rgba(255,255,255,1);
		border-radius: 6px;
		text-decoration: none;
		font-weight: 700;
		font-size: 1em;
		color: #191919;
	}
	
	.button-alt
	{
		padding: 1em 2em;
		border-color: rgba(0,0,0,.8);
		color: rgba(0,0,0,.8);
	}
		
/********************************************************************************

*/
/* 4-column                                                                      

*/
/********************************************************************************

*/

	.box1,
	.box2,
	.box3,
	.box4
	{
		width: 235px;
	}
	
	.box1,
	.box2,
	.box3,
	{
		float: left;
		margin-right: 20px;
	}
	
	.box4
	{
		float: right;
	}
	
/********************************************************************************

*/
/* 3-column                                                                      

*/
/********************************************************************************

*/

	.boxA,
	.boxB,
	.boxC
	{
		width: 384px;
	}

	.boxA,
	.boxB
	{
		float: left;
		margin-right: 20px;
	}
	
	.boxC
	{
		float: right;
	}

/********************************************************************************

*/
/* 2-column                                                                      

*/
/********************************************************************************

*/

	.tbox1,
	.tbox2
	{
		width: 575px;
	}
	
	.tbox1
	{
		float: left;
	}

	.tbox2
	{
		float: right;
	}

	
/********************************************************************************

*/
/* Heading Titles                                                                

*/
/********************************************************************************

*/

	.title
	{
		margin-bottom: 3em;
	}
	
	.title h2
	{
		font-size: 2.7em;
	}
	
	.title .byline
	{
		font-size: 1.3em;
		color: rgba(255,255,255,0.60);
	}

/********************************************************************************

*/
/* Header                                                                        

*/
/********************************************************************************

*/

	#wrapper
	{
		position: absolute;
		left: 50%;
		padding: 5em 0em 7em 0em;
		background: #FFF;
	}

/********************************************************************************

*/
/* Header                                                                        

*/
/********************************************************************************

*/

	#header-wrapper
	{
		position: relative;
		padding: 5em 0em 7em 0em;
		background: #111111 url("${pageContext.request.contextPath}/image/homebeach.jpg") no-repeat center;
		background-size: cover;
	}

	#header
	{
		
		position: absolute;
		left: 525px;
		padding: 5em 0em;
	}

/********************************************************************************

*/
/* Logo                                                                          

*/
/********************************************************************************

*/

	#logo
	{
		position: absolute;
		top: 3.6em;
		left: 0;
	}
	
	#logo h1
	{
		font-size: 2.6em;
		color: #79C255;
	}
	
	#logo a
	{
		text-decoration: none;
		color: rgba(255,255,255,1);
	}

/********************************************************************************

*/
/* Menu                                                                          

*/
/********************************************************************************

*/

	#menu
	{
		position: absolute;
		top: 4.5em;
		right: 0;
	}
	
	#menu ul
	{
		display: inline-block;
	}
	
	#menu li
	{
		display: block;
		float: left;
		text-align: center;
	}
	
	#menu li a, #menu li span
	{
		padding: 1em 1.5em;
		letter-spacing: 1px;
		text-decoration: none;
		text-transform: uppercase;
		font-size: 0.8em;
		color: rgba(255,255,255,0.80);
	}
	
	#menu li:hover a, #menu li.active a, #menu li.active span
	{
	}
	
	#menu .active a
	{
		border: 2px solid rgba(255,255,255,1);
		border-radius: 6px;
		color: rgba(255,255,255,1);
	}
	
	#menu .icon
	{
	}

/********************************************************************************

*/
/* Banner                                                                        

*/
/********************************************************************************

*/

	#banner
	{
		padding-top: 10em;
		text-align: center;
	}
	
	#banner .title h2
	{
		font-size: 4em;
	}
	
	#banner .title .byline
	{
		font-size: 2em;
	}
	
	#banner .button
	{
		margin-top: 2em;
		padding: 1.40em 3em;
		border: 2px solid rgba(255,255,255,1);
		border-radius: 6px;
		font-weight: 700;
		font-size: 1em;
		
	}
	
	.banner
	{
		margin-bottom: 5em;
	}

/********************************************************************************

*/
/* Page                                                                          

*/
/********************************************************************************

*/

	#page
	{
	}

/********************************************************************************

*/
/* Content                                                                       

*/
/********************************************************************************

*/

	#content
	{
	}

/********************************************************************************

*/
/* Sidebar                                                                       

*/
/********************************************************************************

*/

	#sidebar
	{
	}

/********************************************************************************

*/
/* Footer                                                                        

*/
/********************************************************************************

*/

	#footer
	{
	}

/********************************************************************************

*/
/* Copyright                                                                     

*/
/********************************************************************************

*/

	#copyright
	{
		overflow: hidden;
		padding: 5em 0em;
		border-top: 1px solid rgba(0,0,0,0.08);
	}
	
	#copyright p
	{
		text-align: center;
		font-size: 1em;
		color: rgba(255,255,255,0.3);
	}
	
	#copyright a
	{
		text-decoration: none;
		color: rgba(255,255,255,0.6);
	}


/********************************************************************************

*/
/* Welcome                                                                       

*/
/********************************************************************************

*/

	#welcome
	{
		position: relative;
		padding: 7em 0em 7em 0em;
		background: #3d3f15;
		background-size: cover;
		text-align: center;
	}
	
	#welcome .container
	{
		width: 1000px;
		padding: 0px 100px;
		color: rgba(255,255,255,0.8);
	}
	
	#welcome a
	{
		color: rgba(255,255,255,1);
	}


/********************************************************************************

*/
/* Extra                                                                         

*/
/********************************************************************************

*/

	#three-column
	{
		text-align: center;
		color: rgba(0,0,0,0.6);
	}

	#three-column .fa
	{
		display: block;
		padding: 1em 0em;
		color: rgba(0,0,0,1);
		font-size: 2em;
	}
	
	#three-column .title h2
	{
		font-weight: bold;
		color: rgba(0,0,0,0.8);
	}

	#three-column .title .byline
	{
		text-align: center;
		color: rgba(0,0,0,.5);
	}


</style>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Home</title>
<meta name="keywords" content="" />
<meta name="description" content="" />



</head>
<body>
<p style="color:white; margin-left:1250px"><a href='demoSession'>Logout</a></p>
<div id="header-wrapper">
	<div id="header" class="container">
		<div id="logo">
			<h1><a href="#">Tour Planning</a></h1>
		</div>
	</div>
	<div id="banner" class="container">
		<div class="title">
			<h2>Plan your Trip</h2>
		</div>
		<ul class="actions">
			<li><a href="Place.jsp" class="button">Create Your Trip</a></li>
			<li><a href="selectCombo.jsp" class="button">Select Combo</a></li>
		</ul>
	</div>
</div>
<div id="copyright" class="container">
	<p>Project developed by Nishant Tyagi, Piyush Garg, Pranjal Katlana, Shreyash Agarwal, Tarush Bhanote</p>
</div>
</body>
</html>
