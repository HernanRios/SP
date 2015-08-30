import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Nico on 8/27/15.
 */
public class Main {
    public static void main (String[] args) {

        //==========variable declaration==========
        String attributeName;
        int attributeValue;
        ArrayList<Attribute> attributes = new ArrayList<Attribute>();
        Deck autos = new Deck();
        String name;
        int numAttributtes;
        ArrayList<Card> cards = new ArrayList<Card>();

        //==========add a card with attributes==========
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter card's name:");
        name = sc.nextLine();
        do {
            System.out.println("Enter the attributes' quantity:");
            numAttributtes = sc.nextInt();
        } while (numAttributtes < 4 || numAttributtes >7);
        for (int i = 0; i < numAttributtes; i++) {
            System.out.println("Enter attribute's name " + i);
            attributeName = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter attribute's value of"+ attributeName);
            attributeValue = sc.nextInt();
            Attribute newAttribute = new Attribute(attributeName, attributeValue);
            attributes.add(newAttribute);
        }
        autos.createCard(name,attributes);
    }
}
