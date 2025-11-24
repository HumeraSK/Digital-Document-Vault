package com.vault.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

import com.vault.dao.FileDAO;
import com.vault.model.FileModel;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

    // Handle POST request from JSP form
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        FileDAO dao = new FileDAO();

        // 1️⃣ Get file details by ID
        FileModel file = dao.getFileById(id);

        if (file != null) {

            // 2️⃣ Build real file path
            String filePath = getServletContext().getRealPath("assets/uploads/" + file.getFileName());
            File f = new File(filePath);

            // 3️⃣ Delete file from folder
            if (f.exists()) {
                f.delete();
            }

            // 4️⃣ Delete DB record
            dao.deleteFile(id);
        }

        response.sendRedirect("viewFiles.jsp?deleted=1");
    }
}
