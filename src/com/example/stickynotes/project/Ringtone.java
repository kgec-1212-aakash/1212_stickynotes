package com.example.stickynotes.project;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Ringtone extends Activity{
	MediaPlayer ourtone;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ringtone);
		 ourtone=MediaPlayer.create(Ringtone.this,R.raw.railway);
		ourtone.start();
		Thread timer=new Thread()
		{
			public void run()
			{
				try{
					sleep(15000);
				   }
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				finally
				{
					Intent openStartingPoint=new Intent("com.example.stickynotes.Menu");
					startActivity(openStartingPoint);
				}
			}
		
		};
	timer.start();

}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ourtone.release();
		finish();
	}
	
}