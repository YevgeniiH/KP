package domain;

import model.Trip;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Trip.class)
public abstract class Trip_ {

	public static volatile SingularAttribute<Trip, LocalTime> timeTripTo;
	public static volatile SingularAttribute<Trip, LocalDate> dateTripTo;
	public static volatile SingularAttribute<Trip, Double> price;
	public static volatile SingularAttribute<Trip, LocalDate> dateTripFrom;
	public static volatile SingularAttribute<Trip, LocalTime> timeTripFrom;

}

