package com.example.student.DTO;

public class StudentDTO {
    private int id;
    private String studentname;
    private String studentaddress;
    private int mobile;

    public StudentDTO(int id, String studentname, String studentaddress, int mobile)
    {
        this.id=id;
        this.studentname=studentname;
        this.studentaddress=studentaddress;
        this.mobile=mobile;
    }
    public StudentDTO() {}
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
        return "StudentDTO{" +
                "id=" + id +
                ", studentname='" + studentname + '\'' +
                ", studentaddress='" + studentaddress + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}


