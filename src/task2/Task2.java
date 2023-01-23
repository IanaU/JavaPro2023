package task2;


public class Task2Computer {// начало тела класса
    String foo = // поле класса;

    int computeSumm (int[] incomeArray) { // начало тела метода computeSumm
        int result = 0;
        if (incomeArray != null) { // начало тела условного оператора
            for (int number : incomeArray) { // начало тела цикла
                result += number;
            } //конец тела цикла
        } // конец тела условного оператора
        return result;
    } // конец тела метода computeSumm

    void printFoo() { // начало тела метода printFoo
        System.out.println(foo);
    } // конец тела метода printFoo
} // конец тела класса

    // Члены класса — это основные элементы, которые может содержать в себе класс.
    // Ими являются переменные (поля) и методы.
    // экземпляр, объект, instance — это сущность созданная на основе класса.