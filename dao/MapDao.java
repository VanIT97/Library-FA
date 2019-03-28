package Library.dao;

import Library.common.Query;
import Library.database.ConnectDB;
import Library.entity.MapStudentBook;
import Library.entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MapDao {
    public List<Student> getStudentUseByBookName (String name){
        List<MapStudentBook> list = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = ConnectDB.getMySQLConnection();
            ps = connection.prepareStatement(Query.GET_STUDENTID_BY_BOOKNAME);
            ps.setString(1, name);
            rs = ps.executeQuery();
            while (rs.next()){
                Connection connection1 = null;
                PreparedStatement ps1 = null;
                ResultSet rs1 = null;
                try {
                    connection1 = ConnectDB.getMySQLConnection();
                    ps1 = connection1.prepareStatement(Query.GET_STUDENT_BY_ID);
                    ps1.setInt(1,rs.getInt("StudentId"));
                    rs1 = ps1.executeQuery();
                    while (rs1.next()){
                        Student student = new Student();
                        student.setStudentId(rs1.getInt("SinhvienId"));
                        student.setName(rs1.getString("Name"));
                        student.setFullName(rs1.getString("Fullname"));
                        student.setAge(rs1.getInt("Age"));
                        student.setGender(rs1.getString("Gender"));
                        student.setBirthDay(rs1.getDate("BirthDay"));
                        studentList.add(student);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (connection != null){
                    connection.close();
                }
                if (ps != null){
                    ps.close();
                }
                if (rs != null){
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return studentList;
    }

    public List<MapStudentBook> getBookIdByNameStudent (String name){
        List<MapStudentBook> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = ConnectDB.getMySQLConnection();
            ps = connection.prepareStatement(Query.GET_BOOK_ID_BY_NAME_STUDENT);
            ps.setString(1, name);
            rs = ps.executeQuery();
            while (rs.next()){
                MapStudentBook mapStudentBook = new MapStudentBook();
                mapStudentBook.setBookId(rs.getInt("BookId"));
                list.add(mapStudentBook);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (connection != null){
                    connection.close();
                }
                if (ps != null){
                    ps.close();
                }
                if (rs != null){
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
