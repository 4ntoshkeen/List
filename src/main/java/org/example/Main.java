package org.example;
import needs.MyList;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        MyList<Integer> myList1 = new MyList<>();
        MyList<Integer> myList2;
        MyList<String> strings = new MyList<>();

        myList1.add(0, 1);
        myList1.add(1, 2);
        myList1.add(2, 3);
        myList1.add(3, 4);
        myList1.remove(0);
        myList1.set(0, 1);


        myList1.printElements();

        myList2 = (MyList<Integer>) myList1.subList(1,3);

        System.out.println("--- SUBLIST ---");
        myList2.remove(0);
        myList2.printElements();
        System.out.println("SIZE IS: " + myList2.size());
        System.out.println("IS EMPTY?: " + myList2.isEmpty());
        System.out.println("CONTAINS?: " + myList2.contains(4));
        System.out.println("GET BY INDEX?: " + myList2.get(0));
        System.out.println("AUTHOR: " + myList2.getAuthor());

        strings.add(0, "S");
        strings.add(1, "V");
        strings.add(2, "SV");
        strings.add(3, "VS");
        strings.remove(0);
        strings.set(0, "HELLO");


        strings.printElements();

        myList2 = (MyList<Integer>) myList1.subList(1,3);

        System.out.println("--- SUBLIST ---");
        strings.remove(0);
        strings.printElements();
        System.out.println("SIZE IS: " + strings.size());
        System.out.println("IS EMPTY?: " + strings.isEmpty());
        System.out.println("CONTAINS?: " + strings.contains("SV"));
        System.out.println("GET BY INDEX?: " + strings.get(0));
        System.out.println("AUTHOR: " + strings.getAuthor());
    }
}





