package hw7;

public class Plate { // класс Plate

    protected static int food; // защищенное поле food

    public Plate(int food) { // конструктор поля Plate
        this.food = food;
    }

    public void decreaseFood(int n){ // метод decreaseFood, в качестве параметра ему передается целое число
        food -= n; // food = food - n (переданное целое число)
    }

    public void info(){ // метод info для отображения текущего состояния поля food
        System.out.println("Тарелка: " + food);
    }
    public void addFood(int x){ // метод addFood для добавления еды в тарелку, в качестве параметра передается целое число
        food += x; // food = food + x (переданное целое число)
    }
}
