package com.address;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressBook {
    /*
    *Creating a main method
     */
    public static void main(String[] args)
    {
        System.out.println("Welcome in Address Book Workshop");
        ArrayList<ContactDetails> personDetail= createContact();

    }
    /*
    *Creating method
    *Validation of First name and Last name using regex pattern
     * @return the boolean value
     */
    public static boolean  givenFirstName_LastName_validname(String name)
    {
        String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
        Pattern p = Pattern.compile(regex);
        if (name == null)
        {
            return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();
    }
    /*
    *Create method
    * Validation of city given using regex pattern.
     * @return the boolean value
     */
    public static boolean givenCity(String city)
    {
        String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
        Pattern p = Pattern.compile(regex);
        if (city == null)
        {
            return false;
        }
        Matcher m = p.matcher(city);
        return m.matches();
    }
    /*
     *Create method
     * Validation of State given using regex pattern.
     * @return the boolean value
     */

    public static boolean givenState(String state)
    {
        String regex = "^[A-Z]{1}[a-z A-Z]{2,}$";
        Pattern p = Pattern.compile(regex);
        if (state == null)
        {
            return false;
        }
        Matcher m = p.matcher(state);
        return m.matches();
    }
    /*
     *Create method
     * Validation of Zip given using regex pattern.
     * @return the boolean value
     */

    public static boolean givenZip(String zip)
    {
        String regex = "^[0-9]{8}$";
        Pattern p = Pattern.compile(regex);
        if (zip == null)
        {
            return false;
        }
        Matcher m = p.matcher(zip);
        return m.matches();
    }
    /*
     *Create method
     * Validation of Email given using regex pattern.
     * @return the boolean value
     */
    public static boolean given_email(String email)
    {

        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern p = Pattern.compile(regex);
        if (email == null)
        {
            return false;
        }
        Matcher m = p.matcher(email);
        return m.matches();
    }
    /*
     *Create method
     * Validation of Mobile number given using regex pattern.
     * @return the boolean value
     */

    public static boolean given_the_MobileNo(String mobileNo)
    {
        String regexMobileNo = "^[9][1]\\s[6-9]{1}[0-9]{9}$";
        Pattern p = Pattern.compile(regexMobileNo);
        if ( mobileNo == null )
        {
            return false;
        }
        Matcher m = p.matcher(mobileNo);

        return m.matches();
    }
    /**
     * This method is use to create contact and store the value into the array
     * @return
     */

    public static ArrayList<ContactDetails> createContact()
    {
        ArrayList<ContactDetails> PersonDetail = new ArrayList<ContactDetails>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First name : ");
        String fname = input.nextLine();
        System.out.println( givenFirstName_LastName_validname(fname));

        System.out.print("Enter the Last name : ");
        String lname = input.nextLine();
        System.out.println( givenFirstName_LastName_validname(lname));

        System.out.print("Enter the City : ");
        String city = input.nextLine();
        System.out.println(givenCity (city));

        System.out.print("Enter the state : ");
        String state = input.nextLine();
        System.out.println(givenState(state));

        System.out.print("Enter the Zip Code : ");
        String zip = input.nextLine();
        System.out.println( givenZip(zip));

        System.out.print("Enter the Mobile number: ");
        String mobile = input.nextLine();
        System.out.println(given_the_MobileNo(mobile));

        System.out.print("Enter the Email: ");
        String email = input.nextLine();
        System.out.println(given_email(email));


        PersonDetail.add(new ContactDetails(fname, lname,city, state, zip, mobile, email));

        for (ContactDetails str : PersonDetail)
        {
            System.out.println(str + " ");
        }
        return PersonDetail;
    }
}