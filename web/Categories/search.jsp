<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="../Common/header.jsp"/>
<!--Actions-->
<section id="action" class="py-4 mb-4 bg-light">
    <div class="container">
        <div class="row">
            <div class="col-md-6 ml-auto">
                <form action="CategoryController">
                <div class="input-group">
                    
                        <input type="hidden" name="action" value="search"/>
                        <input type="text" class="form-control" name="name" placeholder="Search">
                        <span class="input-group-btn">
                            <button class="btn btn-primary">Search</button>
                        </span>
                    
                </div>
                    </form>
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