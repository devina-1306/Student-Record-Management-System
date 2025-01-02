package com.example.student.StudentController;
import com.example.student.DTO.StudentDTO;
import com.example.student.DTO.StudentSaveDTO;
import com.example.student.DTO.StudentUpdateDTO;
import com.example.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/student")
public class StudentController {
    @Autowired
    private StudentService studentservice;

    @PostMapping(path="/savestudent")
    public String saveStudent(@RequestBody StudentSaveDTO studentsaveDTO)
    {
        String id=studentservice.addStudent(studentsaveDTO);
        return id;
    }

    @GetMapping(path="/getallstudent")
    public List<StudentDTO> getAllStudent()
    {
        List<StudentDTO> allStudents=studentservice.getAllStudent();
        return allStudents;
    }
    @GetMapping(path="/getstudent/{id}")
    public StudentDTO getstudentById(@PathVariable(value="id") int id)
    {
        StudentDTO get =studentservice.getstudentById(id);
        return get;
    }
    
    @PutMapping(path="/updatestudent")
    public String updateStudent(@RequestBody StudentUpdateDTO studentupdateDTO)
    {
        String id=studentservice.updateStudents(studentupdateDTO);
        return id;
    }

    @PutMapping(path="/updatestudent/{id}")
    public String updateStudentbyId(int id, StudentUpdateDTO studentupdateDTO)
    {
        String update=studentservice.updateStudentbyId(id, studentupdateDTO);
        return update;
    }
    @DeleteMapping(path="/deletestudent/{id}")
    public String deleteStudent(@PathVariable(value="id") int id)
    {
        String deletestudent=studentservice.deleteStudent(id);
        return deletestudent;
    }
}
