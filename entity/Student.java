package Library.entity;

import java.sql.Date;

public class Student {
    private int studentId;
    private String name;
    private String fullName;
    private int age;
    private String gender;
    private Date birthDay;

    public Student() {
    }

    public Student(int studentId, String name, String fullName, int age, String gender, Date birthDay) {
        this.studentId = studentId;
        this.name = name;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}
