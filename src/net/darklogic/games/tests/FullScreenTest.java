package net.darklogic.games.tests;

import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.view.Window;
import android.view.WindowManager;


public class FullScreenTest extends SingleTouchTest {
	/*Context context = this.getApplicationContext();

	PowerManager powerManager = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
	@SuppressWarnings("deprecation")
	WakeLock wakeLock = powerManager.newWakeLock(PowerManager.FULL_WAKE_LOCK, "My Lock"); */
	
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);

	}
	
	/*public void onResume(){
		super.onResume();
		wakeLock.acquire();
	}
	
	public void onPause(){
		super.onPause();
		wakeLock.release();
	} */
	
}