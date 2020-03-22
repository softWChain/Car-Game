package pack1;

public class Var {
	
	static int can = 3;
	static double score = 0, scorecount = 1;
	
	static int x[] = new int[3];
	static int y;
	static int playerPos = 2, playerSize = 35;
	static int enemY[] = new int[12];
	static int r[] = new int[enemY.length];
	static int enemySpeed = 2;
	
	static boolean lost = false, pause = false;
	static boolean drawCollosion = false;
	

	public Var() {
		
		for(int i = 0; i<r.length; i++){
			r[i] = (int)(Math.random()*3)+1;
		}
		
	}

}
