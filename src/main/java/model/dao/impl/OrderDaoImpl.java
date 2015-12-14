package model.dao.impl;

import model.Order;
import model.dao.OrderDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;

public class OrderDaoImpl implements OrderDao {

    @PersistenceContext
    private EntityManager emf;

}
