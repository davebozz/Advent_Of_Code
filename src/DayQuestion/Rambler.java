package DayQuestion;

public class Rambler {
	
	private int x = 0;
	private int y = 0;
	
	private String direction = "N";
	
	
	//Accessors & Mutators
	protected int getX()
	{
		return this.x;
	}
	
	protected int getY()
	{
		return this.y;
	}
	
	protected String getDirection()
	{
		return this.direction;
	}
	
	protected void setX(int x)
	{
		this.x = x;
	}
	
	protected void setY(int y)
	{
		this.y = y;
	}
	
	protected void setDirection(String direction)
	{
		this.direction = direction;
	}
	
	protected void move(int numSpaces)
	{
		if( direction.equals("N") )
			this.y += numSpaces;
		else if ( direction.equals("S") )
			this.y -= numSpaces;
		else if ( direction.equals("E") )
			this.x += numSpaces;
		else if ( direction.equals("W"))
			this.x -= numSpaces;
	}
	
	protected void newDirection(String dir)
	{
		String curDir = "";
		
		if ( direction.equals("N") ) {
			//Direction == N Left(=West) Right(=East)
			if ( dir.equals("R") )
				curDir = "E";
			else 
				curDir = "W";
			
		} else if ( direction.equals("E") ) {
			//Direction == E Left(=North) Right(=South)
			if ( dir.equals("R") )
				curDir = "S";
			else
				curDir = "N";
		} else if ( direction.equals("S") ) {
			
			//Direction == S Left(=East) Right(=West)
			if ( dir.equals("R") )
				curDir = "W";
			else
				curDir = "E";
		} else if ( direction.equals("W") ) {
			
			//Direction == W Left(=South) Right(=North)
		    if ( dir.equals("R") )
		    	curDir = "N";
		    else
		    	curDir = "S";
		}
		
		this.direction = curDir;
	}
}