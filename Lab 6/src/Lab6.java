import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;

public class Lab6 {

    public static void main(String[] args) {
        
       int[] NewArray = new int[10];
       double[] NewArray2 = new double[10];
        double  Max = 100;
       double Min = 1;
       double range = Max - Min;

       for (int x=0; x<NewArray.length ; x++){
            NewArray2[x]= Math.random()*range + Min;
            NewArray[x]= (int)(Math.random()*range+ Min);

       }
       System.out.println(Arrays.toString(NewArray));
       System.out.println(Arrays.toString(NewArray2));
       
       System.out.println("The maxmimun number is "+ FindMax.array_max(NewArray, NewArray.length) );
       System.out.println("The maxmimun number is "+ FindMax.array_max(NewArray2, NewArray2.length));

    }

    class FindMax {
    public static int array_max(int data[], int n) {
        Arrays.sort(data);
        return data[n-1];
    }

    public static double array_max(double data[], int n) {
        Arrays.sort(data);
        return data[n-1];
    }
}

}

    