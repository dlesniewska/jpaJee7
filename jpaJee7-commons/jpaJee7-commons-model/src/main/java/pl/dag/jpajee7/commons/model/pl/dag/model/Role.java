package pl.dag.jpajee7.commons.model.pl.dag.model;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "T_ROLE")
public class Role {
    @Id
    private Long id;

    @Column(name = "ROLE_NAME")
    private String name;

    @ManyToMany
    @JoinTable(name = "T_ROLE_PRIVILEGE", joinColumns = @JoinColumn(name = "ROLE_ID"), inverseJoinColumns = @JoinColumn(name = "PRIV_ID"),
            indexes = {
                    @Index(name = "T_ROLE_PRIVILEGE_ROLE_ID_IDX", columnList = "ROLE_ID"),
                    @Index(name = "T_ROLE_PRIVILEGE_PRIV_ID_IDX", columnList = "PRIV_ID")
            })
    private Set<Privilege> privileges;

    public Role() {
    }
}
