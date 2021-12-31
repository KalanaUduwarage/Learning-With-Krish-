
public class Main {	

	static {
		System.out.println("static block of the Main");	
	}

	public static void main(String[] args) {

		System.out.println("this is the main method in the class Main\n");
		TestBlocks block1 = new TestBlocks();
		System.out.println("");
		TestBlocks block2 = new TestBlocks("parameterized");
	}	

	
}

	