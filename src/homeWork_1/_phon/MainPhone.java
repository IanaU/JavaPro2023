package homeWork_1._phon;

public class MainPhone {

    public static void main(String[] args){

        Phone iphone = new Phone("iphone 12", "180 gr.", 1234567);
        Phone samsung = new Phone("galaxy A52", "189 gr.", 3456789);
        Phone huawei = new Phone("huawei P30", "165 gr.", 9874563);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(huawei);
        System.out.println("=============");
        Call tom = new Call();
        tom.receiveCall();
        System.out.println("=============");
        tom.getNumber(1236549);
    }
}
