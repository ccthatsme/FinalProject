<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id=container>
	<div id="page-header">
		<h1>Pantry Project</h1>
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
			<a class="navbar-brand" href="#">${user.email }</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarColor01" aria-controls="navbarColor01"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarColor01">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link"
						href="user-pantry">Pantry <span class="sr-only">(current)</span></a>
					</li>
					<li class="nav-item"><a class="nav-link" href="acct-page">Account</a>
					</li>
				</ul>
				<form class="form-inline my-2 my-lg-0" action="search">
					<input class="form-control mr-sm-2" type="text"
						placeholder="Search by UPC code" name="barcode">
					<button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
				</form>
			</div>
		</nav>
	</div>
	<div id="page-body">Insert interesting placeholder text here</div>
</div>