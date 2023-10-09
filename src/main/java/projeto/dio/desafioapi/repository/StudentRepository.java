package projeto.dio.desafioapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.dio.desafioapi.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    boolean existsById(Long id);

}
