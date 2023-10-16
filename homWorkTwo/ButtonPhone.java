package com.telran.org.homWorkTwo;

public class ButtonPhone extends Phone {

    private String ownNumber;

    public String getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(String ownNumber) {
        this.ownNumber = ownNumber;
    }

    @Override
    public void call(String phoneNumber) {
        System.out.print( " The phone " + getPhoneName() + " " + getOwnNumber());

        super.call(phoneNumber);
    }

    @Override
    public void receiveCall(String phoneNumber) {
        System.out.print( "The phone " + getPhoneName() + " " + getOwnNumber());

        super.receiveCall(phoneNumber);
    }
}
