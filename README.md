# Digital Document Vault

A Java-based web application built with JSP, Servlets, JDBC, and MySQL that allows users to securely upload, download, and manage documents online.

---

## ✨ Features

- User registration and login  
- Upload and download files  
- View all uploaded files  
- Delete files securely  
- File management per user  
- Responsive, clean UI  

---

## 🖥️ Tech Stack

- **Java (JSP + Servlet):** Backend logic & file handling  
- **MySQL:** Database to store user & file data  
- **JDBC:** Database connectivity  
- **Eclipse IDE:** Development environment  
- **HTML / CSS:** Frontend UI design  

---

## 📂 Project Structure


src/ – Java source files (controller, dao, model, util)
webapp/ – JSP pages & assets
screenshots/ – Screenshots of the application


##🛠️ Setup Instructions

###1️⃣ Clone the Repository

    git clone https://github.com/HumeraSK/Digital-Document-Vault.git

2️⃣ Import into Eclipse

- Open Eclipse → File → Import → Existing Dynamic Web Project
- Select the cloned folder

3️⃣ Add MySQL Connector JAR

- Right-click project → Build Path → Configure Build Path → Add External JAR
- Add mysql-connector-j-9.4.0.jar

4️⃣ Configure Database

- Create a database in MySQL:
- CREATE DATABASE digital_vault;
- Create the users and files tables as per your application design and update DBConnection.java with credentials.

  
##📸 Screenshots

### **🔹 Index**

![Index](https://github.com/HumeraSK/Digital-Document-Vault/raw/master/screenshots/Index.png)  


### **🔹 Register**

![Register](https://github.com/HumeraSK/Digital-Document-Vault/raw/master/screenshots/Register.png)  


### **🔹 SignIn**

![Sign In](https://github.com/HumeraSK/Digital-Document-Vault/raw/master/screenshots/SignIn.png)  


### **🔹 Dashboard**

![Dashboard](https://github.com/HumeraSK/Digital-Document-Vault/raw/master/screenshots/Dashboard.png)  


### **🔹 Upload**

![Upload](https://github.com/HumeraSK/Digital-Document-Vault/raw/master/screenshots/Upload.png)  


### **🔹 ViewFiles**

![View Files](https://github.com/HumeraSK/Digital-Document-Vault/raw/master/screenshots/ViewFiles.png)  


---



##🚀 How It Works

- User registers and logs in
- Uploads files through the dashboard
- Can download or delete files as needed
- All files are linked to the user in the database


##📈 Future Enhancements

- Add user authentication with roles (admin, user)
- Support for file categories & search
- GUI enhancements with modern frameworks
- File versioning and history


## 🤝 Contributing

Pull requests are welcome! For major changes, open an issue first.

---

##  Author

GitHub: [HumeraSK](https://github.com/HumeraSK)

---
