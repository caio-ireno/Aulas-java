package source;

public class app {

	public static void main(String[] args) {
		ArrayIndexList<String> A = new ArrayIndexList<String>();

		A.add(0, "caio");
		A.add(1, "nath");

		System.out.println(A.set(0, "bruno"));
		System.out.println(A.toString());
	}

}
