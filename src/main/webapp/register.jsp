<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register — Digital Document Vault</title>
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;600;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="assets/css/style.css">
</head>

<body class="bg-gradient">

<div class="center-container">
    <div class="glass-card form-card">

        <h2 class="card-title">Create Account</h2>
        <p class="muted">Start your secure cloud vault</p>

        <form action="register" method="post">

            <div class="input-group">
                <label>Name</label>
                <input type="text" name="name" required>
            </div>

            <div class="input-group">
                <label>Email</label>
                <input type="email" name="email" required>
            </div>

            <div class="input-group">
                <label>Password</label>
                <input type="password" name="password" required>
            </div>

            <button class="btn-primary" type="submit">Register</button>
        </form>

        <p class="small-text">Already have an account?  
            <a class="no-underline dark-link" href="login.jsp">Login</a>
        </p>

    </div>
</div>

</body>
</html>

