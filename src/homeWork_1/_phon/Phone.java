package homeWork_1._phon;

public class Phone {

    private String model;
    private String weight;
    private int number;

    public Phone(String model, String weight, int number) {
        this.model = model;
        this.weight = weight;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", weight='" + weight + '\'' +
                ", number=" + number +
                '}';
    }
}
