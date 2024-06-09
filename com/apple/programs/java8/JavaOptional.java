package com.apple.programs.java8;

import java.util.Optional;

public class JavaOptional {
    public static void main(String[] args){
        Optional<House> house = Optional.empty();
        Optional<House> house2 = Optional.of(new House());
       House house3 = null;
        System.out.println(house +"   empty");
        System.out.println(house2 + "   object");
    }
}

class Person
{
    //house declared as an Optional

    Optional<House> house;

    public Optional<House> getHouse()
    {
        return house;
    }
}

class House
{
    //houseLoan declared as an Optional

    Optional<HouseLoan> houseLoan;

    public Optional<HouseLoan> getHouseLoan()
    {
        return houseLoan;
    }
}

class HouseLoan
{
    String houseLoanDetails;

    public String getHouseLoanDetails()
    {
        return houseLoanDetails;
    }
}
