<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login — Digital Document Vault</title>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;600;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="assets/css/style.css">
</head>

<body class="bg-gradient">
    
<div class="center-container">
    <div class="glass-card form-card">

        <h2 class="card-title">Welcome Back</h2>
        <p class="muted">Sign in to access your vault</p>

        <form action="login" method="post">

            <div class="input-group">
                <label>Email</label>
                <input type="email" name="email" required>
            </div>

            <div class="input-group">
                <label>Password</label>
                <input type="password" name="password" required>
            </div>

            <button class="btn-primary" type="submit">Sign In</button>

        </form>

        <p class="small-text">Don't have an account?  
            <a class="no-underline dark-link" href="register.jsp">Create one</a>
        </p>

    </div>
</div>

</body>
</html>

