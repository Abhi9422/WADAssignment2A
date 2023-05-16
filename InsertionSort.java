import java.util.Arrays;

class InsertionSort {
    public static void main(String[] args) {
        int a[] = {2,1,-1,4};
        Insertion(a);
        System.out.println(Arrays.toString(a));
    }
    public static void Insertion(int a[]){
      for (int i = 1; i < a.length; i++) {
        int key = a[i];
        int j = i - 1;
        
        while (j >= 0 && a[j] > key) {
            a[j + 1] = a[j];
            j = j - 1;
        }
        a[j + 1] = key;
    }

    }
   
      
        
    }
   

