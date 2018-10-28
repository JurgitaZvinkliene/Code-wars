import java.util.List;
import java.util.ArrayList;

public class RemovedNumbers {
    public static void main(String[] args){
        long input = 50;
        removNb(input);
        System.out.println("The End");
    }
 
    public static List<long[]> removNb(long n) {
        if (n <=0) return null;
        else {
            List<long[]> res = new ArrayList<long[]>();
            List<Long>result = new ArrayList<Long>();
            long sum = 0;
            for (long i = 1; i <=n; i++){
                result.add(i);
                sum = sum+i;
            }
            int i = 0;
            int j = 0;
            while(i< result.size()){
                while (j< result.size()) {
                    if (result.get(i) * result.get(j) > sum){
                        break;
                    }
                    if (i ==j){
                    j++;
                    }
                    if(result.get(i) * result.get(j) == (sum -(result.get(i) + result.get(j)))){
                        res.add(new long[] {result.get(i), result.get(j)});
                        res.add(new long[] {result.get(j), result.get(i)});
                        j++;
                    } else {
                        j++;
                    }
                } 
                i ++;
                j = i+1;
            }
           
            toPrint(res);
            return res;
        } 
    }
    
    public static void toPrint(List<long[]> a){
        for ( int j=0; j<a.size(); j++ ){
            for(long m : a.get(j)){
            System.out.print(m+ " ");
        }
            System.out.println();
        }
    }
}