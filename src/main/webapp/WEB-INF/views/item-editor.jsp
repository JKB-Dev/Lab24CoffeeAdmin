<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link href="https://fonts.googleapis.com/css?family=Vidaloka" rel="stylesheet">   
<link href="https://fonts.googleapis.com/css?family=Zilla+Slab" rel="stylesheet"> 
<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet"> 

<link rel="stylesheet" type="text/css" href="src/main/resources/static/css/style.css">

<style>
	
	body {
		background-image: linear-gradient(to bottom right, #f4f4f4, white);
		align-content: center;
		padding-left: 50px;
		padding-right: 50px;
		position: relative; 
		}
		
	a {
	    background-color: #c0b283;
	    -webkit-border-radius: 5px;
	    border-radius: 5px;
	    color: white;
	    padding: 12px 32px;
	    text-align: center;
	    text-decoration: none;
	    display: block;
	    font-family: 'Zilla Slab', serif;
	    font-size: 20px;
		}
	
	p {
		font-family: 'Zilla Slab', serif;
		font-size: 24px;
		margin-bottom: 10px;
		margin-top: 20px;
		}
	
	h1 {
		font-size: 60px;
		font-family: 'Vidaloka', serif;
		color: #c0b283;
		font-style: oblique;
		margin-bottom: 20px;
		}
		
	h2 {
		font-family: 'Vidaloka', serif;
		color: #383838;
		margin-bottom: -30px;
		font-weight: 20;
	}	
		
	table {
	    margin-top: 10px;
	    border-collapse: collapse;
	    width: 100%;
		}
	
	th {
		font-family: 'Zilla Slab', serif;
		font-style: bold;
		color: white;
		background-color: #383838;
		}

	th, td {
	    text-align: left;
	    padding: 8px;
	}
	
	tr:nth-child(even){
		background-color: #f2f2f2
		}
		
	form {
		font-family: 'Open Sans', sans-serif;
		font-size: 30px;
	}	
	
	input[type=text] {
	    padding:5px; 
	    border:2px solid #ccc; 
	    -webkit-border-radius: 5px;
	    border-radius: 5px;
		}
	
	
	input[type=submit] {
	    margin-top: 20px;
	    background-color: #c0b283;
	    border: 5px;
	    -webkit-border-radius: 5px;
	    border-radius: 5px;
	    color: white;
	    padding: 12px 32px;
	    text-align: center;
	    text-decoration: none;
	    display: inline-block;
	    font-family: 'Zilla Slab', serif;
	    font-size: 20px;
		}
			
</style>

<title>Item Edit</title>
</head>
<body>

	<div class="container">
		<h1>${ title }</h1>
		
		<form method="post">
			<div class="form-group">
			    <label for="name">Name</label>
			    <input class="form-control" id="name" name="name" value="${item.name}" required="required" minlength="2" autocomplete="off">
			</div>
			<div class="form-group">
			    <label for="description">Description</label>
			     <input class="form-control" id="category" name="category" value="${item.description}" required="required" minlength="2">
			</div>
			<div class="form-group">
			    <label for="quantity">Quantity</label>
			   <input class="form-control" id="description" name="description" value="${item.quantity}" required="required" minlength="3" autocomplete="off">
			</div>
			<div class="form-group">
			    <label for="price">Price</label>
			   <input class="form-control" id="description" name="description" value="${item.price}" required="required" minlength="3" autocomplete="off">
			</div>
			<button type="submit" class="btn btn-link">Submit</button>
			 <a href="/" class="btn btn-link">Cancel</a>
		</form>
	</div>

</body>
</html>