<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.vault.model.FileModel"%>
<%@ page import="com.vault.model.User"%>
<%@ page import="com.vault.dao.FileDAO"%>
<%@ page session="true" %>

<!DOCTYPE html>
<html>
<head>
    <title>My Files - Digital Document Vault</title>
    <link rel="stylesheet" href="assets/css/style.css">
</head>

<body class="bg-gradient">

<%
    User user = (User) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }

    FileDAO fileDAO = new FileDAO();
    List<FileModel> files = fileDAO.getFilesByUser(user.getId());
%>

<div class="center-container">
    <div class="glass-card" style="width: 750px; padding: 30px;">

        <h2 class="card-title">My Files</h2>

        <% if(request.getParameter("uploaded") != null) { %>
            <p class="success-msg">File uploaded successfully!</p>
        <% } %>

        <% if(request.getParameter("deleted") != null) { %>
            <p class="success-msg">File deleted successfully!</p>
        <% } %>

        <% if(request.getParameter("error") != null) { %>
            <p class="error-msg">An error occurred!</p>
        <% } %>

        <table class="styled-table">
            <tr>
                <th>File Name</th>
                <th>Uploaded On</th>
                <th>Actions</th>
            </tr>

            <% for(FileModel f : files) { %>
                <tr>
                    <td><%= f.getFileName() %></td>
                    <td><%= f.getUploadDate() %></td>
                    <td>
                        <a class="link-action" href="download?id=<%= f.getId() %>">Download</a> |
                        <form action="delete" method="post" style="display:inline;">
                            <input type="hidden" name="id" value="<%= f.getId() %>"/>
                            <input class="delete-btn" type="submit" value="Delete"
                                   onclick="return confirm('Are you sure?');"/>
                        </form>
                    </td>
                </tr>
            <% } %>
        </table>

        <div class="center" style="margin-top: 50px;">
    <a class="dashboard-btn" href="dashboard.jsp">Back to Dashboard</a>
</div>
        

    </div>
</div>

</body>
</html>
