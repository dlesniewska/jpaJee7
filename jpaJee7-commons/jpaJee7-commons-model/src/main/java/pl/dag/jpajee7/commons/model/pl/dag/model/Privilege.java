package pl.dag.jpajee7.commons.model.pl.dag.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="T_PRIVILEGE")
public class Privilege {

    @Id
    private Long id;

    @Column(name = "PRIVILEGE_NAME")
    private String name;

    public Privilege() {
    }

}
