//  nested loop means loop inside loop

//ques 1  To print star in 5 lines
import java.util.*;
public class pattern {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         for (int line=1; line<=5; line++){    // outer loop
            for(int star=1; star<=line; star++){      // inner loop
                System.out.print("*" +" ");
            }
             System.out.println();
         }
        System.out.println("end the loop");  
    }
}



//ques 2    inverted star pattern in 5 lines
import java.util.*;
public class pattern {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         int n=5;
         for (int line=1; line<=5; line++){
            for(int star=1; star<=5-line+1; star++){
             System.out.print("*");
            }
            System.out.println();
         }
    }
}



//ques3   half pyramid pattern
import java.util.*;
public class pattern {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         for (int line=1; line<=4; line++){
            for(int num=1; num<=line; num++){
                System.out.print(num);
            }
             System.out.println();
         }
    }
}



//  ques 4     print characters pattern
import java.util.*;
public class pattern {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         char ch='A';
         for (int line=1; line<=4; line++){
            for(int chars=1; chars<=line; chars++){             
                System.out.print(ch);
                ch++;
            }
             System.out.println();
         }
    }
}




         