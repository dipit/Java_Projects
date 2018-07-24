
class Points 
{
	int x,y;
}



public class MAINCLASS {
	
	public static void main ( String[] args)
	{
		
		
		 Points[] points = new Points[3];
		 points[0] = new Points();
		 points[1] = new Points();
		 points[2] = new Points();	
	
	     points[0].x =2; 
		 points[0].y = 7;
		 points[1].x = 9;
		 
		for(Points p:points)
			System.out.println(p.x +"" +p.y);
		
	}
	
	
}
