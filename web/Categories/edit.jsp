<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="../Common/header.jsp"/>
<header id="main-header" class="py-2 bg-primary text-white">
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <h1><i class="fa fa-pencil">Categories</i></h1>
            </div>
        </div>
    </div>
</header>

<!--Actions-->
<section id="action" class="py-4 mb-4 bg-light">
    <div class="container">
        <div class="row">
            <div class="col-md-12 mr-auto" style="text-align: right">
                <a href="${pageContext.request.contextPath}/CategoryController?action=search" class="btn btn-primary">Search</a>
            </div>
        </div>
    </div>
</section>

<!--Category-->
<section id="posts">
    <div class="container">
        <div class="row">
            <div class="col">
                <div class="card">
                    <div class="card-header">
                        <h4>Edit Category</h4>
                    </div>
                    <div class="card-body">
                        <form action="CategoryController" method="post">
                        <input type="hidden" name="action" value="update">
                        <div class="form-group">
                            <label for="">Category ID: </label>
                            <input type="text" name="categoryId" id="categoryId" class="form-control"
                                   readonly value="${category.categoryId}">
                        </div>
                        <div class="form-group">
                            <input type="hidden" name="action" value="add">
                            <div class="form-group">
                                <label for="name">Name: </label>
                                <input type="text" name="name" id="name" class="form-control" placeholder="Name"
                                       value="${category.name}">
                                <small id="emailHelp" class="form-text text-muted">Name of the category.</small>
                            </div>
                            <input type="submit" value="Update" class="btn btn-primary">
                        </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<jsp:include page="../Common/footer.jsp"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="CategoryController">List Categories</a> 
        <a href="CategoryController?action=search">Search Categories</a> 
        <hr>
        <form action="CategoryController" method="post">
            <input type="hidden" name="action" value="update">
            <div class="form-group">
                <label for="">Category ID: </label>
                <input type="text" name="categoryId" id="categoryId" readonly value="${category.categoryId}">
            </div>
            <div class="form-group">
                <label for="">Name: </label>
                <input type="text" name="name" id="name" value="${category.name}">
            </div>
            <div>
                <input type="submit" value="Update">
            </div>
        </form>
    </body>
</html>
