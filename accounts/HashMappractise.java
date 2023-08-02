package tops.accounts;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashMappractise{

	public static void main(String[] args) {
		
		HashMap CapitalCities= new HashMap();
		
		CapitalCities.put(1,"India");
		CapitalCities.put(2,"enmark");
		CapitalCities.put(3,"hina");
		CapitalCities.put(4,"merica");
	    System.out.println(CapitalCities);
		
	  //   Access an Item
	    
//	     System.out.println(CapitalCities.get(2));
	    
	    // Remove an item
	    
//	     System.out.println(CapitalCities.remove(4));
	   // Size of list
//	     System.out.println(CapitalCities.size());
	    
	    //  Arraylist in hashmap
	    
        ArrayList tr=new ArrayList();
	    tr.add(2000);
	    tr.add(5000);
	    tr.add(8000);
	    System.out.println(tr);
	  
	    HashMap<Integer,ArrayList>hm=new HashMap();
	    hm.put(5,tr);
	    System.out.println(hm);
	    
	    
	}

	}
     
	
	
