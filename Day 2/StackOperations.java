import java.util.*;

public class StackOperations {
    public static Scanner sc = new Scanner(System.in);
    public static int top = -1;
    public static int size;
    public static int A[];

    public static void push() {
        top++;
        if (top == size) {
            System.out.println("Stack is full");

        } else {

            System.out.print("Enter the elemrnt");
            A[top] = sc.nextInt();

        }

    }

    public static void pop() {

        if (top == -1) {
            System.out.println("stack is empty");
        } else {
            int v = A[top];
            top--;
            System.out.println("Deleted elemnt is " + v);

        }

    }

    public static void display() {
        System.out.println("Elemt in Stack are");
        for (int i = 0; i <= top; i++) {
            System.out.print(A[i]);
        }

    }

    public static void main(String[] args) {
        int choice;
        System.out.println("enter the sizeof the stack");
        size = sc.nextInt();
        A = new int[size];
        while (true) {
            System.out.println("Stack operations \n1.Push 2.pop 3.Display");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                default:
                    break;
            }

        }

    }
}
