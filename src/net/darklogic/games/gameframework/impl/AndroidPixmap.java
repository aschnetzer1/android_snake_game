package net.darklogic.games.gameframework.impl;

import android.graphics.Bitmap;

import net.darklogic.games.gameframework.Pixmap;
import net.darklogic.games.gameframework.Graphics.PixmapFormat;

public class AndroidPixmap implements Pixmap {
	Bitmap bitmap;
	PixmapFormat format;
	
	public AndroidPixmap(Bitmap bitmap, PixmapFormat format){
		this.bitmap = bitmap;
		this.format = format;
	}
	
	public int getWidth(){
		return bitmap.getWidth();
	}
	
	public int getHeight(){
		return bitmap.getHeight();
	}
	
	public PixmapFormat getFormat(){
		return format;
	}
	
	public void dispose(){
		bitmap.recycle();
	}
}