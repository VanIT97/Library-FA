package Library.dao;

import Library.common.Query;
import Library.database.ConnectDB;
import Library.entity.Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
    public List<Book> getAllBook() {
        List<Book> listBook = new ArrayList<>();
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        try{
            connection =  ConnectDB.getMySQLConnection();
            st = connection.createStatement();
            rs = st.executeQuery(Query.GET_ALL_BOOK);
            while (rs.next()){
                Book book = new Book();
                book.setBookID(rs.getInt("BookId"));
                book.setAuthor(rs.getString("Author"));
                book.setBookName(rs.getString("Title"));
                book.setBookNumber(rs.getInt("BookNumber"));
                book.setYearPublisher(rs.getInt("YearPublisher"));
                listBook.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try{
                if (connection != null){
                    connection.close();
                }
                if (st != null){
                    st.close();
                }
                if (rs != null){
                    rs.close();
                }
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listBook;
    }

    public List<Book> getListbookByName(String bookName) {
        List<Book> listBook = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            connection =  ConnectDB.getMySQLConnection();
            ps = connection.prepareStatement(Query.GET_BOOK_BY_NAME);
            ps.setString(1, bookName);
            rs = ps.executeQuery();
            while (rs.next()){
                Book book = new Book();
                book.setBookID(rs.getInt("BookId"));
                book.setAuthor(rs.getString("Author"));
                book.setBookName(rs.getString("Title"));
                book.setBookNumber(rs.getInt("BookNumber"));
                book.setYearPublisher(rs.getInt("YearPublisher"));
                listBook.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try{
                if (connection != null){
                    connection.close();
                }
                if (ps != null){
                    ps.close();
                }
                if (rs != null){
                    rs.close();
                }
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listBook;
    }

    public List<Book> getListbookByAuthor(String name) {
        List<Book> listBook = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            connection =  ConnectDB.getMySQLConnection();
            ps = connection.prepareStatement(Query.GET_BOOK_BY_AUTHOR);
            ps.setString(1, name);
            rs = ps.executeQuery();
            while (rs.next()){
                Book book = new Book();
                book.setBookID(rs.getInt("BookId"));
                book.setAuthor(rs.getString("Author"));
                book.setBookName(rs.getString("Title"));
                book.setBookNumber(rs.getInt("BookNumber"));
                book.setYearPublisher(rs.getInt("YearPublisher"));
                listBook.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try{
                if (connection != null){
                    connection.close();
                }
                if (ps != null){
                    ps.close();
                }
                if (rs != null){
                    rs.close();
                }
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listBook;
    }
}
