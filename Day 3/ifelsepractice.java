// ques1    program to find a student pass or fail  if total 40% and each sub has 33% marks then pass
import java.util.*;
public class ifelsepractice {
    public static void main(String args[]) {
         Scanner scan=new Scanner(System.in);
         System.out.println("enter your physcics marks");
         int sub1= scan.nextInt();
         System.out.println("enter your chemistry marks");
         int sub2= scan.nextInt();
         System.out.println("enter your maths marks");
         int sub3= scan.nextInt();
         int add=(sub1+sub2+sub3);
         System.out.println(add);

         double percentage= ((add)*100)/500.00;
         System.out.println(percentage);
         if (percentage>=40 && sub1>33 && sub2>33 && sub3>33){
            System.out.println("pass with distinction A");

         }
         
         else{
            System.out.println("you are fail");
         }
    }
}   


// ques2  program to find out dayname      1 for monday..... so on 
import java.util.*;
public class ifelsepractice {
    public static void main(String args[]) {
         Scanner scan=new Scanner(System.in);
         System.out.println("enter your value");
         int  day=scan.nextInt();
         if (day==1){
            System.out.println("monday");
         }
        else if (day==2){
            System.out.println("tuesday");
         }
         else if (day==3){
            System.out.println("wednesday");
         }
         else if (day==4){
            System.out.println("thursday");
         }
         else if (day==5){
            System.out.println("friday");
         }
         else if (day==6){
            System.out.println("saturday");
         }
         else if (day==7){
            System.out.println("sunday");
         }
         else{
            System.out.println("incorrect value");

         }
    }
}


// ques3   find whether entered year is leap year or not
import java.util.*;
public class ifelsepractice {
    public static void main(String args[]) {
         Scanner scan=new Scanner(System.in);
         System.out.println("enter your year");
         int  year=scan.nextInt();
         if (year%4==0){
            System.out.println("this is a leap year");
         }
         else{
             System.out.println("this is  not a leap year");
         }
    }
}



// ques4   program to find out type of website .com=commercial, .org=organization, .in= indian website
import java.util.*;
public class ifelsepractice {
    public static void main(String args[]) {
         Scanner scan=new Scanner(System.in);
         System.out.println("enter your website url");
         String website=scan.next();
         if(website.endsWith(".com")){
             System.out.println("commercial website");
         }
         else if (website.endsWith(".org")){
            System.out.println(" organization website");
         }
         else if (website.endsWith(".in")){
            System.out.println(" indian website");
         }
         else{
             System.out.println(" wrong information");

         }
    }
}


// ques 5  program to convert distance from km to mtr
import java.util.*;
public class ifelsepractice {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
          //km to mtr change
         System.out.println("the value in km");
         int km=sc.nextInt();
         km*=1000;
         System.out.println("converted from km to mtr =" +km);
    }
}
         

// ques6  program to  find no is even or odd
import java.util.*;
public class ifelsepractice {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
        System.out.println("the value");
         int a=sc.nextInt();
         if(a%2==0){
             System.out.println("the value is even");
         }
         else{
             System.out.println("the value is odd");
         }
    }
}

         

// ques7  program to find the greatest value
import java.util.*;
public class ifelsepractice {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
        System.out.println("the value a=");
        int a=sc.nextInt();
        System.out.println("the value b=");
        int b=sc.nextInt();
        int c=sc.nextInt();


        if (a>b && a>c){
             System.out.println("the value a is greater");
        }
        else if(b>a && b>c){
             System.out.println("the value is b is greater");
        }
        else {
            
            System.out.println("the greatest value is c among them");
        }
    }
}



// ques8 increment decrement
import java.util.*;
public class ifelsepractice {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=++a;
        
        
        System.out.println("pre increment of a=" +a,+b);
        int c=a++;
        System.out.println("post increment of a="+a,+c );
    }
}



  




