
public class DBFactory {
	
	public DBDriver getDBDriver(String DB)
	{
		if(DB==null)
		{
			return null;
		}
		else if (DB=="oracle")
		{
			return new OracleDB();
		}
		else if (DB=="mssql")
		{
			return new MSSQLDB();
		}
		else if (DB=="mongo")
		{
			return new MongoDB();
		}
		else 
			return null;
	}

}
