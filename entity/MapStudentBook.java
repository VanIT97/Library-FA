package Library.entity;

import java.util.Date;

public class MapStudentBook {
    private int mapStudentBookId;
    private Date date;
    private Date dateTo;
    private int studentId;
    private int bookId;

    public MapStudentBook() {
    }

    @Override
    public String toString() {
        return "MapStudentBook{" +
                "mapStudentBookId=" + mapStudentBookId +
                ", date=" + date +
                ", dateTo=" + dateTo +
                ", studentId=" + studentId +
                ", bookId=" + bookId +
                '}';
    }

    public MapStudentBook(int mapStudentBookId, Date date, Date dateTo, int studentId, int bookId) {
        this.mapStudentBookId = mapStudentBookId;
        this.date = date;
        this.dateTo = dateTo;
        this.studentId = studentId;
        this.bookId = bookId;
    }

    public int getMapStudentBookId() {
        return mapStudentBookId;
    }

    public void setMapStudentBookId(int mapStudentBookId) {
        this.mapStudentBookId = mapStudentBookId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
