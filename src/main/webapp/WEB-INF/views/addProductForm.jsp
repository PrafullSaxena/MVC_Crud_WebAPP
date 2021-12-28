<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<%@include file="./base.jsp"%>

</head>
<body>

	<div>
		<div class="card">
			<div class="card-body">Please Enter Product Details.</div>
		</div>

		<form action="addToDB" method="post">
			<div class="form-group">
				<label for="exampleFormControlInput1">Product Name</label> <input
					type="text" class="form-control" id="exampleFormControlInput1"
					placeholder="Product Name" name="name">
			</div>

			<div class="form-group">
				<label for="exampleFormControlInput1">Product Name</label> <input
					type="text" class="form-control" id="exampleFormControlInput1"
					placeholder="Product Description" name="productDesc">
			</div>

			<div class="form-group">
				<label for="exampleFormControlInput1">Email address</label> <input
					type="number" class="form-control" id="exampleFormControlInput1"
					placeholder="Price" name="price">
			</div>

			<div class="container text-center">
				<a href="${pageContext.request.contextPath}/"
					class="btn btn-outline-danger"}>Back</a>
					<button type="submit" class="btn btn-primary">Add</button>
			</div>
			

		</form>

	</div>
</body>
</html>