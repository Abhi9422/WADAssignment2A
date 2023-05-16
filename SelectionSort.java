

import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args) {
        int a[] = { 1, 0 ,- 4, 6, 4, 0, -11 };
        Selection(a);
        System.out.println(Arrays.toString(a));
    }
    public static void Selection(int a []){
        for (int i = 0; i < a.length; i++) {
            int  last = a.length-1-i;
             int maxIndex = getMaxIndex(a,0,last); 
             
                int temp = a[maxIndex];
                a[maxIndex]=a[last];
                a[last]=temp;
                
             
            
        }
    }

    public static int getMaxIndex(int a[],int start,int end) {
        int max= start;
        for (int i = start; i <=end; i++) {
            if (a[i]>a[max]) {
                max = i;
                
            }
            
        }


        return max;

        
    }

    
}
