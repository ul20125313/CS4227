package Builder;

import Vehicle.*;

public class CheapWheel extends Wheel{
	
	private double Friction;
	private double Loss;
	public CheapWheel() 
	{
		setAttribute();
		
	}
	private void setAttribute()
	{
		this.Friction = 0.5;
		this.Loss = 3;
	}
	
	public String getExteriorName() {
		return "Exterior"+" CheapWheel";
		
	}
	
}
