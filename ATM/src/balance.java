import java.util.*;
class balance{
    void balancecheck(Map<Integer,List<String>> t,int pin){
        balances(t,pin);
    }

    private void balances(Map<Integer,List<String>> t, int pin) {
        Scanner sc=new Scanner(System.in);
        if(t.containsKey(pin)){
            System.out.println("A/C:"+t.get(pin).get(0));
            System.out.println("Available Balance:RS.  "+t.get(pin).get(1)+".0000");
        }
        else{
            System.out.println("Enter the correct PIN number");
            int p=sc.nextInt();
            balances(t,p);
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