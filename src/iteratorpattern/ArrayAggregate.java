
package iteratorpattern;

public class ArrayAggregate extends Aggregate{

    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    
    @Override
    public Iterator CreateIterator() {
        return new ConcreteIterator(this);
    }
    
    public int Count(){
        return arr.length;
    }
    
    public int getItem(int i){
        return arr[i];
    }
  
}
