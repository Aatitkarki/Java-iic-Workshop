import java.util.Scanner;

public class ArrayCalculator
{ 
    static Scanner sc = new Scanner(System.in); 
   public void even(int arrayLength){
       
       int array[] = new int[arrayLength];
       
       System.out.println("Enter the value for array: ");
       
       for(int i=0; i< arrayLength; i++){
        
           array[i] = sc.nextInt();
           
       }
       
       System.out.println("The even numbers are");
       
       for(int i=0; i< arrayLength; i++){
           
           if(array[i]%2==0){
               
               System.out.println(array[i]+"");
            }
        }
    }
          
    public static void main(String[] args){
        
        System.out.println("Enter the size of an array: ");
        try {
            int arrayLength = sc.nextInt();
        }
        catch(NumberFormatException nfe) {
            System.out.println("Input Error");
        }        
        ArrayCalculator calculateEven = new ArrayCalculator();
        
        calculateEven.even(arrayLength);
        
    
    }
    
    
}
