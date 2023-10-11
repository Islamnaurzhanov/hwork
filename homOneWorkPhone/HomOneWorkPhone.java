package homOneWorkPhone;

public class HomOneWorkPhone {
    public static void main (String[]args){
        Phone phone0 = new Phone(" +7465859 ", " Samsung C100 ", 0.45 );
        Phone phone1 = new Phone( " + 7589965 ", " Nokia 6300 ", 0.80);
        Phone phone2 = new Phone( " + 7852554 ", " iPhpone 15 PRO ", 0.66 );

        System.out.println( " Дынные первого Звонящего : " );
        System.out.println( " Номер :  " + phone0.getNumber() );
        System.out.println( " Модель :  " + phone0.getModel() );
        System.out.println( " Вес :  " + phone0.getWeight() );

        System.out.println();

        System.out.println( " Дынные Второго Звонящего : " );
        System.out.println( " Номер :  " + phone1.getNumber() );
        System.out.println( " Модель :  " + phone1.getModel() );
        System.out.println( " Вес :  " + phone1.getWeight() );

        System.out.println();

        System.out.println( " Дынные Третьего Звонящего : " );
        System.out.println( " Номер :  " + phone2.getNumber() );
        System.out.println( " Модель :  " + phone2.getModel() );
        System.out.println( " Вес :  " + phone1.getWeight() );


        phone0.receiveCall("Bella");
        phone1.receiveCall("Naur");
        phone2.receiveCall("ialam");




    }
}

