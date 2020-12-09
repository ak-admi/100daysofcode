import java.util.*;

import jdk.nashorn.internal.objects.Global;

public class Array {
    static Scanner sc = new Scanner(System.in);
    public static int array[] = new int[10];
    public static int s = 0;

    public static void add() {
        if (s == 10) {
            System.out.println("Array full");

        } else {

            System.out.println("enter the element");
            array[s] = sc.nextInt();
            s++;
        }
    }

    public static void display() {
        System.out.println("Here is the array");
        for (int m = 0; m < array.length; m++) {
            System.out.println(array[m]);
        }

    }

    public static void delete() {
        System.out.println("enter the position[1-10] of the element to be deleted");
        int d = sc.nextInt();
        for (int i = d - 1; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println(
                    " Enter the Option\n1.Add element to the array\n2.Delete element from array\n3.Display array\n");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    add();

                    break;
                case 2:
                    display();
                    delete();
                    display();

                    break;
                case 3:
                    display();
                    break;
                default:
                    break;

            }

        } while (true);
    }
}
