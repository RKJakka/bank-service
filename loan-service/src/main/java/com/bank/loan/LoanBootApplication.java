package com.bank.loan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoanBootApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "LoanBootApplication!" );
        SpringApplication.run(LoanBootApplication.class, args);
    }	
}
