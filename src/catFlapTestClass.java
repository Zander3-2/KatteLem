import java.util.ArrayList;

public class catFlapTestClass {

    public static void main(String[] args) {

        ArrayList<Cat> allCats = new ArrayList<>();

        Cat c1 = new Cat("kat1", false);
        Cat c2 = new Cat("kat2", false);
        Cat c3 = new Cat("kat3", false);
        Cat c4 = new Cat("kat4", false);
        Cat c5 = new Cat("kat5", false);
        Cat c6 = new Cat("kat6", false);
        Cat c7 = new Cat("kat7", false);
        Cat c8 = new Cat("kat8", false);

        allCats.add(c1);
        allCats.add(c2);
        allCats.add(c3);
        allCats.add(c4);
        allCats.add(c5);
        allCats.add(c6);
        allCats.add(c7);
        allCats.add(c8);

        printAllCats(allCats);



    }


    public static void printAllCats(ArrayList<Cat> allCats) {
        System.out.println("All cats:");
        for (Cat cat : allCats) {
            System.out.println(cat);
        }
    }


}