/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import library.LibraryConnectDb;
import bean.News;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Windows
 */
public class ModelNews {
    private Connection conn;
    
    private LibraryConnectDb mConnect;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;

    public ModelNews(){
        mConnect = new LibraryConnectDb();
    }

    public ArrayList<News> getList(){
        ArrayList<News> alItem = new ArrayList<>();
        
        conn = mConnect.getConnectMySQL();
        String sql = "SELECT *, c.name AS cname FROM news AS n INNER JOIN category AS c ON n.id_cat = c.id_cat ORDER BY n.id_news ASC";

        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                News objItem = new News(rs.getInt("id_news"), rs.getString("name"), rs.getString("preview_text"), rs.getString("detail_text"), rs.getString("picture"), rs.getTimestamp("date_create"), rs.getInt("id_cat"), rs.getString("cname"));
                alItem.add(objItem);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelNews.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ModelNews.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return alItem;
    }

    public int addItem(News objItem) {
        int result = 0;
        conn = mConnect.getConnectMySQL();
        String sql = "INSERT INTO news(name, preview_text, detail_text, picture, date_create, id_cat) VALUES(?,?,?,?,?,?)";
        String picture = "";
        if (objItem.getPicture() != null) {
            picture = objItem.getPicture();
        } 
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, objItem.getName());
            pst.setString(2, objItem.getPreview_text());
            pst.setString(3, objItem.getDetail_text());
            pst.setString(4, picture);
            pst.setTimestamp(5, objItem.getDate_create());
            pst.setInt(6, objItem.getId_cat());
            pst.executeUpdate();
            result = 1;
        } catch (SQLException ex) {
            Logger.getLogger(ModelNews.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public int delItem(News objItem) {
        int result = 0;
        conn = mConnect.getConnectMySQL();
        String sql = "DELETE FROM news WHERE id_news = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, objItem.getId_news());
            pst.executeUpdate();
            result = 1;
        } catch (SQLException ex) {
            Logger.getLogger(ModelNews.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public int editItem(News objItem) {
        int result = 0;
        conn = mConnect.getConnectMySQL();
        
        String sql = "UPDATE news SET name = ?, preview_text = ?, detail_text = ?, picture = ?, date_create = ?, id_cat = ? WHERE id_news = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            
            pst.setString(1, objItem.getName());
            pst.setString(2, objItem.getPreview_text());
            pst.setString(3, objItem.getDetail_text());
            pst.setString(4, objItem.getPicture());
            pst.setTimestamp(5, objItem.getDate_create());
            pst.setInt(6, objItem.getId_cat());
            pst.setInt(7, objItem.getId_news());
            
            pst.executeUpdate();
            result = 1;
        } catch (SQLException ex) {
            Logger.getLogger(ModelNews.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return result;
    }

    public News getItem(int id) {
        News objNews = null;
        conn = mConnect.getConnectMySQL();
        String sql = "SELECT * FROM news WHERE id_news = ? LIMIT 1";
        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()){
               objNews = new News(rs.getInt("id_news"), rs.getString("name"), rs.getString("preview_text"), rs.getString("detail_text"), rs.getString("picture"), rs.getTimestamp("date_create"), rs.getInt("id_cat"), null);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModelNews.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pst.close();
                rs.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ModelNews.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return objNews;
    }
    
}
