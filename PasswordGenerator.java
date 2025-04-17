import java.util.Random;
import java.util.Scanner;
  public class PasswordGenerator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}";
        System.out.println("Enter the length of the password : ");
        int length = scanner.nextInt();
        StringBuilder password = new StringBuilder();
        for(int i=0; i<length-1; i++){
        int index = random.nextInt(characters.length());                                
        password.append(characters.charAt(index));
        }
        System.out.println(" Your generated password is: " + password.toString());

    }
  
    
  }