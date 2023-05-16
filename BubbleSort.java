
import java.util.Arrays;
import java.util.Arrays;
public class BubbleSort{
    public static void main(String[] args) {
      int a[] = { -11 ,-1 ,3326,0 ,1};
        bubble(a);
      System.out.println(Arrays.toString(a));
    }
    public static void  bubble(int a[] ){
         
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length-i; j++) {
                   if (a[j-1]>a[j]) {
                    int temp = a[j-1];
                    a[j-1]= a[j];
                    a[j]= temp;
                    
                   }
              
            }
          
        }

    }
}