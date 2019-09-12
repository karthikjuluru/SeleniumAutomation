import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> m = new TreeMap<String,String>();
		m.put("Telangana", "Hyderabad");
		m.put("Telangana1", "Hyderabad");
		m.put("Karnataka", "Bangalore");
		m.put("Maharastra", "Mumbai");
		
		System.out.println(m);
		
		System.out.println(m.get("Telangana"));
		System.out.println(m.keySet());
		Set<Entry<String,String>> es = m.entrySet();
		for(Entry<String,String> e :es){
			System.out.println(e.getKey()+"==="+e.getValue());
		}
		
		
		
	}

}
