//      input using operators sum substraction 
import java.util.*;
public class input {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
//   ques 1 program to find area of circle
        float pi= sc.nextFloat();
        int rad= sc.nextInt();
        float area= pi*rad*rad;
        System.out.print(area);

//   ques 2 program to find area of square 
       float a=sc.nextFloat();
       double area =a*a;
       System.out.println(" the area of squeare is=" +area);
    }
}