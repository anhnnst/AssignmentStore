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
            <div class="col-md-9"></div>
            <div class="col-md-3 mr-auto">
                <a href="${pageContext.request.contextPath}/CategoryController?action=add-form" 
                   class="btn btn-primary"><i class="fa fa-plug"></i> Add New</a>
                <a href="${pageContext.request.contextPath}/CategoryController?action=search" 
                   class="btn btn-primary">
                    <i class="fa fa-search"></i>Search</a>
            </div>
        </div>
    </div>
</section>
<!--Categories-->
<section id="posts">
    <div class="container">
        <div class="row">
            <div class="col">
                <div class="card">
                    <div class="card-header">
                        <h4>List of Categories</h4>
                    </div>
                    <table class="table table-striped">
                        <thead class="thead-inverse">
                        <tr>
                            <th>#</th>
                            <th>Category ID</th>
                            <th>Name</th>
                            <th></th>
                        </tr>
                        </thead>

                        <tbody>
                            <c:forEach var="item" items="${categories}">
                                <tr>
                                    <td scope="row">1</td>
                                    <td>${item.categoryId}</td>
                                    <td>${item.name}</td>
                                    <td>
                                        <a href="details.html" class="btn btn-secondary">
                                            <i class="fa fa-angle-double-right"></i> Detail
                                        </a>
                                        <a href="CategoryController?action=edit-form&categoryId=${item.categoryId}"
                                           class="btn btn-warning">
                                            <i class="fa fa-edit"></i>
                                            Edit
                                        </a>
                                        <a href="CategoryController?action=edit-form&categoryId=${item.categoryId}"
                                           class="btn btn-danger">
                                            <i class="fa fa-remove"></i>
                                            Delete
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
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
<jsp:include page="../Common/footer.jsp"/>