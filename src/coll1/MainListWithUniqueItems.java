package coll1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainListWithUniqueItems {
	static Random __rnd = new Random();
	
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		for(int i = 0;i < 100;i++) {
			Integer element = 2+ __rnd.nextInt(10);
			if(!l1.contains(element)) {
				l1.add(element);
			}
			//if(l1.contains(element)) {
			//	l1.remove(element);
			//	l1.add(element);
			//}
		}
		System.out.println("size:" + l1.size());
		System.out.println(l1.toString());
		for(Integer x : l1) {
			System.out.println("x:" + x);
		}
		
	}
}
