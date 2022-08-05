package exercici8;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseString rs = (str) -> {
			StringBuilder sb = new StringBuilder(str);
		    return sb.reverse().toString();
		};
		System.out.println(rs.reverse("8 icicrexe ,1 llevin ,1 tnirpS"));
	}
}
