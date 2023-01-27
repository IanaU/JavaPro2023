package homeWork_1;

public class MainPerson {

    public static void main(String[] args){

        Person person1 = new Person();
        Person person2 = new Person("Ivan Ivanov", 28);
        Person person3 = new Person("Petr Petrov", 25);

        System.out.println(person1);
        System.out.println("=============");
        System.out.println(person2);
        person2.talk();
        System.out.println("=============");
        System.out.println(person3);
        person3.move();
    }
}
