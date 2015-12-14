package model.dao;

import model.Order;

import java.util.Collection;
import java.util.List;

public interface OrderDao {

    void add(Order order);

    void update(Order order);

    void delete(Order order);

    Collection<Order> getOrder(String search);

    public List findByOrder(Integer idTrip, Integer place, String statusO);

}
