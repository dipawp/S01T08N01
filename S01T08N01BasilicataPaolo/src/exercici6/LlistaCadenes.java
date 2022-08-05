package exercici6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LlistaCadenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> llista = new ArrayList<String>();
		llista.add("1");
		llista.add("Catalunya");
		llista.add("España");
		llista.add("80");
		llista.add("Alemania");
		llista.add("22");
		llista.add("Italia");
		llista.add("567");
		llista.add("Portugal");
		llista.add("Francia");
		llista = llista.stream().sorted((str1,str2) -> Math.abs(str1.length()) - Math.abs(str2.length())).toList();
		System.out.println(llista);
	}

}
