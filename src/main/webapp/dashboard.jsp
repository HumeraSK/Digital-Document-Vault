<%@ page import="com.vault.model.User" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    User user = (User) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8"/>
  <title>Dashboard — Digital Document Vault</title>
  <link rel="stylesheet" href="assets/css/style.css">
  <link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;600;700&display=swap" rel="stylesheet">
</head>
<body class="bg-gradient">

  <header class="topbar">
    <div class="logo">Digital Document Vault</div>
    <nav>
      <span class="welcome-txt">Hello, <strong><%= user.getName() %></strong></span>
      <a class="top-link" href="upload.jsp">Upload</a>
      <a class="top-link" href="viewFiles.jsp">My Files</a>
      <a class="top-link" href="logout">Logout</a>
    </nav>
  </header>

  <main class="center-container">
    <section class="glass-card dashboard-card">
      <h2 class="card-title">Your Vault</h2>
      <p class="muted">Quick actions and recent activity</p>

      <div class="grid">
        <a class="action-card" href="upload.jsp">
          <div class="action-title">Upload File</div>
          <div class="action-desc">Add documents to your secure vault</div>
        </a>

        <a class="action-card" href="viewFiles.jsp">
          <div class="action-title">View Files</div>
          <div class="action-desc">Download or manage your documents</div>
        </a>
      </div>

      <div class="footer-note muted">Tip: Use strong passwords and keep your key safe.</div>
    </section>
  </main>

</body>
</html>
