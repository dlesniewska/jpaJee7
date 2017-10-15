package pl.dag.jpajee7.commons.model.pl.dag.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Project implements Serializable {

    @Id
    @GeneratedValue(generator = "PROJECT_SEQ_GEN")
    @SequenceGenerator(name = "PROJECT_SEQ_GEN", sequenceName = "PROJECT_SEQ")
    private Long id;

    @Column(name = "NAME", length = 50)
    private String name;

    @Column(name = "subject")
    private String subject;

    @Enumerated(EnumType.STRING)
    @Column(name = "PROJECT_TYPE", length = 50)
    private ProjectType type;

    @Version
    private Long version;

    public Project() {
    }

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

    public ProjectType getType() {
        return type;
    }

    public void setType(ProjectType type) {
        this.type = type;
    }
}
