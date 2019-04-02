import java.util.Random;

public class Dice 
{

	//identify fields
	//also called instance variables
	//fields always get private access
	//every object gets its own copy of that field
	
	private int numRolls = 0;
	
	//create our methods
	//give us our capabilities
	
	public int roll()
	{
		Random rand = new Random();
		int num = rand.nextInt(6) + 1;
		numRolls++;
		return num;
	}
	
	public int getNumRolls()
	{
		return numRolls;
		
	}
	public void reset()
	{
		numRolls = 0;
	}
	
	
	
	
}
