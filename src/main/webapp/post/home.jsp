<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>JSP page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-6">
            <h3>Add new post</h3>
            <form action="addPost">
                <div class="form-group">
                    <label for="title">Title</label>
                    <input type="text" name="title" class="form-control" id="title" placeholder="Enter title">
                </div>
                <div class="form-group">
                    <label for="content">Content</label>
                    <input type="text" name="content" class="form-control" id="content" placeholder="Post content">
                </div>
                <button type="submit" class="btn btn-info">Submit</button>
            </form>
        </div>

        <div class="col-6">
            <h3>Get Post By Post ID</h3>
            <form action="getPost">
                <div class="form-group">
                    <label for="id">ID</label>
                    <input type="number" name="id" class="form-control" id="id"
                           placeholder="Enter post id to see the post details..">
                </div>
                <button type="submit" class="btn btn-info">Submit</button>
            </form>
        </div>
    </div>
    <div class="col-6 offset-3 mt-3">
        <a href="/getAllPosts" class="btn btn-block btn-secondary">All Posts</a>
    </div>

</div>
</body>
</html>
