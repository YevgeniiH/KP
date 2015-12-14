package model.dao;

import model.Base;

import java.util.Collection;
import java.util.List;

public interface BaseDao {

    void add(Base base);

    void update(Base base);

    void delete(Base base);

    Collection<Base> getBase(String search);

    public List findByBase(Integer id);

}
