import java.util.ArrayList;

public class GenericsTest {

    public static void main(String[] args) {

        // *********************************************************************************
        // User pair class objects to store stocks.
        Pair<String, Double> oStock1 = new Pair<>("Costco", 1000.58);
        Pair<String, Double> oStock2 = new Pair<>("Oracle", 999.24);
        // double is usually a primitive but in java since we are using a
        // class with two types, there's a built-in double type that handles
        // converting the primitive to an object and vice versa

        // System.out.println("Costco value: " + oStock1.second);

        // ********************************************************************************
        // Do not use ArrayList<Pair>
        // this will make each object in the list an object type (which is not what we want)
        // If you want an Array List of Generics you have to instantiate the way it is done
        // below.
        // ********************************************************************************

        ArrayList< Pair<String, Double> > lstStocks = new ArrayList<>();
        lstStocks.add(oStock1);
        lstStocks.add(oStock2);

        // ArrayLists use .size() not .length()
//        for (int i = 0; i < lstStocks.size(); i++) {
//            Pair<String, Double> stock = lstStocks.get(i);
//            System.out.println("Stock details: " + stock.first + " / " + stock.second);
//        }

        // creating a place in memory
        Triple<String, Integer, Integer>[] aoTriple;
        Pair<String, Double>[] aoPair;
        // ********
        // VS
        // ********
        // assigning that variable in memory to the object
        aoTriple = new Triple[5];
        aoPair = new Pair[5];

        aoTriple[0] = new Triple<>("Charges", 10, 3);
        aoTriple[1] = new Triple<>("Rams", 9, 4);
        aoTriple[2] = new Triple<>("Chiefs", 8, 5);
        aoTriple[3] = new Triple<>("Ravens", 7, 6);
        aoTriple[4] = new Triple<>("Patriots", 4, 9);

        for (int i = 0; i < aoTriple.length; i++){
            double winPercentage =
            aoPair[i] = new Pair<>(aoTriple[i].teamName, )
        }

//        Pair<String, Double> oStock2 = new Pair<>("Oracle", 999.24);

    }
}
