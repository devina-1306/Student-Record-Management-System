package com.example.student.Entity;
import jakarta.persistence.*;
@Entity
@Table(name="student")
public class Student {
    @Id
    @Column(name="id", length=50)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name="studentname", length=50)
    private String studentname;

    @Column(name="studentaddress", length=50)
    private String studentaddress;

    @Column(name="mobile", length=50)
    private int mobile;

    public Student(int id, String studentname, String studentaddress, int mobile)
    {
        this.id=id;
        this.studentname=studentname;
        this.studentaddress=studentaddress;
        this.mobile=mobile;
    }
    public Student(String studentname, String studentaddress, int mobile)
    {
        this.studentname=studentname;
        this.studentaddress=studentaddress;
        this.mobile=mobile;
    }
    public Student() {}
    public int getid()
    {
        return id;
    }
    public void setid(int id)
    {
        this.id=id;
    }
    public String getstudentname()
    {
        return studentname;
    }
    public void setstudentname(String studentnname)
    {
        this.studentname=studentnname;
    }
    public String getstudentaddress()
    {
        return studentaddress;
    }
    public void setstudentaddress(String studentaddress)
    {
        this.studentaddress=studentaddress;
    }
    public int getmobile()
    {
        return mobile;
    }
    public void setmobile(int mobile)
    {
        this.mobile=mobile;
    }

    @Override
    public String toString(){
        return "Student{" +
                "id=" + id +
                ", studentname='" + studentname + '\'' +
                ", studentaddress='" + studentaddress + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
