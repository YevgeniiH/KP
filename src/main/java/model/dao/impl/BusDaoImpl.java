package model.dao.impl;

import model.Bus;
import model.dao.BusDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;

public class BusDaoImpl implements BusDao {

    @PersistenceContext
    private EntityManager emf;

}
