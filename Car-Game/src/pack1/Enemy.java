package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Enemy {
	Timer time;
	public static int temp = 150;

	public Enemy() {

		time = new Timer();
		time.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				if(Var.lost == false && Var.pause == false){
					
					for(int i = 0; i<Var.enemY.length; i++){
						Var.enemY[i] += Var.enemySpeed;
						
						if(Var.enemY[i] >= Gui.screenheight){
							Var.enemY[i] = -1250;
							Var.r[i] = (int)(Math.random() * 3)+1;
						}
								
					}
					
				}
				
				
			}
		}, 0, 6);
		
	}
	
	public static void reset(){
		
		for(int i = 0; i< Var.enemY.length; i++){
			Var.enemY[i] = -temp;
			temp += 150;
		}
		temp = 0;
	}

}
