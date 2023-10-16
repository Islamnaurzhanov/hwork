package com.telran.org.homWorkTwo;

public class Phone {
    private String phoneName;


    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void call (String phoneNumber){
        System.out.println(" try to make a call to number " + phoneNumber);
    }
    public void receiveCall ( String phoneNumber){
        System.out.println( "  try to receive a call from number " + phoneNumber );
    }

}
