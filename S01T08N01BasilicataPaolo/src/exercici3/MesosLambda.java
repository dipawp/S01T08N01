package exercici3;

import java.util.List;

public class MesosLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> llistaMesos = List.of("gener","febrer","març","april",
				                     "maig","juny","juliol","agost",
				                     "setembre","octubre","novembre",
				                     "desembre");
		llistaMesos.stream().forEach(mes -> System.out.println(mes));
	}
}
