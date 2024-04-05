import java.util.*;
public class pin {
    Scanner sc = new Scanner(System.in);
    void pinchange(Map<Integer, List<String>> t, int pin) {
        pins(t,pin);
    }

    private void pins(Map<Integer, List<String>> t, int pin) {
        if (t.containsKey(pin)) {
            System.out.println("Enter new PIN:");
            int p1 = sc.nextInt();
            System.out.println("ReEnter PIN:");
            int p2 = sc.nextInt();
            sc.nextLine();
            if (p1 == p2) {
                System.out.println("A/C:" + t.get(pin).get(0));
                System.out.println("YOUR NEW PIN SET IS SUCCESSFULL");
            } else {
                System.out.println("Enter the correct PIN number");
            }

        } else {
            System.out.println("Enter the correct PIN number:");
            int p=sc.nextInt();
            pins(t,p);
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
