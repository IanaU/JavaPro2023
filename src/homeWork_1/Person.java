package homeWork_1;

public class Person {

    String fullName;
    int age;

    Person(){
        this("undefined", 22);
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void move () {

        System.out.println(this.fullName + " is going to the party");
    }

    public void talk (){
        System.out.println(this.fullName + " is talking 'Hello!'");
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
