<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 


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
		text-align: center;
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

<title>Admin</title>
</head>
<body>

<h1> ${index}</h1>
<h1>GRAND CIRCUS COFFEE ADMIN PAGE</h1>

<table border="1">
	<tr>
	    <th>PLU#</th>
	    <th>Coffee</th>
	    <th>Roast</th>
	    <th>Pounds in Stock</th>
	    <th>Price per Pound</th>
	    <th></th>
	    <th></th>
	</tr>
	<c:forEach var="item" items="${products}"> 
		<tr>
			<td> ${ item.item_id }</td>
			<td> ${ item.name }</td>
			<td> ${ item.description }</td>
			<td> ${ item.quantity }lb.</td>
			<td> $${ item.price }</td>
			<td><a href="/item/${item.item_id}/edit">Edit</a></td>
			<td><a href="/item/${item.item_id}/delete" onclick="return confirm('Are you sure?');">Delete</a></td> <%-- TODO: implement Delete option in Controller--%>
		</tr>
	</c:forEach>
</table>


<%-- TODO: implement Add A New Item option in Controller--%>
<a class="btn btn-secondary" href="item/create">Add a new Item</a>

</body>
</html>