package model.dao.impl;

import model.Town;
import model.dao.TownDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;

public class TownDaoImpl implements TownDao {

    @PersistenceContext
    private EntityManager emf;

}
