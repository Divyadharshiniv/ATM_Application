import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<Integer,List<String>> t=new HashMap<>();
        t.put(1000,Arrays.asList("XXXXXXXXX6991","10000"));
        t.put(5678,Arrays.asList("XXXXXXXXX7301","30000"));
        t.put(6107,Arrays.asList("XXXXXXXXX7420","25000"));
        t.put(2556,Arrays.asList("XXXXXXXXX5492","15000"));
        t.put(5392,Arrays.asList("XXXXXXXXX5429","5000"));
        System.out.println("SBI BANK");
        System.out.println("WELCOME");
        System.out.println("Please enter the card");
        System.out.println("Enter your choice:");
        System.out.println("1.Balance Inquiry");
        System.out.println("2.Cash Withdrawal");
        System.out.println("3.Cash Deposit");
        System.out.println("4.Pin Change");
        System.out.println("5.Exit");
        int choice=sc.nextInt();
        choices(choice,t);

    }

    static void choices(int choice, Map<Integer, List<String>> t) {
        Scanner sc=new Scanner(System.in);
        if (choice == 1) {
            System.out.println("Enter your 4 digit PIN number:");
            int pin = sc.nextInt();
            balance obj1 = new balance();
            obj1.balancecheck(t, pin);
        } else if (choice == 2) {
            System.out.println("Enter your 4 digit PIN number:");
            int pin = sc.nextInt();
            withdrawal obj2 = new withdrawal();
            obj2.withdrawalcheck(t, pin);
        } else if (choice == 3) {
            System.out.println("Enter your 4 digit PIN number:");
            int pin = sc.nextInt();
            deposit obj3 = new deposit();
            obj3.cashdeposit(t, pin);
        } else if (choice == 4) {
            System.out.println("Enter your 4 digit PIN number:");
            int pin = sc.nextInt();
            pin obj4 = new pin();
            obj4.pinchange(t, pin);
        } else if (choice == 5) {

        } else {
            System.out.println("Enter the correct choice:");
            int c=sc.nextInt();
            choices(c,t);

        }
    }
}