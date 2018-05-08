package sort1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import sort1.Person.Sex;

public class TestSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> slist = new ArrayList<>();
		slist.add("varza");
		slist.add("capra");
		slist.add("miel");
		slist.add("capra");

		System.out.println(slist);
		Collections.sort(slist);
		System.out.println("After sort:" + slist);
		Collections.sort(slist);
		Collections.reverse(slist);
		System.out.println("After sort reversed:" + slist);
		
		Collections.sort(slist);
		Collections.sort(slist, new Comparator<String>() {

			@Override
			public int compare(String pO1, String pO2) {
				return -pO1.compareTo(pO2);
				//return pO2.compareTo(pO1);

			}
		});
		System.out.println("After sort reversed & comparator:" + slist);
		
		List<Person> persoane = new LinkedList<>();
		persoane.add(new Person("Ion", Sex.M, 33));
		persoane.add(new Person("Zamfir", Sex.M, 19));

		persoane.add(new Person("Ioana", Sex.F, 31));
		persoane.add(new Person("Georgeta", Sex.F, 31));

		persoane.add(new Person("Gheorghe", Sex.M, 66));
		persoane.add(new Person("Andreea", Sex.F, 19));
		// Sortam dupa varsta crescator,Femeile apoi Barbatii si nume descrecsator
		Comparator<Person> comp1 = new Comparator<Person>() {
			@Override
			public int compare(Person pO1, Person pO2) {
				if(pO1.getVarsta() < pO2.getVarsta()) {
					return -1;
				} else if(pO1.getVarsta() > pO2.getVarsta()) {
					return 1;
				} else { // varsta1 == varsta2
					if(pO1.getSex().equals(Sex.F)) {
						if(pO2.getSex().equals(Sex.M)) {
							return -1;
						}
					} else {
						// pO1 MALE
						if(pO2.getSex().equals(Sex.F)) {
							return 1;
						}
					}
					// 
					return pO1.getName().compareTo(pO2.getName());
				}
			}
		};
		System.out.println("Persoane nesortate:" + persoane);
		Collections.sort(persoane, comp1);
		System.out.println("Persoane sortate:" + persoane);





	}

}
