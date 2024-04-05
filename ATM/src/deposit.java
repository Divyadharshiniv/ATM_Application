import java.util.*;
public class deposit {
    Scanner sc=new Scanner(System.in);
    void cashdeposit(Map<Integer,List<String>> t,int pin){
        deposits(t,pin);
    }

    private void deposits(Map<Integer, List<String>> t, int pin) {
        if(t.containsKey(pin)){
            System.out.println("Enter the amount:");
            int amt=sc.nextInt();
            sc.nextLine();
            int avl=Integer.parseInt(t.get(pin).get(1));
            System.out.println("A/C:"+t.get(pin).get(0));
            System.out.println("CASH DEPOSIT IS SUCCESSFULL");
            System.out.println("Available balance:RS  "+(avl+amt)+".0000");
        }
        else{
            System.out.println("Enter the correct PIN number:");
            int p=sc.nextInt();
            deposits(t,p);
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
