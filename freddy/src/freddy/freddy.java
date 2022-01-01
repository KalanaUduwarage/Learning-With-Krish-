package freddy;

import java.util.*;


public class freddy {

	public static void main(String[] args) {
		
		
		 	int dist=0;
		 	int hops=0;
		 	double time=0.0;
		 	
		 	//get input for dist
		 	System.out.println("Enter the Distance : " );
		 	Scanner s = new Scanner(System.in); 
		 	dist = s.nextInt();
		 	
		 	
		 	if (dist >= 9)
		 	{
		 			hops = dist / 9;
		 			dist = dist % 9;
		 			time = 6.5*hops;
		 			hops=hops*3;	
		 			
		 		 	if(dist >= 5)
				 	{
				 		dist = dist % 5;
				 		hops++;
				 		time += 1.0;
				 	}
				 	
				    if(dist >= 3)
				 	{
				 		dist = dist % 3;
				 		hops++;
				 		time += 2.00;
				 	}
				    
				 	if(dist >= 1)
				 	{
				 		hops++;
				 		time += 3.5;
				 	}
		 	}
		 	else if (dist < 9)
		 	{
		 	 	if(dist > 5)
			 	{
			 		hops+=2;
			 		time+= 3;
			 	}
			 	
		 	 	else 
			 	{
		 	 		hops++;
		 	 		time += 1;
			 	}
		 	}
		 	
		
		 	
		System.out.println("Freddy has jumped " +hops+ " hops and it took " +time+ " seconds" );

	}

}
