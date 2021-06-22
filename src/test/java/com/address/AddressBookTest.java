package com.address;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class AddressBookTest {
    /**
     * Create method
     * The test case is use validate the First Name test
     * the boolean value
     */

    @Test
    public void firstNameTest()
    {
        AddressBook FirstName = new AddressBook();
        boolean result = FirstName. givenFirstName_LastName_validname("Sameer");
        assertEquals(true,result);
    }

    /**
     * Create method
     * The test case is use validate the Last Name test
     * the boolean value
     */

    @Test
    public void lastNameTest()
    {
        AddressBook LastName = new AddressBook();
        boolean result = LastName. givenFirstName_LastName_validname("Kassar");
        assertEquals(true,result);
    }

    /**
     * Create method
     * The test case is use validate the City test
     * the boolean value
     */

    @Test
    public void cityTest()
    {
        AddressBook city = new AddressBook();
        boolean result = city. givenCity("Ghaziabad");
        assertEquals(true,result);
    }

    /**
     * Create method
     * The test case is use validate the State test
     * the boolean value
     */

    @Test
    public void stateTest()
    {
        AddressBook city = new AddressBook();
        boolean result = city. givenState("Uttar Pradesh");
        assertEquals(true,result);
    }
    /**
     * Create method
     * The test case is use validate the Zip test
     * the boolean value
     */
    @Test
    public void zipTest()
    {
        AddressBook city = new AddressBook();
        boolean result = city. givenZip("29299887");
        assertEquals(true,result);
    }
    /**
     * Create method
     * The test case is use validate the Email test
     * the boolean value
     */
    @Test
    public void emailTest()
    {
        AddressBook email = new AddressBook();
        boolean result = email. given_email("abc@gmail.com");
        assertEquals(true,result);
    }
    /**
     * Create method
     * The test case is use validate the mobile number
     * the boolean value
     */
    @Test
    public void mobileNumValidation()
    {
        AddressBook mobileNum = new AddressBook();
        boolean result = mobileNum.given_the_MobileNo("91 9971085389");
        assertEquals(true,result);
    }
}