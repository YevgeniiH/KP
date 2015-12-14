package model.dao.impl;

import model.Driver;
import model.dao.DriverDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;

public class DriverDaoImpl implements DriverDao {

    @PersistenceContext
    private EntityManager emf;

}
