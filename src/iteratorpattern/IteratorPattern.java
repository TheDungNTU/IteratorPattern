package iteratorpattern;

public class IteratorPattern {

    public static void main(String[] args) {
        ArrayAggregate AA = new ArrayAggregate();
        Iterator I = AA.CreateIterator();
        while(!I.isDone()){
            System.err.println(I.Next());
        }
    } 
}
