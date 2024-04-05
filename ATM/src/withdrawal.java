import java.util.*;
public class withdrawal {
    Scanner sc=new Scanner(System.in);
   void withdrawalcheck(Map<Integer,List<String>> t,int pin) {
       withdrawals(t,pin);
   }

    private void withdrawals(Map<Integer, List<String>> t, int pin) {
       Scanner sc=new Scanner(System.in);
        if (t.containsKey(pin)) {
            System.out.println("Enter the amount:");
            int amt = sc.nextInt();
            sc.nextLine();
            int avl=Integer.parseInt(t.get(pin).get(1));
            if (amt > avl) {
                System.out.println("Insufficient balance");
            } else {
                System.out.println("A/C:" + t.get(pin).get(0));
                System.out.println("CASH WITHDRAWAL IS SUCCESSFULL");
                System.out.println("Available balance:RS.  "+(avl-amt)+".0000");
                t.put(pin,t.getOrDefault(pin, Collections.singletonList(Integer.toString(avl - amt))));
            }
        }
        else{
            System.out.println("Enter the correct PIN number:");
            int p=sc.nextInt();
            withdrawals(t,p);
        }
        System.out.println("Do you want to continue:");
        String dec=sc.nextLine();
        if(dec.equals("YES")){
            System.out.println("Enter your choice:");
            int c=sc.nextInt();
            Main.choices(c,t);
        }
        else{

        }
    }
}
