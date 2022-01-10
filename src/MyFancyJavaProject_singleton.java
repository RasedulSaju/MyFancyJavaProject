
package MyFancyJavaProject;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.Scanner;
public class MyFancyJavaProject_singleton
{
  private static final MyFancyJavaProject_singleton obj = new MyFancyJavaProject_singleton();
  public String string;
  public int a,b;
    private int result1,result2;
  //Creating private constructor
  private MyFancyJavaProject_singleton()
  {
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
            result1=a-b;
       }
            if (a<b){
            result2=b-a;
            
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
    System.out.println("a is grater than b & their difference is: "+ text.result1);
     System.out.println("a is grater than b & their difference is: "+ text.result2);
    System.out.println("String in Upper Case:");
    text.string = (text.string).toUpperCase();
    System.out.println(text.string);
  }

   
}

