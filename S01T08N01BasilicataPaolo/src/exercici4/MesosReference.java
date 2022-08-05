package exercici4;

import java.util.List;

public class MesosReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> llistaMesos = List.of("gener","febrer","març","april",
                "maig","juny","juliol","agost",
                "setembre","octubre","novembre",
                "desembre");
        llistaMesos.stream().forEach(System.out::println);
	}
}
