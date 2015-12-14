package model.dao;

import model.Trip;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;
import java.util.List;

public interface TripDao {

    void add(Trip trip);

    void update(Trip trip);

    void delete(Trip trip);

    Collection<Trip> getTrip(String search);

    public List findByTrip(String tFrom, String tTo, LocalDate dateTripFrom, LocalDate dateTripTo, LocalTime timeTripFrom, LocalTime timeTripTo, Double price);

}
