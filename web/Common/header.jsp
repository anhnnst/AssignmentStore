<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Poly Store</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
    
<nav class="navbar navbar-expand-sm navbar-dark bg-dark p-0">
    <div class="container">
        <a href="index.html" class="navbar-brand">Poly Store</a>
        <button class="navbar-toggler" data-toggle="collapse" data-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item px-2"><a href="index.html" class="nav-link ">Dashboard</a></li>
                <li class="nav-item px-2"><a href="${pageContext.request.contextPath}/CategoryController" class="nav-link active">Categories</a></li>
                <li class="nav-item px-2"><a href="${pageContext.request.contextPath}/ProductController" class="nav-link">Products</a></li>
                <li class="nav-item px-2"><a href="UserController" class="nav-link">Users</a></li>
            </ul>
            <ul class="navbar-nav ml-auto">
                <li class="nav-item dropdown mr-3">
                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">
                        <i class="fa fa-user"></i> Welcome Brad
                    </a>
                    <div class="dropdown-menu">
                        <a href="profile.html" class="dropdown-item">
                            <i class="fa fa-user-circle"></i> Profile
                        </a>
                        <a href="settings.html" class="dropdown-item">
                            <i class="fa fa-gear"></i> Settings
                        </a>
                    </div>
                </li>
                <li class="nav-item"><a href="login.html" class="nav-link"><i class="fa fa-user-times"></i> Logout</a></li>
            </ul>
        </div>
    </div>
</nav>
