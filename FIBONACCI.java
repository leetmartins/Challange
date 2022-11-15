import java.util.*;

public class FIBONACCI {
  public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int number = ent.nextInt();
      
      
    Fibonacci(number);
    
  }
    public static void Fibonacci(int number){
        int first = 0, second = 1, next, flag = 0;
        
        for(int i=0; i < number; i++){
            System.out.print(first + ", " );
            
            next = first + second;
            first = second;
            second = next;
            
            if(number == first){
                flag = 1;
            }
            
            
        }
        
        System.out.println();
        
        if(flag == 1) {
            System.out.println("The number belongs to Fibonacci Sequence.");
        }else{
            System.out.println("The number does not belong to Fibonacci Sequence.");
        }
    }
  
}


