import java.util.ArrayList;

public class GenericsTest {

    public static void main(String[] args) {

        //*******************************
        // Problems with the old way
        // Object o = new Object();

        // This used to be the way you would create an array list
        // ArrayList oNames = new ArrayList();
        // oNames.add("abigail");
        // oNames.add("abigail");
        // oNames.add(o);

        // this is called casting //
        // it's really expensive
        // String s = (String)oNames.get(2);
        // End the old way ************
        //*****************************

        // The new way with generics
        // ****************************

        // ArrayList<String> lstNames = new ArrayList<>();
        // lstNames.add("a");
        // lstNames.add("b");
        // generics solves two issues: gets rid of casting and turns run time errors into build time errors


        // ***********************************
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
        // ********************************************************************************

        ArrayList< Pair<String, Double> > lstStocks = new ArrayList<>();
        lstStocks.add(oStock1);
        lstStocks.add(oStock2);

        // ArrayLists use .size() not .length()
        for (int i = 0; i < lstStocks.size(); i++) {
            Pair<String, Double> stock = lstStocks.get(i);
            System.out.println("Stock details: " + stock.first + " / " + stock.second);
        }

        // ***********************************************
        // complicated example of composition of generics
        // lstAndroids > Android > StoryLines > Waypoints
        // ***********************************************


    }
}
