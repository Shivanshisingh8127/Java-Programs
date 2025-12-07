/*     WHILE loop    it executes itself until it gets false condition according to the given condition
 while systax=       while(condition){
                      do something

                    }
                    
*/

//    program to sum first n natural numbers
import java.util.*;
public class loop {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);    
         int n=sc.nextInt();          
         int sum=0;
         int i=0;    //initialization means loop start from here           
         System.out.print("sum of first n natural no=");
         while(i<=n){    
         sum+=i;                      
           i++;  //update
         }
        System.out.print(sum);
    }
}

//   DO WHILE LOOP       
import java.util.*;
public class loop {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
        int i=1;
        do {
        System.out.println("hhgjj");
         i++;
        } while(i<6);
    }
}

/* for loop syntax =for(initialisation;condition;update){
do something
}
*/
                         
import java.util.*;
public class loop {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         
         //ques 1    program to table of 2
         for(int i=1; i<=10;i++){
            System.out.print("  " +2*i);
         }
         


        // program to print  square pattern
        for(int i=0; i<=4; i++){
            System.out.println("* * * *");
        }       
    }
}

//      decrementing for loop
import java.util.*;
public class loop {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         for(int i=10; i>0; i--){
         System.out.println(3*i);
         }
    }
}



//   break statement== to exit the loop
import java.util.*;
public class loop {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         int i = sc.nextInt();
         while(i<=20){
           
            if (i%10==0){
                break;       
            }
            i++;
            System.out.print(" "+i);
         }
    }
}

// conitue statement==== to skip any iteration
import java.util.*;
public class loop {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
         int i=1;
         while(i<=20){
           
            if (i==4){
                continue; // it means if value of i=4 then it will skip value 4 and move on to next no      
            }
            i++;
            System.out.println(i);
         }
        
    }
}

















