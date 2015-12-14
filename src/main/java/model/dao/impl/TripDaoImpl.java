package model.dao.impl;

import model.Trip;
import model.dao.TripDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;

public class TripDaoImpl implements TripDao {

    @PersistenceContext
    private EntityManager emf;

}
