
public class InspectionManager {

	//declaration of the static member
	private static volatile InspectionManager inspectionManager;
	
	//Private instructor to not allow multiple instances 
	private InspectionManager ()
	{
		if(inspectionManager != null)
		{
			throw new RuntimeException("Please Use getInspectionManager() Method");
		}
	}

	public static InspectionManager getInspectionManager() {
		if(inspectionManager == null)
		{
			//Lock the InspectionManager class to avoid multithreading issues
			synchronized (InspectionManager.class) 
			{
				//Perform a Double check to make sure the thread safety
				if(inspectionManager==null)
				{
					inspectionManager = new InspectionManager();
				}
			}
		}
		return inspectionManager;
	}

}
