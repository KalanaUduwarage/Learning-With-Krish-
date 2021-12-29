
public class DriverApp {

	public static void main(String[] args) {
		
		DBFactory DBfactory = new DBFactory();
		
		DBDriver db1 = DBfactory.getDBDriver("oracle");
		db1.deployDriver();
		
		DBDriver db2 = DBfactory.getDBDriver("mongo");
		db2.deployDriver();
		
		DBDriver db3 = DBfactory.getDBDriver("mssql");
		db3.deployDriver();
		

	}

}
