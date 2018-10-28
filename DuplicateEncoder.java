//import java.util.Arrays;

public class DuplicateEncoder {
    public static void main(String[]args){
        System.out.println(encode("recede"));
        System.out.println(encode("Successi"));
        System.out.println(encode("Prespecialized"));
        System.out.println(encode("(( @"));
    }
    
    
 static String encode(String word){
    char[] code = word.toCharArray();
     for(int a = 0; a <code.length; a++){
         if(Character.isLetter(code[a]) && Character.isUpperCase(code[a])){
             code[a] = Character.toLowerCase(code[a]);
         }
     }
     char[] result = new char[code.length];
     for(int i = 0; i<code.length; i++){
         for(int j = 0; j<code.length; j++){
             if (code[i] == code[j] && i != j ){
                 result[i] = ')';
             }  
         }         
     }
     for (int m=0; m<result.length; m++){
         if( result[m] != ')'){
             result[m] = '(';
         }
     }
     word = new String(result);  
     return word;
 }
}