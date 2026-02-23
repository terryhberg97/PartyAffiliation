//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String D;
        String R;
        String I;
        String pAffiliation;
        String Trash = "";

        System.out.println("Enter your party affiliation (D for Democrat, R for Republican, or I for Independent): ");
        pAffiliation = in.next();

        if (pAffiliation.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey");
        } else if (pAffiliation.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant");
        } else if (pAffiliation.equalsIgnoreCase("I")) {
            System.out.println("You get Person");
        } else {
            System.out.println("You get Other");
        }
        in.close();
        
    }
}