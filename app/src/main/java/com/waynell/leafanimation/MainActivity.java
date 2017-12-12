package com.waynell.leafanimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.waynell.library.DropAnimationView;

public class MainActivity extends Activity {

	DropAnimationView mDropAnimation;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mDropAnimation = findViewById(R.id.drop_animation_view);
		mDropAnimation.setDrawables(R.drawable.leaf_1,
                R.drawable.leaf_2,
                R.drawable.leaf_3,
                R.drawable.leaf_4,
                R.drawable.leaf_5,
                R.drawable.leaf_6);
//		mDropAnimation.setAnimationRate(200);
		mDropAnimation.startAnimation();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			if (mDropAnimation.isAnimating())
			{
				mDropAnimation.stopAnimation();
			}
			else
			{
				mDropAnimation.startAnimation();
			}
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
