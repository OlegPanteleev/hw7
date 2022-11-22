package hw7;

public class MainClass {

    public static void main(String[] args) {

        Cat[] catArr = new Cat[10];
        catArr[0] = new Cat("\"Барсик\"", 50);
        catArr[1] = new Cat("\"Персик\"", 30);
        catArr[2] = new Cat("\"Мурзик\"", 35);
        catArr[3] = new Cat("\"Снежок\"", 50);
        catArr[4] = new Cat("\"Пончик\"", 80);
        catArr[5] = new Cat("\"Кекс\"", 40);
        catArr[6] = new Cat("\"Симба\"", 55);
        catArr[7] = new Cat("\"Тёма\"", 25);
        catArr[8] = new Cat("\"Саймон\"", 65);
        catArr[9] = new Cat("\"Тимофей\"", 40);

        catsInfo(catArr);
    }

    static public void catsInfo (Cat[]catsArray){
        Plate plate = new Plate(100);
        for (Cat cats : catsArray) {
            if (cats.appetite > Plate.food) {
                System.out.printf("Кот %s не может столько съесть\n", cats.name);
                System.out.printf("Котику %s не хватило еды\n", cats.name);
                System.out.println("satiety = " + (cats.satiety = false));
                plate.info();
                System.out.println();
                if (Plate.food < 50) { // решил добавлять еду только тогда, когда ее осталось меньше 50-ти
                    plate.addFood(100);
                    System.out.println("Добавление еды в тарелку...");
                    plate.info();
                    System.out.println();
                }
            }
            else if (Plate.food > 0) { // если сделать через if, тогда котик повторно попробует покушать после пополнения тарелки
                cats.eat(plate);
                System.out.printf("Котик %s поел\n", cats.name);
                System.out.println("satiety = " + (cats.satiety = true));
                plate.info();
                System.out.println();
            }
            }
        }
}
