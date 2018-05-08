package set3;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet3 {
	
	public static void main(String[] args) {
		Persoana p1 = new Persoana("12345", "John", 11);
		System.out.println("p1.hashCode():" + p1.hashCode());
		Persoana p2 = new Persoana("23456", "Michael", 22);
		System.out.println("p2.hashCode():" + p2.hashCode());

		Persoana p3 = new Persoana("9875", "Maria", 33);
		//Set<Persoana> persoane = new TreeSet<>(new PersonComparator());
		Set<Persoana> persoane = new TreeSet<>();
		persoane.add(p1);
		persoane.add(p2);
		persoane.add(p3);
		persoane.add(new Persoana("12345", "John", 33));
		persoane.add(new Persoana("12345", "John", 77));

		persoane.add(p2);
		System.out.println("size:" + persoane.size());
		System.out.println(persoane);
	}

}
