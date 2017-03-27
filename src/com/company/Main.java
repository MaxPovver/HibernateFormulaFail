package com.company;

import static com.company.util.HibernateUtil.*;

import com.company.data.*;
import com.company.util.*;
import org.hibernate.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person = new Person("Max", 22);
        Transaction transaction = getSessionFactory().getCurrentSession().beginTransaction();
        getSessionFactory().getCurrentSession().save(person);
        transaction.commit();
    }
}
