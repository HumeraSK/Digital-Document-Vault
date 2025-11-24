package com.vault.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;

import com.vault.dao.FileDAO;
import com.vault.model.User;   // ✅ FIX: Import User model

@WebServlet("/upload")
@MultipartConfig
public class UploadServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        // ✅ FIX: Read user object from session
        User user = (User) session.getAttribute("user");
        if (user == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        int userId = user.getId();  // Extract userId from User object

        Part filePart = request.getPart("file");
        String fileName = filePart.getSubmittedFileName();

        String uploadPath = getServletContext().getRealPath("assets/uploads/");
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) uploadDir.mkdirs();

        filePart.write(uploadPath + File.separator + fileName);

        FileDAO dao = new FileDAO();
        dao.saveFile(userId, fileName);

        response.sendRedirect("viewFiles.jsp?uploaded=1");
    }
}

