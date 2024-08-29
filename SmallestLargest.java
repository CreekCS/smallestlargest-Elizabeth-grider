//put your name here
public class SmallestLargest{
    public static int[] arg = new int[10];
    public static void main(String args[]){
         
        for(int i =0; i<10; i++){
            arg[i]= (int)(Math.random()*100)+1; 
        }
        
        System.out.println(smallestValue()); 
        System.out.println(largestValue()); 


    }
    public static int smallestValue(){
        int small= arg[0]; 

        for(int i =0; i<9; i++){
        if (arg[i]<small){
            small= arg[i]; 
        }
            
        
        }
        return small; 
    }
    public static int largestValue(){
        int big= arg[0]; 
        for(int i =0; i<9; i++){
        if (arg[i]>big){
            big= arg[i]; 
        }
           
        
        }
         return big; 
    }

}