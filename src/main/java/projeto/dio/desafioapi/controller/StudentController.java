package projeto.dio.desafioapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import projeto.dio.desafioapi.model.Student;
import projeto.dio.desafioapi.service.StudentService;

import java.net.URI;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> findById(@PathVariable Long id){
        var student = studentService.findById(id);
        return ResponseEntity.ok(student);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Student> create(@RequestBody Student studentToCreate){
        var studentCreated = studentService.create(studentToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(studentCreated.getId())
                .toUri();

        return ResponseEntity.created(location).body(studentCreated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Student> delete(@PathVariable Long id) {
        var studentDeleted = studentService.delete(id);

        return ResponseEntity.ok(studentDeleted);

    }


}
