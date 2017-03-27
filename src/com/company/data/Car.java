/**
 * <p>Title: FundCount, LLC</p>
 * <p>Description: FundCount project</p>
 * <p>Copyright: Copyright (c) 2001 FundCount, LLC</p>
 * <p>Company: FundCount, LLC</p>
 */
package com.company.data;

public class Car
{
    Long id;
    String model;
    Person owner;

    public Car()
    {}

    public Car(String model)
    {
        this.model = model;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public Person getOwner()
    {
        return owner;
    }

    public void setOwner(Person owner)
    {
        this.owner = owner;
    }
}
