import java.util.*;
// Question 1
// public class Level1_SP {
//     public static boolean compareString(String str1, String str2){
//         if(str1.length()!=str2.length()){
//             return false;
//         }
//         for(int i=0; i<str1.length(); i++){
//             if(str1.charAt(i)!=str2.charAt(i)){
//                 return false;


//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str1 = sc.nextLine();
//         String str2 = sc.nextLine();
//         boolean resultCharAt = compareString(str1, str2);
//         boolean resultEquals = str1.equals(str2);
//         if(resultEquals == resultCharAt){
//             System.out.println(" Both methods give the SAME result");
//         }
//         else{
//             System.out.println("Result are diffrent");
//         }
//     }
// }
    


// Question 2
// public class Level1_SP {
//     public static String createSubstring(String str1, int st, int end){
//         String result = "";
//         for(int i=st; i<end; i++){
//             result+=str1.charAt(i);
//         }
//         return result;
//     }
//     public static boolean compareString(String str1, String str2){
//         if(str1.length()!=str2.length()){
//             return false;
//         }
//         for(int i=0; i<str1.length(); i++){
//             if(str1.charAt(i)!=str2.charAt(i)){
//                 return false;


//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str1 = sc.nextLine();
//         int st = sc.nextInt();
//         int end = sc.nextInt();
//         String manualSub = createSubstring(str1, st, end);
//         String builtSub = str1.substring(st,end);
//         boolean compare = compareString(manualSub, builtSub);
//         System.out.println(manualSub);
//         System.out.println(builtSub);
//         System.err.println(compare);
//         }
// }

// Question 3
public class Level1_SP {
    public static char[] manualToCharArray(String str1){
        char[] result = new char[str1.length()];
        for(int i=0; i<str1.length(); i++){
           result[i]=str1.charAt(i);
        }
        return result;
    }
    public static boolean compareArray(char[] arr1, char[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]!=arr2[i]){
                return false;


            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        
        char[]  manualArray = manualToCharArray(str1);
        char[] builtArray = str1.toCharArray();
        boolean compare = compareArray(manualArray, builtArray);
        for (char c : manualArray) {
            System.out.print(c + " ");
        }

        
        for (char c : builtArray) {
            System.out.print(c + " ");
        }
        System.err.println(compare);
        }
}