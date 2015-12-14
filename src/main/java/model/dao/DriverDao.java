package model.dao;

import model.Driver;

import java.util.Collection;
import java.util.List;

public interface DriverDao {

    void add(Driver driver);

    void update(Driver driver);

    void delete(Driver driver);

    Collection<Driver> getDriver(String search);

    public List findByDriver(String busNmb, Integer idUser);

}
