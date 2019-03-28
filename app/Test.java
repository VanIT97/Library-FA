package Library.app;

import Library.service.BookService;
import Library.service.MapService;
import Library.service.StudentService;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)  {
        StudentService studentService = new StudentService();
        BookService bookService = new BookService();
        MapService mapService = new MapService();
        int i=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1.Display all student.");
            System.out.println("2.Display all book");
            System.out.println("3.Display student by name.");
            System.out.println("4.Display student by gender.");
            System.out.println("5.Display book by name.");
            System.out.println("6.Display book by author.");
            System.out.println("7.Display list bookid by name student use.");
            System.out.println("8.Display infomation student use of book name");
            System.out.println("9.Exit.");
            i = sc.nextInt();
            switch (i){
                case 1:
                    studentService.displayAllStudent();
                    break;
                case 2:
                    bookService.displayAllBook();
                    break;
                case 3:
                    studentService.displayStudentByName();
                    break;
                case 4:
                    studentService.displayStudentByGender();
                case 5:
                    bookService.displayBookByName();
                    break;
                case 6:
                    bookService.displayBookByAuthor();
                    break;
                case 7:
                    mapService.displayBookIdByStudentName();
                    break;
                case 8:
                    mapService.displayStudentUseByBookName();
                    default:
                        break;
            }
        }while (i != 9);
    }
}
