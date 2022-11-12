package org.example;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    private Map<String, String> contacts;

    public PhoneBook(){
        contacts = new TreeMap<>();
    }


    public int add(String name, String number){
        contacts.put(name, number);
        return contacts.size();
    }

    public String findByNumber(String number){
        return null;
    }



    public int getContactsSize(){
        return contacts.size();
    }

}
