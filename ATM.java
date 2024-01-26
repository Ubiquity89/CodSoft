import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        ATM_machine obj= new ATM_machine();
        obj.checkPin();
    }
}

class ATM_machine{

    float Balance=9000;

    int PIN=8967;

    Scanner sc= new Scanner(System.in); //declaring a global variable
    
    ATM_machine() //created a constructor
    {
        System.out.println("Welcome to our ATM");
    }

    public void checkPin() {
        System.out.println("Enter your pin");
        int enterPin= sc.nextInt();

        if(enterPin== PIN) {
            menu();
        }
        else {
            System.out.println("Enter a valid pin");
        }
    }
   
    public void menu() {
        
        System.out.println("Please enter valid number");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");

        int x= sc.nextInt();

        if(x==1) {
            check_balance();
            menu();
        }
        else if(x== 2) {
            deposit_balance();
            menu();
        }
        else if(x==3) {
            withdraw_money();
            menu();
        }
        else if(x==4) {
            System.out.println("Thank you");
            menu();
        }
        else{
            System.out.println("Please enter a valid number");
            menu();
        }
    }
    public void check_balance() {
        System.out.println("Your balance is "+Balance);
    }

    public void deposit_balance() {
        System.out.println("Enter the amount: ");
        float amt= sc.nextFloat();
        Balance+= amt;
        System.out.println("Amount deposited successfully"+"Your new balance "+Balance);
    }

    public void withdraw_money() {
        System.out.println("Enter amount you want to withdraw");
        float amt1= sc.nextFloat();
        Balance -=amt1;
        System.out.println("Amount withdrawn successfully. "+"Your new balance "+Balance);

    }
}

