package com.example.student.DTO;

public class StudentSaveDTO {
    private String studentname;
    private String studentaddress;
    private int mobile;

    StudentSaveDTO(String studentname, String studentaddress, int mobile)
    {
        this.studentname=studentname;
        this.studentaddress=studentaddress;
        this.mobile=mobile;
    }
    StudentSaveDTO() {}
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
        return "StudentSaveDTO{" +
                ", studentname='" + studentname + '\'' +
                ", studentaddress='" + studentaddress + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
