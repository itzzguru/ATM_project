import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int pin = 1234;
        int balance = 10000;
        int AddAmount = 0;
        int TakeAmount = 0;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin number");
        int password = sc.nextInt();
        if (password == pin) {
            System.out.println("Enter your name");
            name = sc.next();
            System.out.println("Welcome " + name);
            while (true) {
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to take amount");
                System.out.println("Press 4 to take respite");
                System.out.println("Press 5 to Exit");
                int opt = sc.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("your current balance is 123" + balance);
                        break;
                    case 2:
                        System.out.println("How much amount did you want to add to your account");
                        AddAmount = sc.nextInt();
                        System.out.println("Successfully credited");
                        balance = AddAmount + balance;
                        break;
                    case 3:
                        System.out.println("How much amount did you want to take");
                        TakeAmount = sc.nextInt();
                        if (TakeAmount > balance) {
                            System.out.println("your balance is insufficient");
                            System.out.println("try less than your available balance");
                        } else {
                            System.out.println("Successfully taken");
                            balance = balance - TakeAmount;
                        }
                        break;
                    case 4:
                        System.out.println("Welcome to All in one mini ATM");
                        System.out.println("Available balance is " + balance);
                        System.out.println("Amount deposited " + AddAmount);
                        System.out.println("Amount taken   " + TakeAmount);
                        System.out.println("Thanks for Coming");
                        break;
                    // default:
                    // System.out.println("press the number below 5");
                    // break;
                }
                if (opt == 5) {
                    System.out.println("Thankyou");
                }
            }
        } else {
            System.out.println("Wrong pin  number");
        }

    }
}
