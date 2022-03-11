package CollisionDetection;

import java.util.ArrayList;

import Driver.Driver;
import Simulation_Control.Sim_Controller;

public class DetectionMethod_v1 implements DetectionMethod{


	@Override
	public void detectCollision(ArrayList<Driver>target_drivers, CollisionMonitor c) 
	{
		double dis;
		 
		for(int i=0;i<target_drivers.size();i++)
		{
			for(int j= i+1;j<target_drivers.size();j++)
			{
				
				Driver d1 = target_drivers.get(i);
				Driver d2 = target_drivers.get(j);
				if(d1.getIs_Collosion() == true && d2.getIs_Collosion() == true)
				{
					continue;
				}
				double t1_x = d1.getVehilce().getPosition().getX();
				double t1_y = d1.getVehilce().getPosition().getY();
				double t2_x = d2.getVehilce().getPosition().getX();
				double t2_y = d2.getVehilce().getPosition().getY();
				dis = Math.sqrt((t1_x - t2_x)*(t1_x - t2_x) +(t1_y - t2_y)*(t1_y - t2_y));
				if(dis<10)
				{
					c.if_Collision_occurs(d1,d2);
				}	
			}
		}
	}
	
	@Override
	public void detect_whether_Overtake(ArrayList<Driver> target_drivers, OvertakeMonitor c) {
		double dis;
		 
		for(int i=0;i<target_drivers.size();i++)
		{
			for(int j= i+1;j<target_drivers.size();j++)
			{
				
				Driver d1 = target_drivers.get(i);
				Driver d2 = target_drivers.get(j);
				if(d1.getIs_Collosion() == true && d2.getIs_Collosion() == true)
				{
					continue;
				}
				double t1_x = d1.getVehilce().getPosition().getX();
				double t1_y = d1.getVehilce().getPosition().getY();
				double t2_x = d2.getVehilce().getPosition().getX();
				double t2_y = d2.getVehilce().getPosition().getY();
				dis = Math.sqrt((t1_x - t2_x)*(t1_x - t2_x) +(t1_y - t2_y)*(t1_y - t2_y));
				if(dis<30&&((t1_x>t2_x&&t2_y>500)||(t1_x<t2_x&&t2_y<500)))
				{
					
					if(d1.getVehilce().getLane().getLaneNumber()!=2)
					{
						d1.getVehilce().turn_to_inside_lane();
						
					}
					else 
						d1.getVehilce().turn_to_outside_lane();
					c.removeTargetDriver(d1);
					Sim_Controller.update_monitor(d1, d1.getVehilce().getLane().getLaneNumber());
			
				}
			}
		}
			
	}

	

}
