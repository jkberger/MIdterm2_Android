package com.example.activitylifecycle;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.i("Tracer","On Create Executed");
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected void onStart(Bundle savedInstanceState) {
		super.onStart(savedInstanceState);
		Log.i("Tracer","On Start Executed");
		setContentView(R.layout.activity_main);
	}
	@Override
	protected void onPause(Bundle savedInstanceState) {
		super.onPause(savedInstanceState);
		Log.i("Tracer","On Pause Executed");
		setContentView(R.layout.activity_main);
	
	}
	@Override
	protected void onRestart(Bundle savedInstanceState) {
		super.onRestart(savedInstanceState);
		Log.i("Tracer","On Restart Executed");
		setContentView(R.layout.activity_main);
	}
	
	@Override
	protected void onStop(Bundle savedInstanceState) {
		super.onStop(savedInstanceState);
		Log.i("Tracer","On Stop Executed");
		setContentView(R.layout.activity_main);
	}
	@Override
	protected void onResume(Bundle savedInstanceState) {
		super.onResume(savedInstanceState);
		Log.i("Tracer","On Resume Executed");
		setContentView(R.layout.activity_main);
	}
	@Override
	protected void onDestroy(Bundle savedInstanceState) {
		super.onDestroy(savedInstanceState);
		Log.i("Tracer","On Destroy Executed");
		setContentView(R.layout.activity_main);
	
	
	
	
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
