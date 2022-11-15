import java.util.*;

public class REVERSE {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        
        System.out.print("Enter a String: ");
        String string = ent.next();
        
        reverse(string);
         
    }
    
    public static void reverse (String string) {
    String aux = "";
   
    for (int i = string.length() - 1; i >= 0; i--){
         aux += string.charAt(i);
    }
     
    System.out.println(aux);
  }
}