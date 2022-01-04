import java.util.Scanner;

public class MyFancyJavaProject {
    public static void main(String[] args) {
        int a;
        int b;
        int result;

        // Input a
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter first number");
        a=input1.nextInt();
        //. Input a

        // Input b
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter second number");
        b=input2.nextInt();
        //. Input b

        if (b<a){
            result=a-b;
            System.out.println("a is grater than b & their difference is: "+result);
        }

        if (a<b){
            result=b-a;
            System.out.println("b is grater than a & their difference is: "+result);
        }
    }
}
