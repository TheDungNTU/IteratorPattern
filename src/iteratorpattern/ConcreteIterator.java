
package iteratorpattern;

public class ConcreteIterator extends Iterator{
    
    ArrayAggregate AA;
    int i = 0;
    
    public ConcreteIterator(ArrayAggregate AA) {
       this.AA = AA;
    }

    @Override
    public int First() {
        int i = 0;
        return AA.getItem(i);
    }

    @Override
    public int Next() {
        int a = AA.getItem(i);
        i+=1;
        return a;
    }

    @Override
    public boolean isDone() {
        if(i == AA.Count()){
            return true;
        }
        return false;
    }

    @Override
    public int CurrentItem() {
        return AA.getItem(i);
    }
}
