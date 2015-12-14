package model.dao.impl;

import model.Cashier;
import model.dao.CashierDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;

public class CashierDaoImpl implements CashierDao {

    @PersistenceContext
    private EntityManager emf;

}
