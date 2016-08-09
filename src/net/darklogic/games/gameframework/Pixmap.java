package net.darklogic.games.gameframework;

import net.darklogic.games.gameframework.Graphics.PixmapFormat;

public interface Pixmap{
	public int getWidth();
	
	public int getHeight();
	
	public PixmapFormat getFormat();
	
	public void dispose();
}