package springbootwebsecurity.sbwebsecurity.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import springbootwebsecurity.sbwebsecurity.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class RoleDaoImp implements RoleDao{

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<Role> getRoles() {
        Query query = entityManager.createQuery("from Role");
        List<Role> result = query.getResultList();
        return result;
    }
}
