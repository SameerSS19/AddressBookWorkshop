package com.address;

public class ContactDetails {
    /*
    *Instance variable
     */
    private String firstName, lastName, city, state, email, zip,mobileNo ;
    /*
    *Parameter Constructor
    * @firstName
    * @lastName
    * @city
    * @state
    * @mobileNo
    * @zip
     */
    public ContactDetails(String firstName, String lastName, String city, String state,
                          String email, String mobileNo, String zip) {
        setFirstName(firstName);
        setLastName(lastName);
        setCity(city);
        setState(state);
        setEmail(email);
        setPhoneNumber(mobileNo);
        setZip(zip);

    }
    /*
    *Using Getter Method
     */
    public String getFirstName() {
        return firstName;
    }

    /*
     *Using Setter Method
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /*
     *Using Getter Method
     */
    public String getLastName() {
        return lastName;
    }

    /*
     *Using Setter Method
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /*
     *Using Getter Method
     */
    public String getCity() {
        return city;
    }

    /*
     *Using Setter Method
     */
    public void setCity(String city) {
        this.city = city;
    }

    /*
     *Using Getter Method
     */
    public String getState() {
        return state;
    }

    /*
     *Using Setter Method
     */
    public void setState(String state) {
        this.state = state;
    }

    /*
     *Using Getter Method
     */
    public String getEmail() {
        return email;
    }

    /*
     *Using Setter Method
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /*
     *Using Getter Method
     */
    public String getZip() {
        return zip;
    }

    /*
     *Using Setter Method
     */
    public void setZip(String zip) {
        this.zip = zip;
    }
    /*
     *Using Getter Method
     */
    public String getPhoneNumber() {
        return mobileNo;
    }

    /*
     *Using Setter Method
     */
    public void setPhoneNumber(String mobileNo) {
        this.mobileNo = mobileNo;
    }

}