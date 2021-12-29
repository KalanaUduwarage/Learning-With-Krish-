
public class ImspectionApp {
	
	public static void main(String[]args)
	{
		InspectionManager inspectionManager1= InspectionManager.getInspectionManager();
		System.out.println("The first inspectionManager instance is :"+inspectionManager1);
		
		InspectionManager inspectionManager2= InspectionManager.getInspectionManager();
		System.out.println("The Second inspectionManager instance is :"+inspectionManager2);
	}

}
