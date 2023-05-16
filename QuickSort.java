import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
           int a[]= {1,-1,6,4,0,3,10,11};
           quick(a,0,a.length-1);
           System.out.println(Arrays.toString(a));
           
    }
    public static void quick(int a[],int low ,int high) {

        if(low<high){
            int partitionIndex = partition(a, low, high);
            quick(a, low, partitionIndex-1);
            quick(a, partitionIndex+1, high);
        }
        
    }
    public static int partition(int a[],int low ,int high) {
        int pivot = a[high];
        int partitionIndex = low-1;
        for (int i = low; i < high; i++) {
            if (a[i]<=pivot) {
                partitionIndex++;
                int temp  = a[partitionIndex];
                a[partitionIndex] = a[i];
                a[i] = temp;
                
                
            }
           

            

            
        }
        int temp =a[partitionIndex+1 ];
        a[partitionIndex +1]=pivot;
         a[high]= temp;
        return partitionIndex+1 ;
        
        
    }

    
}
