package com.example.demo.api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.api.model.customer;
import com.example.demo.service.customerService;

@RestController
public class customerController 
{

    private customerService customerService;

    public customerController(customerService customerService)
    {
        this.customerService = customerService;
    }
    
    @GetMapping("/customer")
    public customer getUser(@RequestParam Integer id)
    {
        return customerService.getCustomer(id);
    }
}
