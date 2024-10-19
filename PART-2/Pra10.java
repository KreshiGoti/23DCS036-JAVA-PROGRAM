import java.util.*; 
 
class Pra10 
 { 
    public static void main(String args[]) 
 { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter input for your string:"); 
        String str = sc.nextLine(); 
        String reversedStr = ""; 
 
        System.out.println("Your string is: " + str); 
        System.out.println("Your lower case string is: " + str.toLowerCase()); 
        System.out.println("Your upper case string is: " + str.toUpperCase()); 
 
        for (int i = 0; i < str.length(); i++) { 
            reversedStr = str.charAt(i) + reversedStr; 
        } 
 
        System.out.println("Your reversed string is: " + reversedStr); 
        System.out.println("23DCS036_kreshi_goti");     
         
        sc.close(); 
    } 
}
