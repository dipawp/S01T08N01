package exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class CadenesLletraO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> llistaStr = new ArrayList<String>();
		llistaStr.add("Hola");
		llistaStr.add("Barça");
		llistaStr.add("Menjar");
		llistaStr.add("Sopar");
		llistaStr.add("Dinar");
		llistaStr.stream().filter(str -> str.contains("o")).forEach(str -> System.out.println(str));	
	}
}
