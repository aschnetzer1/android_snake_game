package net.darklogic.games.mrnom;

import net.darklogic.games.gameframework.Screen;
import net.darklogic.games.gameframework.impl.AndroidGame;

public class MrNomGame extends AndroidGame {
	public Screen getStartScreen(){
		return new LoadingScreen(this);
	}
}