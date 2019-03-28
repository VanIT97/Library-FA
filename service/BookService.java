package Library.service;

import Library.dao.BookDao;
import Library.entity.Book;

import java.util.List;
import java.util.Scanner;

public class BookService {
    private BookDao bookDao ;
    public BookService(){
        bookDao = new BookDao();
    }
    public void displayAllBook() {
        List<Book> listBook = bookDao.getAllBook();
        if (listBook.isEmpty()){
            System.out.println("data is empty");
        }else{
            for(Book book : listBook){
                System.out.println(book.toString());
            }
        }
    }

    public void displayBookByName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name of book.");
        String name = sc.nextLine();
        List<Book> list = bookDao.getListbookByName(name);
        if (list.isEmpty()){
            System.out.println("Data is empty!");
        }else {
            for (Book book : list){
                System.out.println(book.toString());
            }
        }
    }
    public void displayBookByAuthor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter author of book.");
        String name = sc.nextLine();
        List<Book> list = bookDao.getListbookByAuthor(name);
        if (list.isEmpty()){
            System.out.println("Data is empty!");
        }else {
            for (Book book : list){
                System.out.println(book.toString());
            }
        }
    }
}
