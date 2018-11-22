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

<header id="main-header" class="py-2 bg-primary text-white">
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <h1><i class="fa fa-pencil"> Posts</i></h1>
            </div>
        </div>
    </div>
</header>

<!--Actions-->
<section id="action" class="py-4 mb-4 bg-light">
    <div class="container">
        <div class="row">
            <div class="col-md-6 ml-auto">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search">
                    <span class="input-group-btn">
                        <button class="btn btn-primary">Search</button>
                    </span>
                </div>
            </div>
        </div>
    </div>
</section>

<!--POSTS-->
<section id="posts">
    <div class="container">
        <div class="row">
            <div class="col">
                <div class="card">
                    <div class="card-header">
                        <h4>Latest Posts</h4>
                    </div>
                    <table class="table table-striped">
                        <thead class="thead-inverse">
                        <tr>
                            <th>#</th>
                            <th>Title</th>
                            <th>Category</th>
                            <th>Date Posted</th>
                            <th></th>
                        </tr>
                        <tbody>
                        <tr>
                            <td scope="row">1</td>
                            <td>Post One</td>
                            <td>Web Development</td>
                            <td>July 12th 2018</td>
                            <td><a href="details.html" class="btn btn-secondary">
                                <i class="fa fa-angle-double-right"></i> Detail
                            </a></td>
                        </tr>
                        <tr>
                            <td scope="row">2</td>
                            <td>Post One</td>
                            <td>Web Development</td>
                            <td>July 12th 2018</td>
                            <td><a href="details.html" class="btn btn-secondary">
                                <i class="fa fa-angle-double-right"></i> Detail
                            </a></td>
                        </tr>
                        <tr>
                            <td scope="row">3</td>
                            <td>Post One</td>
                            <td>Web Development</td>
                            <td>July 12th 2018</td>
                            <td><a href="details.html" class="btn btn-secondary">
                                <i class="fa fa-angle-double-right"></i> Detail
                            </a></td>
                        </tr>
                        </tbody>
                        </thead>
                    </table>
                    <nav class="ml-4">
                        <ul class="pagination">
                            <li class="page-item disabled"><a href="#" class="page-link">Previous</a></li>
                            <li class="page-item active"><a href="#" class="page-link">1</a></li>
                            <li class="page-item"><a href="#" class="page-link">2</a></li>
                            <li class="page-item"><a href="#" class="page-link">3</a></li>
                            <li class="page-item"><a href="#" class="page-link">Next</a></li>
                        </ul>
                    </nav>
                </div>
            </div>


        </div>
    </div>
</section>

<footer id="main-footer" class="bg-dark text-white mt-5 p-5">
    <div class="container">
        <div class="row">
            <div class="col">
                <p class="lead text-center">Copyright &copy; 2017 Nguyen Ngoc Anh - Poly Store</p>
            </div>
        </div>
    </div>
</footer>

<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/popper.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</body>
</html>
