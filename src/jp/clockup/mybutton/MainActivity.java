package jp.clockup.mybutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	private int mCount = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void buttonMethod1(View button)
	{
		TextView tv = (TextView)findViewById(R.id.countView);
		tv.setText(String.format("count is %d", ++mCount));
	}
	public void buttonMethod2(View button)
	{
		TextView tv = (TextView)findViewById(R.id.countView);
		tv.setText(String.format("count is %d", --mCount));
	}
}
