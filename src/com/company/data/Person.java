/**
 * <p>Title: FundCount, LLC</p>
 * <p>Description: FundCount project</p>
 * <p>Copyright: Copyright (c) 2001 FundCount, LLC</p>
 * <p>Company: FundCount, LLC</p>
 */
package com.company.data;


import com.company.*;
import org.hibernate.*;

public class Person
{
    Long id;
    String name;
    int age;
    Car car;

    public Person()
    {
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Car getCar()
    {
        return car;
    }

    public void setCar(Car car)
    {
        this.car = car;
    }

    public void print()
    {
        System.out.println("My name is " + name +", I am " + age + " years old.");
        if (car != null)
        {
            System.out.print("I have a " + getCar().getModel() + ".");
        }
    }
}
