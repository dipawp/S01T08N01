package exercici2;

import java.util.ArrayList;
import java.util.List;

public class Cadenes5LLetres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> llistaStr = new ArrayList<String>();
		llistaStr.add("Guillem");
		llistaStr.add("Flor");
		llistaStr.add("Martina");
		llistaStr.add("Homer");
		llistaStr.add("Bartomeu");
		llistaStr.add("Cristòfol");
		llistaStr.add("Eleonor");
		llistaStr.stream().filter(str -> str.contains("o") && str.length() > 5).forEach(str -> System.out.println(str));
	}
}
