package Vehicle;

public class V4EngineDecorator extends VehicleEngineDecorator{
	

	private double acceleration;
	
	public V4EngineDecorator() {}
	
	public V4EngineDecorator(VehicleType decoratedV) {
		super(decoratedV);
		setAcceleration();
	}

	//return the corresponding information of the car that is equipped with v4 
	@Override
	public double getspeed() {
		// TODO Auto-generated method stub
		return super.decoratedVehicleType.getspeed();
	}

	
	public double getVehicleLength() {
		// TODO Auto-generated method stub
		return super.decoratedVehicleType.getVehicleLength();
	}

	
	public double getVehicleWidth() {
		// TODO Auto-generated method stub
		return super.decoratedVehicleType.getVehicleWidth();
	}

	
	public String getVehicleImagePath() {
		// TODO Auto-generated method stub
		return super.decoratedVehicleType.getVehicleImagePath();
	}

	public double getacceleration() {
		// TODO Auto-generated method stub
		return this.acceleration;
	}
	
	//this function can set the acceleration
	private void setAcceleration() {
		this.acceleration = 0.001 * 2;
	}
	
	public double getAcceleration() {
		return this.acceleration;
	}

	@Override
	public String getCarName() {
		// TODO Auto-generated method stub
		return super.decoratedVehicleType.getCarName();
	}

}
