import java.util.Scanner;
class student{
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your name");
        String name=sc.nextLine();
        System.out.println("Enter your age");
        int age=sc.nextInt();
        System.out.println("Enter your percentage");
        float percentage=sc.nextFloat();
        System.out.println("yor name is:"+name);
        System.out.println("Your age:"+age);
        System.out.println("Your percentage:"+percentage);
    }
}