package model.dao;

import model.Bus;

import java.awt.*;
import java.util.Collection;
import java.util.List;

public interface BusDao {

    void add(Bus bus);

    void update(Bus bus);

    void delete(Bus bus);

    Collection<Bus> getBus(String search);

    public List findByBus(String busNmb, String busModel, Integer colPlace, Image busLayout);

}
