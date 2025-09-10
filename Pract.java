import java.util.*;
public class Pract {
    public static String mString(String str){
       StringBuilder res = new StringBuilder();
        for(int i=0; i<str.length(); i++){
           char ch = str.charAt(i);
           if(ch >='A' && ch <= 'Z'){
            ch = (char)(ch+32);

        }
        res.append(ch);
        
        }
        return res.toString();
    }
    public static boolean compare(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String manual = mString(str);
        
        String built = str.toLowerCase();
        boolean check = compare(manual,built);
        System.err.println(manual);
        System.out.println(built);
        System.err.println(check);


    }
    
}
