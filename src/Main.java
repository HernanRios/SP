import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
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
        String path = "/Users/Nico/Documents/SP/cards.txt";
        String[] lineArray = new String[0];


        //==========read from file==========
        String line;
        FileReader fr = null;
        try {
            fr = new FileReader(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);
        try {
            while ((line = br.readLine())!=null) {
                lineArray = line.split(",");
                for (int i = 1; i < lineArray.length; i = i +3) {
                    Attribute newAttribute = new Attribute(lineArray[i], Integer.parseInt(lineArray[i+1]), Integer.parseInt(lineArray[i+2]));
                    attributes.add(newAttribute);
                }
                autos.createCard(lineArray[0], attributes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //==========add a card with attributes==========
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter card's name:");
        //name = sc.nextLine();
        //do {
        //    System.out.println("Enter the attributes' quantity:");
        //    numAttributtes = sc.nextInt();
        //} while (numAttributtes < 4 || numAttributtes >7);

        Game game = new Game(autos,2);
        //System.out.println(autos.getQuantityCards());
    }
}
