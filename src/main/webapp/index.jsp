<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8"/>
  <title>Digital Document Vault — Welcome</title>
  <link rel="stylesheet" href="assets/css/style.css">
  <link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;600;700&display=swap" rel="stylesheet">
</head>

<body class="bg-gradient">

<header class="topbar">
  <div class="logo">Digital Document Vault</div>
  <nav>
    <a class="nav-btn login" href="login.jsp">Login</a>
    <a class="nav-btn register" href="register.jsp">Sign Up</a>
  </nav>
</header>

<main class="center-container">
  <section class="hero-card">
    <h1 class="hero-title">Your Secure Digital Vault</h1>
    <p class="hero-sub">Store, protect and manage your documents beautifully.</p>

    <div class="hero-actions">
      <a class="btn-primary" href="register.jsp">Get Started</a>
      <a class="btn-ghost" href="login.jsp">Sign In</a>
    </div>

    <p class="small-note">Fast • Encrypted • Personal Cloud Storage</p>
  </section>
</main>

<footer class="site-footer">
  <small>© <%= java.time.Year.now() %> Digital Document Vault</small>
</footer>

</body>
</html>

