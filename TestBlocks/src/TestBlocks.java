
public class TestBlocks {

	//constructor without parameters
	public TestBlocks() 
 	{
		System.out.println("TestBlocks class parameterless Constructor");
	}	
	//constructor with parameters
	public TestBlocks(String TestBlock) 
 	{
		System.out.println( TestBlock+"TestBlocks class parameterized Constructor");
	}

	//Static Block
	static
	{
		System.out.println("Static Block");
	}

	//Empty Block
	{
		System.out.println("Empty Block");
	}
}