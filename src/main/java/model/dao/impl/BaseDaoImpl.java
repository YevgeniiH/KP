package model.dao.impl;

import model.Base;
import model.dao.BaseDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;

public class BaseDaoImpl implements BaseDao {

    @PersistenceContext
    private EntityManager emf;

}
