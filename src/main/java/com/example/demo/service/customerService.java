package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.api.model.customer;
import com.example.demo.api.model.enums;

@Service
public class customerService 
{
    
        private List<customer> customers = new ArrayList<customer>();
    
        public customerService() 
        {
            double[] cart1 = {1.0, 2.0, 3.0};
            double[] cart2 = {4.0, 5.0, 6.0};
            double[] cart3 = {7.0, 8.0, 9.0};
            double[] cart4 = {10.0, 11.0, 12.0};
            double[] cart5 = {13.0, 14.0, 15.0};
            customer customer1 = new customer(true, enums.age._18_30, true, false, true, enums.day.Montag, enums.time._10, enums.distance._10km, enums.salary._1000, cart1);
            customer customer2 = new customer(false, enums.age._31_40, false, true, false, enums.day.Dienstag, enums.time._10_12, enums.distance._10_25km, enums.salary._1000_2000, cart2);
            customer customer3 = new customer(true, enums.age._41_50, true, false, true, enums.day.Mittwoch, enums.time._14_17, enums.distance._25km, enums.salary._2000_3200, cart3);
            customer customer4 = new customer(false, enums.age._51_60, false, true, false, enums.day.Donnerstag, enums.time._17, enums.distance._10km, enums.salary._3200_4500, cart4);
            customer customer5 = new customer(true, enums.age._60, true, false, true, enums.day.Freitag, enums.time._10, enums.distance._10_25km, enums.salary._4500, cart5);
            customers.add(customer1);
            customers.add(customer2);
            customers.add(customer3);
            customers.add(customer4);
            customers.add(customer5);
        }
    
        public customer getCustomer(Integer id) 
        {
            for (customer customer: customers) 
            {
                if (customer.getId() == id) 
                {
                    return customer;
                }
            }
            return null;
        }
    
}
