package com.address;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        //Welcome Statement
        System.out.println("Welcome to Address Book Workshop");
        //Create a object
        List<String> contact = new ArrayList<String>();
        //Create a Scanner Object
        Scanner input  = new Scanner(System.in);
        //Statement and user input
        System.out.println("Enter the First Name");
        String fname = input.nextLine();
        System.out.println("Enter the Last Name");
        String lname = input.nextLine();
        System.out.println("Enter the Email Id");
        String email = input.nextLine();
        System.out.println("Enter the Mobile Number");
        String mobile = input.nextLine();
        System.out.println("Enter the City Name");
        String city = input.nextLine();
        System.out.println("Enter the State Name");
        String state = input.nextLine();
        System.out.println("Enter the Full Address");
        String full = input.nextLine();
        System.out.println("Enter the Pin code");
        String pin = input.nextLine();
        //Adding a Elements
        contact.add(fname);
        contact.add(lname);
        contact.add(email);
        contact.add(mobile);
        contact.add(city);
        contact.add(state);
        contact.add(full);
        contact.add(pin);
        //Using for loop all information shows
        for (String str : contact)
        {
            System.out.println(str);
        }
    }
}
