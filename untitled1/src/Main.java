import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int расходна100 = 12;
        int price = 50;
        System.out.println(" Программа доходов и расходов компании !!! ");
        System.out.println(" Введите имя водителя :");

        Scanner scanner = new Scanner( System.in);
        String name = scanner.nextLine();

        System.out.println( " Привет " + name +'!' +  " Считаем твой доход : ");

        System.out.println("введи доход за денелю:");
        int number1 = scanner.nextInt();

        Scanner scanner2 = new Scanner( System.in);
        System.out.println("введи пройденый км:");

        int number2 = scanner.nextInt();

        System.out.println( name + " Израсхоровал топливо: " + number2 /100 * расходна100 + " Литра.") ;
        System.out.println();

        System.out.println(" Стоимость  расхода на топливо : " + number2 /100 * расходна100 * price + " Рублей" ) ;
        System.out.println();

        System.out.println( " Уплачено налогов на сумму :"  + number1 * 15 / 100 + " Рублей" );
        System.out.println();

        System.out.println( "ОБЩИЙ ДОХОВ : ");
        System.out.println();
        System.out.println(number1 - (number2 /100 * расходна100 * price) - number1 * 15 / 100  + " Рублей. " );

    }
}