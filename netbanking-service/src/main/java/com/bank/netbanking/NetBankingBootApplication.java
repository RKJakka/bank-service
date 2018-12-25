package com.bank.netbanking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NetBankingBootApplication 
{
    public static void main( String[] args )
    {
        System.out.println( "NetBankingBootApplication!" );
        SpringApplication.run(NetBankingBootApplication.class, args);
    }
}
