package begginers_book.arraylists;

import java.util.ArrayList;

public class ArrayListsMethods {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("Aneta");
        obj.add("Maria");
        obj.add("Paulina");
        obj.add("Ewa");
        obj.add("Miriam");
        obj.add("Agata");

        //Displaying elements
        System.out.println("Original array:");
        for (String s : obj)
            System.out.println("Ruchałem: " + s);


        //Adding elements at given index,+
        obj.add(0, "Emilia");
        obj.add(3, "Doti");

        //Displaying elements
        System.out.println("\nArray");
        for (String s : obj)
            System.out.println("Ruchałem: " + s);

        //Removing elements by Name
        obj.remove("Emilia");
        obj.remove("Emilia");

        //Displaying elements
        System.out.println("\nArray");
        for (String s : obj)
            System.out.println("Ruchałem: " + s);


        //Removing elements by Index
        System.out.println("\nArray");
        obj.remove(1);
        obj.remove(obj.size() - 1);

        //Displaying elements
        for (String s : obj)
            System.out.println("Ruchałem: " + s);

        //Setting elements at given index
        obj.set(3, "Aga");
        obj.add(3, "Agata");
        //Displaying elements
        System.out.println("\nArray");
        for (String s : obj)
            System.out.println("Ruchałem: " + s);

        int agataPosition = obj.indexOf("Agata");
        System.out.println("Agata is on position " + agataPosition);


        System.out.println("Na pozycji 2 znajduje sie: " + obj.get(2));
        System.out.println("Liczba dziwczyn ktore ruchalem: " + obj.size());
        boolean containEmilia = obj.contains("Emilka");
        System.out.println("Czy ruchałem Emilke? " + containEmilia );

    }
}
