package projeto.dio.desafioapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.dio.desafioapi.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    boolean existsById(Long id);
}
