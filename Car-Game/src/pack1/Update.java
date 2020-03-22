package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Update {
	
	Timer time;
	
	public Update(){
		time = new Timer();
		time.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				
				Gui.screenwidth = Gui.jf.getWidth();
				Gui.screenheight = Gui.jf.getHeight();
				
				Gui.draw.setBounds(0,0,Gui.screenwidth, Gui.screenheight);
				
				Var.x[0] = (int) (Gui.screenwidth * (1.0/3.0) - (Gui.screenwidth * (1.0/3.0) / 2));
				Var.x[1] = (int) (Gui.screenwidth * (2.0/3.0) - (Gui.screenwidth * (1.0/3.0) / 2));
				Var.x[2] = (int) (Gui.screenwidth - (Gui.screenwidth * (1.0/3.0) / 2));
				
				Var.y = Gui.screenheight - 100;
				
			}
		}, 0, 100);
	}

}
