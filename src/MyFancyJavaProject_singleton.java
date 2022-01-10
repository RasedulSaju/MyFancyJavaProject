
package MyFancyJavaProject;
import java.util.Scanner;
public class MyFancyJavaProject_singleton
{
  private static final MyFancyJavaProject_singleton obj = new MyFancyJavaProject_singleton();
  public String string;
  public int x, y;
    private int result1,result2;
  //Creating private constructor
  private MyFancyJavaProject_singleton()
  {
         // Input x
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter first number");
        x=input1.nextInt();
        //. Input x
        
        // Input y
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter second number");
        y=input2.nextInt();
        //. Input y
        
       if (y<x){
            result1=x-y;
       }
            if (x<y){
            result2=y-x;
            
    string = "Assignment done";
  }
  }
    public static MyFancyJavaProject_singleton getInstance()
  {
    return obj;
  }
  public static void main(String args[])
  {
    MyFancyJavaProject_singleton text = MyFancyJavaProject_singleton.getInstance();
    //original string
    System.out.println("Assignment Ans:");
    System.out.println("x is grater than y & their difference is: "+ text.result1);
     System.out.println("x is less than y & their difference is: "+ text.result2);
    System.out.println("String in Upper Case:");
    text.string = (text.string).toUpperCase();
    System.out.println(text.string);
  }

   
}

