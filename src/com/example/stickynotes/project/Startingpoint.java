package com.example.stickynotes.project;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Startingpoint extends Activity {
	int counter;
	Button add,sub;
	TextView display;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startingpoint);
        counter=0;
        add=(Button) findViewById(R.id.bAdd);
        sub=(Button) findViewById(R.id.bSub);
        display=(TextView) findViewById(R.id.tvdisplay);
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View args0) {
				// TODO Auto-generated method stub
				counter=counter+1;
				display.setText("your total is "+counter);
			}
		});
sub.setOnClickListener(new View.OnClickListener() {
			
			
			public void onClick(View args) {
				// TODO Auto-generated method stub
				counter=counter-1;
				display.setText("your total is "+counter);
			}
		});
    }


    
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.startingpoint, menu);
        return true;
    }
    
    
}
