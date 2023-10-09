package projeto.dio.desafioapi.model;

import jakarta.persistence.*;

@Entity(name = "tb_reports_student")
public class Reports {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long grades;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGrades() {
        return grades;
    }

    public void setGrades(Long grades) {
        this.grades = grades;
    }
}
