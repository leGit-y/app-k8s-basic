package basic.controller;

import basic.dto.StudentDTO;
import basic.service.StudentService;
import basic.dto.StudentDTO;
import basic.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/students")
@RestController
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public List<StudentDTO> getStudents(){

        List<StudentDTO> students = studentService.getStudents();

        return students;
    }

    @PostMapping
    public StudentDTO postStudent(@RequestBody StudentDTO studentDTO){

        System.out.println(studentDTO);
        StudentDTO student = studentService.postStudent(studentDTO);

        return student;
    }
}
