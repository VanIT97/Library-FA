package Library.service;

import Library.dao.StudentDao;
import Library.entity.Book;
import Library.entity.Student;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    private StudentDao studentDao;
    public StudentService(){
        studentDao = new StudentDao();
    }

    public void displayAllStudent(){
        List<Student> listStudent = studentDao.getAllStudent();
        if (listStudent.isEmpty()) {
            System.out.println("data is empty!");
        } else {
            for (Student student : listStudent) {
                System.out.println(student.toString());
            }
        }
    }

    public void displayStudentByName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name of student.");
        String name = sc.nextLine();
        List<Student> studentList = studentDao.getStudentByName(name);
        if ( studentList.isEmpty()){
            System.out.println("Data is empty!");
        }else {
            for (Student student : studentList){
                System.out.println(student.toString());
            }
        }
    }
    public void displayStudentByGender(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter gender of student.");
        String gender = sc.nextLine();
        List<Student> studentList = studentDao.getStudentByGender(gender);
        if ( studentList.isEmpty()){
            System.out.println("Data is empty!");
        }else {
            for (Student student : studentList){
                System.out.println(student.toString());
            }
        }
    }


}
