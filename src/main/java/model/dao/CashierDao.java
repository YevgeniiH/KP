package model.dao;

import model.Cashier;

import java.util.Collection;
import java.util.List;

public interface CashierDao {

    void add(Cashier cashier);

    void update(Cashier cashier);

    void delete(Cashier cashier);

    Collection<Cashier> getBus(String search);

    public List findByBus(Integer idUser);

}
