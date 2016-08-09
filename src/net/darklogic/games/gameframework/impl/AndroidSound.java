package net.darklogic.games.gameframework.impl;

import android.media.SoundPool;

import net.darklogic.games.gameframework.Sound;

public class AndroidSound implements Sound {
	int soundId;
	SoundPool soundPool;
	
	public AndroidSound(SoundPool soundPool, int soundId) {
		this.soundId = soundId;
		this.soundPool = soundPool;
	}
	
	public void play(float volume){
		soundPool.play(soundId, volume, volume,0,0,1);
	}
	
	public void dispose(){
		soundPool.unload(soundId);
	}
}