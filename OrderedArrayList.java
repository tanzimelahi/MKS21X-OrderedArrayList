
import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

	
	public OrderedArrayList() {
		super();
	}
	public OrderedArrayList(int startingCapacity) {
		super(startingCapacity);
	}
	public boolean add(T element) {
		
	    int index=0;
	    
	    for(int i=0;i<this.size();i++) {
	    	if(element.compareTo(this.get(i))>0) {
	    		index++;
	    	}
	    } super.add(index,element);
	    return true;
   }
	public void add(int index,T element) {
		this.add(element);
	}
	public T set(int index,T element) {
		T result=this.get(index);
		this.remove(index);
		this.add(element);
		return result;
	}
}


