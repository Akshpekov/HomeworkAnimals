import java.util.Scanner;

/**
 *
 * 14.09.2016.
 *
 * Домашнее задание Основной класс
 */
public class PrimalClass {
    public static void main(String[] args) {

        System.out.println("Добро пожаловать!");

        System.out.println("Введите имя собаки:");
        Scanner nameDog = new Scanner(System.in);
        String Dogname = nameDog.nextLine();

        System.out.println("Какой звук издает собака?:");
        Scanner SayDog = new Scanner(System.in);
        String DogSay = SayDog.nextLine();

        System.out.println("Введите имя кошки:");
        Scanner nameCat = new Scanner(System.in);
        String Catname = nameCat.nextLine();

        System.out.println("Какой звук издает кошка?:");
        Scanner SayCat = new Scanner(System.in);
        String CatSay = SayCat.nextLine();

        Animal dog = new Animal();
        Animal cat = new Animal();

        dog.name = Dogname;
        dog.say = DogSay;

        cat.name = Catname;
        cat.say = CatSay;

        dog.AnimalSay();
        cat.AnimalSay();

    }
}
