public class Pair<A,B> {
    // variables for the types
    // we are allowing the user to use two different types (A and B)

    A first;
    B second;

    // Constructor to force caller to fill in data at instantiation time.
    public Pair(A a, B b){
        first = a;
        second = b;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
}
