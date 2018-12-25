package com.bank.insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InsuranceBootApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "InsuranceBootApplication!" );
        SpringApplication.run(InsuranceBootApplication.class, args);
    }
}
