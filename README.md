# Student Course Management System

  The **Student Course Management System** is a Java-based application built using **JDBC**, **MySQL**, and **Eclipse IDE**. It allows admins to manage students and their course details efficiently.

---

## ✨ Features

* Add new students
* Update student details
* Delete student records
* View all students
* Add and manage courses
* Student–Course enrollment
* MySQL database integration
* Clean console-based UI

---

## 🖥️ Tech Stack

| Technology                  | Description                                   |
| --------------------------- | --------------------------------------------- |
| **Java (Core + JDBC)**      | Backend logic, database operations            |
| **MySQL**                   | Database for storing student & course records |
| **Eclipse IDE**             | Development environment                       |
| **XAMPP / MySQL Workbench** | Managing the database                         |

---

## 📂 Project Structure

```
StudentCourseManagementSystem/
├── src/
│   ├── dao/
│   │   └── StudentDAO.java
│   ├── model/
│   │   └── Student.java
│   ├── util/
│   │   └── DBConnection.java
│   └── Main.java
├── lib/
│   └── mysql-connector.jar
└── README.md
```

---

## 🛠️ Setup Instructions

### **1️⃣ Clone the Repository**

```
git clone https://github.com/HumeraSK/StudentCourseManagementSystem.git
```

### **2️⃣ Import Into Eclipse**

* Open **Eclipse** → File → Import → Existing Java Project
* Select the cloned folder

### **3️⃣ Add MySQL Connector JAR**

* Right-clink project → Build Path → Configure Build Path → Add External JAR
* Select `mysql-connector.jar`

### **4️⃣ Configure Database**

Create a database in MySQL:

```
CREATE DATABASE student_db;
```

Create required tables:

```
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    phone VARCHAR(20),
    course VARCHAR(100)
);
```

Update DB credentials inside `DBConnection.java`.

---

## 📸 Screenshots

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

## 🚀 How It Works

The system follows a simple workflow:

1. User selects an action from the menu
2. Inputs required details
3. Program validates inputs
4. JDBC forwards data to MySQL
5. Response is shown on screen

---

## 📈 Future Enhancements

* GUI using JavaFX or Swing
* Login & authentication for admin
* Export student data as Excel/PDF
* Course fee management
* Attendance module

---

## 🤝 Contributing

Pull requests are welcome! For major changes, open an issue first.

---

## 🧑‍💻 Author

**Humera Shaikh**
GitHub: [HumeraSK](https://github.com/HumeraSK)

---

## ⭐ Show Your Support

If you liked this project, consider giving it a **star ⭐ on GitHub**.
