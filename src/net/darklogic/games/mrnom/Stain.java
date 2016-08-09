package net.darklogic.games.mrnom;

public class Stain {
	public static final int type_1 = 0;
	public static final int type_2 = 1;
	public static final int type_3 = 2;
	public int x, y;
	public int type;
	
	public Stain(int x, int y, int type){
		this.x = x;
		this.y = y;
		this.type = type;
	}
}