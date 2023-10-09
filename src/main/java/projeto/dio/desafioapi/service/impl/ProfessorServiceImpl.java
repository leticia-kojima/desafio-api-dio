package projeto.dio.desafioapi.service.impl;

import org.springframework.stereotype.Service;
import projeto.dio.desafioapi.model.Professor;
import projeto.dio.desafioapi.repository.ProfessorRepository;
import projeto.dio.desafioapi.service.ProfessorService;

import java.util.NoSuchElementException;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorServiceImpl(ProfessorRepository professorRepository){
        this.professorRepository = professorRepository;
    }

    @Override
    public Professor findById(Long id) {
        return professorRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

}
