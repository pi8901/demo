package com.example.demo.api.model;
import com.example.demo.api.model.enums.*;

public class customer 
{
    private static int idCounter = 0;
    private int id;
    private boolean isMale;
    private age age;
    private boolean hasChildren;
    private boolean isSingle;
    private boolean hasJob;
    private day day;
    private time time;
    private distance distance;
    private salary salary;
    private double[] cart;

    public customer(boolean isMale, age age, boolean hasChildren, boolean isSingle, boolean hasJob, day day, time time, distance distance, salary salary, double[] cart)
    {
        this.isMale = isMale;
        this.age = age;
        this.hasChildren = hasChildren;
        this.isSingle = isSingle;
        this.hasJob = hasJob;
        this.day = day;
        this.time = time;
        this.distance = distance;
        this.salary = salary;
        this.cart = cart;
        this.id = idCounter++;
    }

    public boolean getIsMale()
    {
        return isMale;
    }

    public age getAge()
    {
        return age;
    }

    public boolean getHasChildren()
    {
        return hasChildren;
    }

    public boolean getIsSingle()
    {
        return isSingle;
    }

    public boolean getHasJob()
    {
        return hasJob;
    }

    public day getDay()
    {
        return day;
    }

    public time getTime()
    {
        return time;
    }

    public distance getDistance()
    {
        return distance;
    }

    public salary getSalary()
    {
        return salary;
    }

    public double[] getCart()
    {
        return cart;
    }

    public int getId()
    {
        return id;
    }
}
