import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String correctUsername = "igaurifartale";
        String correctPassword = "fartale123";
        
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        
                if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Access Granted! Welcome " + username);
        } 
        else {
            System.out.println("Access Denied! Invalid username or password");
        }
    
    }
}