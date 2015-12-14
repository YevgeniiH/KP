package domain;

import model.User;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, String> pass;
	public static volatile SingularAttribute<User, LocalDate> dob;
	public static volatile SingularAttribute<User, String> surname;
	public static volatile SingularAttribute<User, String> name;
	public static volatile SingularAttribute<User, Long> tel;
	public static volatile SingularAttribute<User, String> login;
	public static volatile SingularAttribute<User, String> email;
	public static volatile SingularAttribute<User, String> status;

}

