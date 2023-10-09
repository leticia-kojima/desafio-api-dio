package projeto.dio.desafioapi.service.impl;

import org.springframework.stereotype.Service;
import projeto.dio.desafioapi.model.Student;
import projeto.dio.desafioapi.repository.StudentRepository;
import projeto.dio.desafioapi.service.StudentService;

import java.util.NoSuchElementException;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public Student findById(Long id){
        if(!studentRepository.existsById(id)){
            throw new IllegalArgumentException("This student does not exists");
        }
        return studentRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Student create(Student studentToCreate) {
        //if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
        if(studentRepository.existsById(studentToCreate.getId())){
            throw new IllegalArgumentException("This student already exists");
        }

        return studentRepository.save(studentToCreate);

    }

    @Override
    public Student delete(Long id) {
        //if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
        if(!studentRepository.existsById(id)){
            throw new IllegalArgumentException("This student does not exists");
        }

        studentRepository.deleteById(id);
        return null;
    }

}
