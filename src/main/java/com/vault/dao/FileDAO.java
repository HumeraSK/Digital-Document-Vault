package com.vault.dao;

import com.vault.model.FileModel;
import com.vault.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FileDAO {

    // Save file
    public boolean saveFile(int userId, String fileName) {
        String sql = "INSERT INTO files (user_id, file_name, file_path, upload_date) VALUES (?, ?, ?, NOW())";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, userId);
            pst.setString(2, fileName);
            pst.setString(3, fileName);
            int rows = pst.executeUpdate();
            return rows > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // DELETE BY FILE NAME (still available if needed)
    public boolean deleteFile(String fileName) {
        String sql = "DELETE FROM files WHERE file_name = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, fileName);
            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // DELETE BY ID (used by DeleteServlet)
    public boolean deleteFile(int id) {
        String sql = "DELETE FROM files WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, id);
            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // GET FILE BY ID (needed to remove file from folder)
    public FileModel getFileById(int id) {
        String sql = "SELECT id, user_id, file_name, file_path, upload_date FROM files WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                FileModel fm = new FileModel();
                fm.setId(rs.getInt("id"));
                fm.setUserId(rs.getInt("user_id"));
                fm.setFileName(rs.getString("file_name"));
                fm.setFilePath(rs.getString("file_path"));
                fm.setUploadDate(rs.getTimestamp("upload_date"));
                return fm;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // LIST files by user
    public List<FileModel> getFilesByUser(int userId) {
        List<FileModel> list = new ArrayList<>();
        String sql = "SELECT id, user_id, file_name, file_path, upload_date FROM files WHERE user_id = ? ORDER BY upload_date DESC";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, userId);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                FileModel fm = new FileModel();
                fm.setId(rs.getInt("id"));
                fm.setUserId(rs.getInt("user_id"));
                fm.setFileName(rs.getString("file_name"));
                fm.setFilePath(rs.getString("file_path"));
                fm.setUploadDate(rs.getTimestamp("upload_date"));
                list.add(fm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // OPTIONAL
    public FileModel findByFileName(String fileName) {
        String sql = "SELECT id, user_id, file_name, file_path, upload_date FROM files WHERE file_name = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, fileName);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                FileModel fm = new FileModel();
                fm.setId(rs.getInt("id"));
                fm.setUserId(rs.getInt("user_id"));
                fm.setFileName(rs.getString("file_name"));
                fm.setFilePath(rs.getString("file_path"));
                fm.setUploadDate(rs.getTimestamp("upload_date"));
                return fm;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

