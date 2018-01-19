package com.praveen.session8assignment2;

/**
 * Created by Praveen on 19/01/2018.
 */

public class Contact {
    public String name;
    public String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name Sets the name of the contact
     *
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber Sets the phoneNumber of the contact
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
