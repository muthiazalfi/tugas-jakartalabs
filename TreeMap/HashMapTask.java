/* Muthia Zahra Zalfi  
 * Tugas 1 
 * 26 Maret 2022
 * */

import java.util.HashMap;
import java.util.HashSet;

public class HashMapTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> favoriteNumbers = new HashMap<>();
		favoriteNumbers.put(10, "Fato");
		favoriteNumbers.put(9, "Cema");
		favoriteNumbers.put(8, "Khansa");
		
		for (Integer key : favoriteNumbers.keySet()) {
			System.out.println("Favorite Numbers of " + favoriteNumbers.get(key) + " is " + key);
		}
		
		System.out.println("Favorite Numbers of " + favoriteNumbers.get(10) + " is " + 10);
		System.out.println("Favorite Numbers of " + favoriteNumbers.get(8) + " is " + 8);
		System.out.println("Favorite Numbers of " + favoriteNumbers.get(9) + " is " + 9);
		
		HashSet<Integer> rollNumbers = new HashSet<>();
		rollNumbers.add(50);
		rollNumbers.add(10);
		rollNumbers.add(30);
		
		for (Integer item : rollNumbers) {
			System.out.println(item);
		}
		
		HashSet<String> clubBasket = new HashSet<>();
		clubBasket.add("Warrior");
		clubBasket.add("Lakers");
		clubBasket.add("Bulls");
		
		for (String item : clubBasket) {
			System.out.println(item);
		}
		
		int a = 10;
		int b = 15;
		System.out.println(a / b);
		
		
		
	}

}
