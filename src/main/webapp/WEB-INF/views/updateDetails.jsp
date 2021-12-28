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
			<div class="card-body">Change Product Details.</div>
		</div>

		<form action="${pageContext.request.contextPath }/addToDB" method="post">
		<input type="hidden" name="pid" value="${product.pid }">
			<div class="form-group">
				<label for="exampleFormControlInput1">Product Name</label> <input
					type="text" class="form-control" id="exampleFormControlInput1"
					placeholder="Product Name" name="name" value="${product.name }">
			</div>

			<div class="form-group">
				<label for="exampleFormControlInput1">Product Name</label> <input
					type="text" class="form-control" id="exampleFormControlInput1"
					placeholder="Product Description" name="productDesc"
					value="${product.productDesc }">
			</div>

			<div class="form-group">
				<label for="exampleFormControlInput1">Email address</label> <input
					type="number" class="form-control" id="exampleFormControlInput1"
					placeholder="Price" name="price" value="${product.price }">
			</div>
	</div>

	<div class="form-group">
		<div class="container text-center">
			<a href="${pageContext.request.contextPath}/"
				class="btn btn-outline-danger"}>Back</a>
				<button type="submit" class="btn btn-primary">Update</button>
		</div>
		
	</div>


	</form>

	</div>
</body>
</html>