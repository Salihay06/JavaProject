/*
Bir LinkedList içinde eleman arayan bir Java programı yazınız.

Eleman bulunursa "Found!"

Bulunamazsa "Element is not in the list" mesajını yazdırınız.

LinkedList elemanları: "apple", "banana", "cherry", "grape"
*/

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListSearch {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("grape");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Aranacak eleman: ");
        String input = scanner.nextLine();

        if (list.contains(input)) {
            System.out.println("Found!");
        } else {
            System.out.println("Element is not in the list");
        }
    }
}
