package projeto.dio.desafioapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import projeto.dio.desafioapi.model.Professor;
import projeto.dio.desafioapi.service.ProfessorService;

import java.net.URI;

@RestController
@RequestMapping("/professor")
public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService){
        this.professorService = professorService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Professor> findById(@PathVariable Long id){
        var professor = professorService.findById(id);
        return ResponseEntity.ok(professor);
    }

}
