package basic.dto;

import basic.entity.Student;
import lombok.Getter;
import lombok.ToString;


@ToString
@Getter
public class StudentDTO {

    private String name;

    protected StudentDTO(){}

    private StudentDTO(String name){
        this.name = name;
    }

    public static StudentDTO of(String name){
        return new StudentDTO(name);
    }
    public static StudentDTO from (Student student){
        return StudentDTO.of(student.getName());
    }

    public static Student toEntity (StudentDTO studentDTO){
        return Student.of(studentDTO.getName());
    }

}
