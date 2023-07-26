import java.util.*;
public class ATM {
    String username;
    String password;
    String name;
    String accNo;
    public void createAccount(){
        Scanner in = new Scanner(System.in);
    System.out.println("**************");
        System.out.println("Enter Your Name: ");
        this.name = in.nextLine();
        System.out.println("Enter Account Number: ");
		this.accNo=in.nextLine();
		System.out.println("Enter your username");
		this.username=in.nextLine();
		System.out.println("Enter password");
		this.password=in.nextLine();
		System.out.println();
		System.out.println("Your registration is successfully completed\n");


    }
    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.createAccount();
        System.out.println(atm.name);
        System.out.println(atm.accNo);
        System.out.println(atm.username);
        System.out.println(atm.password);



        
    }
    
}
