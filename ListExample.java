import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<Integer>(); //runtime polymorphism
		list.add(10);
		list.add(20);
		
		List<Integer> list1 = new LinkedList<Integer>(); //runtime polymorphism
		list1.add(101);
		list1.add(202);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		list.add(30);
		list.add(0,89);
		System.out.println(list);
		
		Iterator i = list.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		for(Integer s : list){
			System.out.println(s);
		}
		
		System.out.println(list.remove(new Integer(20)));
		System.out.println(list);
		
		System.out.println(list.contains(new Integer(20)));
		list.addAll(list1);
		System.out.println(list);
		
		//list.retainAll(list1);
		//System.out.println(list);
		list.add(null);
		list.add(10);
		System.out.println(list);
		
	}
	

}
