package pl.dag.jpajee7.commons.model.pl.dag.model;


import javax.persistence.*;
import java.util.Set;

/**
 * Użytkownik
 */
@Entity
@Table(name = "T_USER")
public class User {

    @Id
    private Long id;

    /**
     * Nazwa użytkownika / login
     */
    @Column(name = "USER_NAME")
    private String name;

    /**
     * Flaga - czy użytkownik aktywny
     */
    private boolean active;

    @OneToMany
    @JoinTable(name = "T_USER_ROLES", joinColumns = @JoinColumn(name = "USER_ID"), inverseJoinColumns = @JoinColumn(name = "ROLE_ID"),
            indexes = {
                    @Index(name = "T_USER_ROLE_USER_ID_IDX", columnList = "USER_ID"),
                    @Index(name = "T_USER_ROLE_ROLE_ID_IDX", columnList = "ROLE_ID")
            })
    private Set<Role> roles;

    public User() {
    }
}
