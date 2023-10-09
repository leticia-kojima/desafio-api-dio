package projeto.dio.desafioapi.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_professor")
public class Professor {

    @Id
    //@Column(name = "id_professor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String subject;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
