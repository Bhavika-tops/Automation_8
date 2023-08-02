package tops.accounts;
 
import java.util.ArrayList;
import java.util.HashMap;

public class HashmapDemo {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(101,"jimmy");
		map.put(390,"ronak");
		map.put(890,"Bhavika");
		map.put(690,"jigar");
		map.put(450,"sahil");
		
		System.out.println(map);
		map.put(390,"karan");
		System.out.println(map);
		
		ArrayList tr =new ArrayList();
		tr.add(50000);
		tr.add(10000);
		tr.add(9000);
		
		HashMap<Integer,ArrayList> hm=new HashMap();
		hm.put(501, tr);
		System.out.println(hm);
		
		
	}

	
}

