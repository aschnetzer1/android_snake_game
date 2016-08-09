package net.darklogic.games.gameframework.impl;

import java.io.IOException;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

import net.darklogic.games.gameframework.Music;

public class AndroidMusic implements Music, OnCompletionListener {
	MediaPlayer mediaPlayer;
	boolean isPrepared = false;
	
	public AndroidMusic(AssetFileDescriptor assetDescriptor) {
		mediaPlayer = new MediaPlayer();
		try{
			mediaPlayer.setDataSource(assetDescriptor.getFileDescriptor(),
					assetDescriptor.getStartOffset(),
					assetDescriptor.getLength());
			mediaPlayer.prepare();
			isPrepared = true;
			mediaPlayer.setOnCompletionListener(this);
		} catch (IOException e) {
			throw new RuntimeException("Couldnt Load Music");
		}
	}
	
	public void dispose() {
		if(mediaPlayer.isPlaying())
			mediaPlayer.stop();
		mediaPlayer.release();
	}
	
	public boolean isLooping(){
		return mediaPlayer.isLooping();
	}
	
	public boolean isPlaying(){
		return mediaPlayer.isPlaying();
	}
	
	public boolean isStopped(){
		return !isPrepared;
	}
	
	public void pause(){
		if(mediaPlayer.isPlaying())
			mediaPlayer.pause();
	}
	
	public void play(){
		if(mediaPlayer.isPlaying())
			return;
		try{
			synchronized(this){
				if(!isPrepared)
					mediaPlayer.prepare();
				mediaPlayer.start();
			}
			
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setLooping(boolean isLooping){
		mediaPlayer.setLooping(isLooping);
	}
	
	public void setVolume(float volume){
		mediaPlayer.setVolume(volume, volume);
	}
	
	public void stop(){
		mediaPlayer.stop();
		synchronized(this) {
			isPrepared=false;
		}
	}
	
	public void onCompletion(MediaPlayer player){
		synchronized(this){
			isPrepared=false;
		}
	}
}