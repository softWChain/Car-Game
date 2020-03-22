package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Collosion {

	Timer time;
	private int temp = 0;

	public Collosion() {

		time = new Timer();
		time.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {

				if (Var.lost == false && Var.pause == false) {

					for (int i = 0; i < Var.enemY.length; i++) {

						if (Var.enemY[i] >= Var.y && Var.enemY[i] <= Var.y + Var.playerSize
								&& Var.r[i] == Var.playerPos) {

							if (Var.can > 1) {
								Var.can--;
								Var.enemY[i] = -1250 - (Gui.screenheight - Var.enemY[i]);
								System.out.println("Lost Life");
								Var.drawCollosion = true;
							} else {
								Var.can--;
								Var.lost = true;
								System.out.println("Lost");
								Var.drawCollosion = true;
							}

						}

					}

				}

				if (Var.drawCollosion && temp < 20) {
					temp++;

				} else if (Var.drawCollosion && temp >= 20) {
					temp = 0;
					Var.drawCollosion = false;
				}

			}
		}, 0, 8);

	}

}
