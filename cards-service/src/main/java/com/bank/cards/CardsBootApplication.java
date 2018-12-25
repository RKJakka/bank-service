package com.bank.cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardsBootApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "CardsBootApplication!" );
        SpringApplication.run(CardsBootApplication.class, args);
    }	
}
