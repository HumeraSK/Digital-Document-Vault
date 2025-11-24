<%@ page import="com.vault.model.User" %>
<%
    // Check if user is logged in
    User user = (User) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Upload File — Digital Document Vault</title>
    <link rel="stylesheet" href="assets/css/style.css">
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;600;700&display=swap" rel="stylesheet">
</head>

<body class="bg-gradient">

<div class="center-container">
    <div class="glass-card form-card" style="width: 480px; padding: 35px;">

        <h2 class="card-title">Upload Document</h2>
        <p class="muted">Choose a file to save securely</p>

        <form action="upload" method="post" enctype="multipart/form-data" class="form-layout">

            <div class="input-group">
                <label class="label">Select File</label>
                <input type="file" name="file" class="input-field" required>
            </div>

            <button class="btn-primary" type="submit">Upload</button>
        </form>

    </div>
</div>

</body>
</html>













