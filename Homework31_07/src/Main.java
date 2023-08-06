
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);

        System.out.println(" Привет это небольшой опросник на проверку твоего уровня iQ :");
        System.out.println(" ВВедите ваше имя");

        String name = scanner.next();


        System.out.println(" 😉 Отлично 😉 " + name + "  Если вы готовы ПОГНАЛИ 🏍 .....");
        System.out.println();

        System.out.println(" Начнем с математики");
        System.out.println();
        System.out.println(" Первое Слагаемое : " + number1);
        System.out.println(" Второе Слагаемое : " + number2);
        System.out.println(" Введите сумму :");

        int отвПольз = scanner.nextInt();
        int правельный = number1 + number2;

        while (отвПольз != правельный)  {


            System.out.println("  Ваш ответ :" + отвПольз);
            System.out.println(" Правильный ответ :" + правельный);
            System.out.println(" К сожалению Ваш ответ не верный ");
            System.out.println(" Попробуте еще раз!!! ");
            System.out.println();

            number1 = random.nextInt(10);
            number2 = random.nextInt(10);
            правельный = number1 + number2;

            System.out.println(" Первое Слагаемое : " + number1);
            System.out.println(" Второе Слагаемое : " + number2);
            System.out.println(" Введите сумму :");

            отвПольз = scanner.nextInt();

        }
        System.out.println("Поздравляю вы ответили верно!!! Опросник завершён! Ваш iQ равен 110 баллов !");
    }
}
