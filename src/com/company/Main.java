package com.company;

import static com.company.util.HibernateUtil.*;

import java.util.*;

import com.company.data.*;
import com.company.util.*;
import org.hibernate.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person = new Person("Max", 22);
        Car car = new Car("Lamborghini");
        deleteAllPeople();
        deleteAllCars();

        save(person);

        person = getAllPeople().get(0); // refresh person

        car.setOwner(person);
        save(car);

        Transaction t = getSession().beginTransaction();
        person = (Person) getSession().createQuery("FROM Person").list().get(0);
        person.print();
        t.rollback();
    }

    public static Session getSession()
    {
        return getSessionFactory().getCurrentSession();
    }

    public static void save(Object o)
    {
        Transaction t = getSession().beginTransaction();
        getSession().save(o);
        t.commit();
    }

    public static void refresh(Object o)
    {
        Transaction t = getSession().beginTransaction();
        getSession().refresh(o);
        t.commit();
    }

    public static List<Person> getAllPeople()
    {
        Transaction t = getSession().beginTransaction();
        List result = getSession().createQuery("FROM Person").list();
        t.rollback();
        return result;
    }

    public static void deleteAllPeople()
    {
        Transaction t = getSession().beginTransaction();
        getSession().createQuery("DELETE FROM Person").executeUpdate();
        t.commit();
    }
    public static void deleteAllCars()
    {
        Transaction t = getSession().beginTransaction();
        getSession().createQuery("DELETE FROM Person").executeUpdate();
        t.commit();
    }
}
