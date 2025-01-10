package basic.service;

import basic.dto.StudentDTO;
import basic.entity.Student;
import basic.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Transactional
    public List<StudentDTO> getStudents(){
        return studentRepository.findAll().stream()
                .map(StudentDTO::from)
                .toList();

    }


    @Transactional
    public StudentDTO postStudent(StudentDTO studentDTO) {
        Student student = studentRepository.save(StudentDTO.toEntity(studentDTO));
        System.out.println(student);
        return StudentDTO.from(student);

    }
}
