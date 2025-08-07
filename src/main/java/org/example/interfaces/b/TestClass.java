package org.example.interfaces.b;


import org.example.interfaces.c.House;

public class TestClass {

    public static void main(String[] args) {

        HomeOffice homeOffice = new HomeOffice();
        System.out.println(homeOffice.getAddress()); //2

        House house = new HomeOffice();  //1
        System.out.println(house.getAddress()); //2

        Office office = new HomeOffice();  //1
        System.out.println(office.getAddress()); //2

        System.out.println();
    }
}
