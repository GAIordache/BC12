package set1;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet1 {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		populateSet(s);
		s.removeAll(Arrays.asList("alfa","beta"));
		System.out.println("size:" + s.size());
		System.out.println(s);
	}
	
	static void populateSet(Set<String> pSet) {
		pSet.add("alfa");
		pSet.add("beta");
		pSet.add("gamma");
		pSet.add("alfa");
		pSet.add("beta");
		pSet.add("gamma");
	}

}
