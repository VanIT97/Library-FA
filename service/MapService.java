package Library.service;

import Library.dao.MapDao;
import Library.entity.MapStudentBook;
import Library.entity.Student;

import java.util.List;
import java.util.Scanner;

public class MapService {
    private MapDao mapDao ;
    public MapService(){
        mapDao = new MapDao();
    }
    public void displayStudentUseByBookName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name of Book");
        String name = sc.nextLine();
        List<Student> studentList = mapDao.getStudentUseByBookName(name);
        if (studentList.isEmpty()){
            System.out.println("Data is empty!");
        }else {
            for(Student student : studentList){
                System.out.println(student.toString());
            }
        }
    }

    public void displayBookIdByStudentName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name of student");
        String name = sc.nextLine();
        List<MapStudentBook> list = mapDao.getBookIdByNameStudent(name);
        if (list.isEmpty()){
            System.out.println("Data is empty!");
        }else {
            for(MapStudentBook mapStudentBook : list){
                System.out.println(mapStudentBook.getBookId());
            }
        }
    }
}
