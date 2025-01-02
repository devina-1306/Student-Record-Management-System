package com.example.student.Service;
import com.example.student.DTO.StudentDTO;
import com.example.student.DTO.StudentSaveDTO;
import com.example.student.DTO.StudentUpdateDTO;

import java.util.List;



public interface StudentService {
    String addStudent(StudentSaveDTO studentsaveDTO);
    List <StudentDTO> getAllStudent();
    String updateStudents(StudentUpdateDTO studentupdateDTO);
    String deleteStudent(int id);
    StudentDTO getstudentById(int id);
    String updateStudentbyId(int id, StudentUpdateDTO studentupdateDTO);
}   

