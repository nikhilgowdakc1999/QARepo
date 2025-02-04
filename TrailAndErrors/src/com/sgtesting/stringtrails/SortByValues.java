package com.sgtesting.stringtrails;

import java.util.*;
import java.util.Map.Entry;

public class SortByValues {

	public static void main(String[] args) {
		SortValues1();
	
	}
	private static void SortValues1()
	{
		HashMap<String, Integer> map = new HashMap<>();
		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		map.put("A", 5);
		map.put("B", 7);
		map.put("C", 3);
		map.put("D", 1);
		map.put("E", 2);
		map.put("F", 8);
		map.put("G", 4);
		for (Map.Entry<String, Integer> entry : map.entrySet())
		{
			list.add(entry.getValue());
		}
		Collections.sort(list); 
		for (int num : list) 
		{
			for (Map.Entry<String, Integer> entry : map.entrySet())
			{
				if (entry.getValue().equals(num)) 
				{
					sortedMap.put(entry.getKey(), num);
				}
			}
		}
		System.out.println(sortedMap);
	}

}
