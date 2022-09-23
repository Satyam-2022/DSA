package Inheritance1;

import java.util.Scanner;
import java.util.SortedMap;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Address address=new Address();

        System.out.println("Enter Id =");
        int id= scanner.nextInt();
        System.out.println("Enter firstName =");
        String firstname= scanner.next();
        System.out.println("Enter the lastName =");
        String lastname= scanner.next();
        System.out.println("Enter mobileNumber =");
        double mobileNumber= scanner.nextInt();
        System.out.println("Enter cityName =");
        String cityName= scanner.next();
        System.out.println("Enter state =");
        String state= scanner.next();

        address.setId(id);
        address.setFirstname(firstname);
        address.setLastname(lastname);
        address.setMobileNumber(mobileNumber);
        address.setCityName(cityName);
        address.setState(state);
        System.out.println();

        System.out.println("ID ="+address.getId());
        System.out.println("firstName ="+address.getFirstname());
        System.out.println("lastName ="+address.getLastname());
        System.out.println("mobileNumber ="+address.getMobileNumber());
        System.out.println("cityName ="+address.getCityName());
        System.out.println("State ="+address.getState());







    }
}
