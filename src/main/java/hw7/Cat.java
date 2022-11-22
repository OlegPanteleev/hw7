package hw7;

class Cat { // класс Cat

    protected String name; // защищенное поле name
    protected int appetite; // защищенное поле appetite
    protected boolean satiety; // защищенное поле satiety

    public Cat(String name, int appetite) { // конструктор класса Cat
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p){ // метод eat, ему передается параметр класса Plate
        p.decreaseFood(appetite); // этому параметку передается значение поля appetite через метод decreaseFood
        // который унаследован из класса Plate
    }

}

