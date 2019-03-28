package Library.common;

public class Query {
    public static final String GET_ALL_STUDENT = "select * from `student`";
    public static final String GET_ALL_BOOK = "select * from `Book`";
    public static final String GET_STUDENT_BY_NAME = "select * from `student` where `name` = ?";
    public static final String GET_STUDENT_BY_GENDER = "select * from `student` where `gender` = ?";
    public static final String GET_BOOK_BY_NAME = "select * from `book` where `title` = ?";
    public static final String GET_BOOK_BY_AUTHOR = "select * from `book` where `author` = ?";
    public static final String GET_STUDENTID_BY_BOOKNAME = "SELECT DISTINCT StudentId FROM map_student_book\n" +
            "WHERE BookId = (\n" +
            "\tSELECT BookId FROM book\n" +
            "\tWHERE  `Title` = ?)";
    public static final String GET_STUDENT_BY_ID = "select * from `student` where `sinhvienid` = ?";
    public static final String GET_BOOK_ID_BY_NAME_STUDENT = "SELECT DISTINCT BookId FROM map_student_book\n" +
            "WHERE StudentId = (\n" +
            "SELECT SinhvienId FROM student\n" +
            "WHERE  `name` = ?);";
}
