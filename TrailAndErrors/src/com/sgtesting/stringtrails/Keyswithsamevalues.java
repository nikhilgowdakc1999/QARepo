package com.sgtesting.stringtrails;

import java.util.*;

public class Keyswithsamevalues {

	public static void main(String[] args) {
		Map <String,Integer> map=new HashMap<String,Integer>();
         map.put("K1",20);
         map.put("K2",10);
         map.put("K3",20);
         map.put("K4",30);
         map.put("K5",20);
         map.put("K6",30);
         for(Map.Entry<String, Integer> e:map.entrySet())
         {
        	 if(e.getValue().equals(30))
        	 {
        		 System.out.println(e.getKey());
        	 }
         }
       
	}

}

