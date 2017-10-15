package pl.dag.jpajee7.commons.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.dag.jpajee7.commons.model.pl.dag.model.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


/**
 * Serwis CRUD dla encji User
 */
@Stateless
public class UserService {

    private static Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @PersistenceContext()
    private EntityManager em;

    /**
     * Pobierz wszystkich aktywnych użytkowników systemu
     * @return Lista wszystkich użytkowników systemu
     */
    public List<User> getAll() {
        List<User> result = em.createQuery("select u from User u where active = 1", User.class).getResultList();
        LOGGER.info("Found {} users to examinate", result.size());
        return result;
    }



}
