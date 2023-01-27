package homeWork_1._phon;

public class Call {

    private String name;

    Call() {
        this.name = "Tom";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void receiveCall(){
        System.out.println("It is calling " + this.name);
    }

    public void getNumber(int number){
        System.out.println("Telephone number is " + number);
    }

    @Override
    public String toString() {
        return "Call{" +
                "name='" + name + '\'' +
                '}';
    }
}
