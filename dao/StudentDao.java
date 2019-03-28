package Library.dao;

import Library.common.Query;
import Library.database.ConnectDB;
import Library.entity.Book;
import Library.entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public List<Student> getAllStudent(){
        Connection connection = null;
        Statement st = null;
        ResultSet rs = null;
        List<Student> listStudent = new ArrayList<>();
        try {
            connection = ConnectDB.getMySQLConnection();
            st = connection.createStatement();
            rs = st.executeQuery(Query.GET_ALL_STUDENT);
            while (rs.next()){
                Student student = new Student();
                student.setStudentId(rs.getInt("SinhvienId"));
                student.setName(rs.getString("Name"));
                student.setFullName(rs.getString("Fullname"));
                student.setAge(rs.getInt("Age"));
                student.setGender(rs.getString("Gender"));
                student.setBirthDay(rs.getDate("BirthDay"));
                listStudent.add(student);
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
                if (st != null){
                    st.close();
                }
                if ( rs != null){
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listStudent;
    }

    public List<Student> getStudentByName(String name){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Student> listStudent = new ArrayList<>();
        try {
            connection = ConnectDB.getMySQLConnection();
            ps = connection.prepareStatement(Query.GET_STUDENT_BY_NAME);
            ps.setString(1,name);
            rs = ps.executeQuery();
            while (rs.next()){
                Student student = new Student();
                student.setStudentId(rs.getInt("SinhvienId"));
                student.setName(rs.getString("Name"));
                student.setFullName(rs.getString("Fullname"));
                student.setAge(rs.getInt("Age"));
                student.setGender(rs.getString("Gender"));
                listStudent.add(student);
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
                if ( rs != null){
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listStudent;
    }

    public List<Student> getStudentByGender(String gender){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Student> listStudent = new ArrayList<>();
        try {
            connection = ConnectDB.getMySQLConnection();
            ps = connection.prepareStatement(Query.GET_STUDENT_BY_GENDER);
            ps.setString(1,gender);
            rs = ps.executeQuery();
            while (rs.next()){
                Student student = new Student();
                student.setStudentId(rs.getInt("SinhvienId"));
                student.setName(rs.getString("Name"));
                student.setFullName(rs.getString("Fullname"));
                student.setAge(rs.getInt("Age"));
                student.setGender(rs.getString("Gender"));
                listStudent.add(student);
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
                if ( rs != null){
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listStudent;
    }

}
