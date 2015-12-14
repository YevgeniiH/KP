package model.dao;

import model.Town;

import java.util.Collection;
import java.util.List;

public interface TownDao {

    void add(Town town);

    void update(Town town);

    void delete(Town town);

    Collection<Town> getTown(String search);

    public List findByTown(String city);

}
