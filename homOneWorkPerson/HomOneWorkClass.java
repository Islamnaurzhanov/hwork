package homOneWorkPerson;

public class HomOneWorkClass {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person( "ialam", "Naurzhanov Islam", 36);

        person.setAge(35);
        person.setName("Bella");
        person.setFullName("Naurzhanova Bella");

        System.out.println( " Сообщаем Полные данные Person : ");
        System.out.println( " Имя : " + person.getName()  );
        System.out.println( " Полное имя: " + person.getFullName()  );
        System.out.println( " Vozrost : " + person.getAge());

        person.move();
        person.talk();

        System.out.println();

        System.out.println( " Сообщаем Полные данные Person1 : ");
        System.out.println( " Имя : " + person1.getName()  );
        System.out.println( " Полное имя: " + person1.getFullName()  );
        System.out.println( " Vozrost : " + person1.getAge());

        person1.move();
        person1.talk();

    }
}
