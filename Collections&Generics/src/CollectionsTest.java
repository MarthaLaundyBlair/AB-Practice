import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Iterator;

public class CollectionsTest {
	public static void main(String[] args){
		
	
		Animal c1 = new Cat("Clive", 8);
		Animal c2 = new Cat("Orinoko", 5);
		Animal d1 = new Dog("Mungo", 14);
		Animal d2 = new Dog("Mabel", 1);
		Animal r1 = new Rabbit("Bunny", 2);
		Animal r2 = new Rabbit("Dotty", 5);
		
		/*
		Cat c1 = new Cat("Clive", 8);
		Cat c2 = new Cat("Orinoko", 5);
		Dog d1 = new Dog("Mungo", 14);
		Dog d2 = new Dog("Mabel", 1);
		Rabbit r1 = new Rabbit("Bunny", 2);
		Rabbit r2 = new Rabbit("Dotty", 5);
		*/
		
		ArrayList <Animal> animalList = new ArrayList<>();
		
		animalList.add(c1);
		animalList.add(c2);
		animalList.add(d1);
		animalList.add(d2);
		animalList.add(r1);
		animalList.add(r2);
		
		System.out.println(animalList);
	
		/////////////////////////////////////////////////////
		
		HashMap <String, Animal> animalHashMap = new HashMap<>();
		
		animalHashMap.put(c1.getName(), c1);
		animalHashMap.put(c2.getName(), c2);
		animalHashMap.put(d1.getName(), d1);
		animalHashMap.put(d2.getName(), d2);
		animalHashMap.put(r1.getName(), r1);
		animalHashMap.put(r2.getName(), r2);
		
		//System.out.println(animalHashMap);
		
		HashMap <Animal, String> animalHashMap2 = new HashMap<>();
		
		animalHashMap2.put(c1, "Clive the cat");
		animalHashMap2.put(c2, "Orinoko the cat");
		animalHashMap2.put(d1, "Mungo the dog");
		animalHashMap2.put(d2, "Mabel the dog");
		animalHashMap2.put(r1, "Bunny the rabbit");
		animalHashMap2.put(r2, "Dotty the rabbit");
		
		//System.out.println(animalHashMap);
	
	
		/////////////////////////////////////////////////////
		
		HashSet <Animal> animalHashSet = new HashSet<>();
		
		animalHashSet.add(c1);
		animalHashSet.add(c2);
		animalHashSet.add(d1);
		animalHashSet.add(d2);
		animalHashSet.add(r1);
		animalHashSet.add(r2);
		animalHashSet.add(c1);
		animalHashSet.add(c2);
		
		//System.out.println(animalHashSet);
		
		/////////////////////////////////////////////////////
		
		for (int i=0; i < animalList.size(); i++) {
			Animal animalObj = animalList.get(i);
			System.out.println(animalObj);
		}
		
		for(Animal animalObj: animalList) {
			System.out.println(animalObj);
		}
		
		
		Iterator iteratorAnimalList = animalList.iterator();
		
		while(iteratorAnimalList.hasNext()) {
			System.out.println(iteratorAnimalList.next());
		}
		
		
		/////////////////////////////////////////////////////////
		
		// look for items in array list
		boolean containsC1 = animalList.contains(c1);
		int indexC1 = animalList.indexOf(c1);
		//System.out.println(containsC1);
		//System.out.println(indexC1);
		
		// look for items in hash map
		boolean containsMungo = animalHashMap.containsKey("Mungo");
		Animal Mungo = animalHashMap.get("Mungo");
		//System.out.println(Mungo);
		//System.out.println(containsMungo);
		
		// look for items in hash set
		boolean containsMungo2 = animalHashSet.contains("Mungo");
		//System.out.println(containsMungo2);
		
		////////////////////////////////////////////////////////////////////
		
		Collections.sort(animalList);
		//System.out.println(animalList);
		
		///////////////////////////////////////////
		
		SortedSet<Animal> animalSortedSet = new TreeSet<Animal>();
		animalSortedSet.add(c1);
		animalSortedSet.add(c2);
		animalSortedSet.add(d1);
		animalSortedSet.add(d2);
		animalSortedSet.add(r1);
		animalSortedSet.add(r2);
		animalSortedSet.add(c1);
		animalSortedSet.add(c2);
		
		//System.out.print(animalHashSet);
		//System.out.println(animalSortedSet);
		
		//////////////////////////////////////////////
		
		// sort map by key
		SortedMap<String, Animal> animalSortedMap = new TreeMap();
		animalSortedMap.put(c1.getName(), c1);
		animalSortedMap.put(c2.getName(), c2);
		animalSortedMap.put(d1.getName(), d1);
		animalSortedMap.put(d2.getName(), d2);
		animalSortedMap.put(r1.getName(), r1);
		animalSortedMap.put(r2.getName(), r2);
		
		//System.out.println(animalHashMap);
		//System.out.println(animalSortedMap);

		
		
	}
	
	
}
  