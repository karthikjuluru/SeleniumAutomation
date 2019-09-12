import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> states = new LinkedHashSet<String>(); //HashSet, LinkedHashSet
		
		states.add("Telangana");
		states.add("Karnataka");
		states.add("Maharastra");
		
		System.out.println(states);
		
		Set<String> capitals = new TreeSet<String>();
		capitals.add("Hyderabad");
		capitals.add("Bangalore");
		capitals.add("Mumbai");
		
		Iterator i = states.iterator();
		Iterator i1 = capitals.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next()+"----"+i1.next());
		}
		
	}

}
