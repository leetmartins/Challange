public class INVOICE {
	public static void main(String[] args) {
	   
	   String state[] = {"SP","RJ","MG","ES","Others"};
	   double partial [] = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53}, total = 0;
	   
	   for(int i = 0; i < 5; i++){
	       
	       total += partial[i];
	   }
	   
	   
	   percent(state,partial,total); 
	   
	}
	
	public static void percent(String[] state, double[] partial, double total){
	    
	    for(int i = 0; i < 5; i++) {
    	   
    	    double element = (partial[i] / total) * 100;
    	    
    	    System.out.printf("State: " + state[i] + "        |   " + "Percent: " + element);
    	    System.out.println();
	    }
	    
	    
	}
}
