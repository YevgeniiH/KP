package model.dao.impl;

import model.CompInfo;
import model.dao.CompInfoDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;

public class CompInfoDaoImpl implements CompInfoDao {

    @PersistenceContext
    private EntityManager emf;

}
