import java.util.ArrayList;

public class AreSame {
    public static void main (String[] args){
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11, 3};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361, 9};
        System.out.println(comp(a, b));
        
    }
    
 
 public static boolean comp(int[] a, int[] b) {
     boolean flag = false;
     
     ArrayList<Integer> ar1 = new ArrayList<Integer>();
     ArrayList<Integer> ar2 = new ArrayList<Integer>();
     
     for(int i = 0; i < a.length; i++){
         ar1.add(a[i]);
     }
     
      for(int j = 0; j < b.length; j++){
         ar2.add(b[j]);
     }
     
     if (a == null || b == null || a.length != b.length){
         return flag;
     } else{
       int index;
      
       for (int x = 0; x < ar1.size(); x++){
           if(ar2.contains(ar1.get(x)*ar1.get(x))){
           index = ar2.indexOf(ar1.get(x)*ar1.get(x));
           ar2.remove(index);
           }
           if (ar2.isEmpty()){
           flag = true;
           }
     }
     }return flag;
  }
}