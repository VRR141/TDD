package org.example;

import java.util.Map;
import java.util.Set;
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
        String result;

        Set<Map.Entry<String, String>> entrySet = contacts.entrySet();
        for (Map.Entry<String, String> pair: entrySet){
            if (number.equals(pair.getValue())){
                result = pair.getValue();
                return result;
            }
        }
        return "not found";
    }



    public int getContactsSize(){
        return contacts.size();
    }

}
