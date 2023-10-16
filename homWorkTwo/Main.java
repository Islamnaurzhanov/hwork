package com.telran.org.homWorkTwo;

public class Main {
    public static void main(String[] args) {

        ButtonPhone buttonPhone = new ButtonPhone();
        SmartPhone smartPhone = new SmartPhone();
        RadioPhone radioPhone = new RadioPhone();

        buttonPhone.setPhoneName("Nokia 6230");
        buttonPhone.setOwnNumber("22222222");
        buttonPhone.call("33333333");
        buttonPhone.receiveCall("44444444");

        radioPhone.setPhoneName( "Panasonic  c - 580 ");
        radioPhone.setOwnNumber("555555555");
        radioPhone.call( "666666666");
        radioPhone.receiveCall( "7777777777");

        smartPhone.setPhoneName("Samsung s - 21 ");
        smartPhone.setOwnNumber("8888888888");
        smartPhone.call("999999999");
        smartPhone.receiveCall("111111111");

        makeCall(buttonPhone, "1212121212");
        receiveCall(buttonPhone, " 133131313131");
        makeCall(radioPhone, "14141414141");
        receiveCall(radioPhone, "151551515151");
        makeCall(smartPhone, "16161616161616");
        receiveCall(smartPhone, "171717171717");


    }
    public static void makeCall (Phone phone, String phoneNumber){
        phone.call(phoneNumber);
    }
    public static void receiveCall (Phone phone, String phoneNumber ){
        phone.receiveCall(phoneNumber);
    }

}
