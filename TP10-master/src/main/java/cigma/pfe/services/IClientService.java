package cigma.pfe.services;

import cigma.pfe.dao.IClientDao;
import cigma.pfe.models.Client;

public interface IClientService {
    public Client save(Client c);
    public IClientDao getiClientDao();
}

