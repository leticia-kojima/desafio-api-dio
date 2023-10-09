package projeto.dio.desafioapi.service;

import projeto.dio.desafioapi.model.Student;

public interface StudentService {

    Student findById(Long id);

    Student create(Student studentToCreate);

    Student delete(Long id);
}
