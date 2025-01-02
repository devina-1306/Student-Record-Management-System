package com.example.student.Service;
import com.example.student.StudentRepo.StudentRepo;
import com.example.student.DTO.StudentDTO;
import com.example.student.DTO.StudentSaveDTO;
import com.example.student.DTO.StudentUpdateDTO;
import com.example.student.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceIMPL implements StudentService {
    @Autowired
    private StudentRepo studentrepo;

    @Override
    public String addStudent(StudentSaveDTO studentsaveDTO)
    {
        Student student=new Student(
            studentsaveDTO.getstudentname(),
            studentsaveDTO.getstudentaddress(),
            studentsaveDTO.getmobile()
        );
        studentrepo.save(student);
        return student.toString();
    }

    @Override
    public List<StudentDTO> getAllStudent()
    {
        List<Student> getstudents=studentrepo.findAll();
        List<StudentDTO> studentDTOList=new ArrayList<>();
        for(Student a : getstudents)
        {
            StudentDTO studentDTO=new StudentDTO(
                a.getid(),
                a.getstudentname(),
                a.getstudentaddress(),
                a.getmobile()
            );
            studentDTOList.add(studentDTO);
        }
        return studentDTOList;
    }

    @Override
    public String updateStudents(StudentUpdateDTO studentupdateDTO)
    {
        if(studentrepo.existsById(studentupdateDTO.getid())){
            Student student=studentrepo.getReferenceById(studentupdateDTO.getid());
            student.setstudentname(studentupdateDTO.getstudentname());
            student.setstudentaddress(studentupdateDTO.getstudentaddress());
            student.setmobile(studentupdateDTO.getmobile());
            studentrepo.save(student);
            return student.toString();
        }
        else
        {
            return "Roll Number does not Exist";
        }
    }

    @Override
    public String updateStudentbyId(int id, StudentUpdateDTO studentupdateDTO)
    {
        if(studentrepo.existsById(id)){
            Student student=studentrepo.getReferenceById(studentupdateDTO.getid());
            student.setstudentname(studentupdateDTO.getstudentname());
            student.setstudentaddress(studentupdateDTO.getstudentaddress());
            student.setmobile(studentupdateDTO.getmobile());
            studentrepo.save(student);
            return student.toString();
        }
        else
        {
            return "Roll Number does not Exist";
        }
    }

    @Override
    public String deleteStudent(int id)
    {
        if(studentrepo.existsById(id))
        {
            studentrepo.deleteById(id);
            return "Deleted";
        }
        else{
            return "Roll Number not found";
        }
    }
    @Override
    public StudentDTO getstudentById(int id)
    {
        Student student = studentrepo.findById(id).get();
        StudentDTO studentDTO = new StudentDTO(
            student.getid(),
            student.getstudentname(),
            student.getstudentaddress(),
            student.getmobile()
        );
        return studentDTO;
    }
}
