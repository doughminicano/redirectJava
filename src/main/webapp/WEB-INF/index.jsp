<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="/TheCode/src/main/resources/static/css/style.css">
<head>
<meta charset="ISO-8859-1">
<title>tHE cODE</title>
</head>


<body>
<h1>WE LIVE BY THE CODE</h1>
<form action="/submit" method="POST">
  <div class="form-group row">
    <label for="inputEmail3" class="col-sm-2 col-form-label" >Good Luck!</label>
    <div class="col-sm-10">
      <input type="text" name="theCode" class="form-control" placeholder="What is the code? ${error}">
    </div>
  </div>
  <div class="form-group row">
    <div class="col-sm-10 offset-sm-2">
      <button type="submit" class="btn btn-primary">Try Code</button>
      
    </div>
  </div>
</form>



</body>
</html>