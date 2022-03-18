package cigma.pfe.dao;

import cigma.pfe.models.Client;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ClientDaoImpl implements IClientDao {
    @PersistenceContext
    IClientDao iClientDao;
    private EntityManager em;



    @Override
    public Client save(Client c) {
        em.merge(c);
        return null;
    }

    public ClientDaoImpl(){
        System.out.println("creation bean dao");
    }

}
