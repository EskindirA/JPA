package entities;

import entities.Address;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-29T15:36:38")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Address> address;
    public static volatile SingularAttribute<User, Long> id;
    public static volatile SingularAttribute<User, String> username;

}