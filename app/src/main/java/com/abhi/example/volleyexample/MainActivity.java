package com.abhi.example.volleyexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.abhi.volleyexample.R;

public class MainActivity extends Activity implements OnClickListener {
	private Button btnJson, btnString, btnImage, btnRecycler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btnString = (Button) findViewById(R.id.btnStringRequest);
		btnJson = (Button) findViewById(R.id.btnJsonRequest);
		btnImage = (Button) findViewById(R.id.btnImageRequest);
		btnRecycler = (Button) findViewById(R.id.btnRecyclerViewRequest);

		// button click listeners
		btnString.setOnClickListener(this);
		btnJson.setOnClickListener(this);
		btnImage.setOnClickListener(this);
		btnRecycler.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnStringRequest:
			startActivity(new Intent(MainActivity.this,
					StringRequestActivity.class));
			break;
		case R.id.btnJsonRequest:
			startActivity(new Intent(MainActivity.this,
					JsonRequestActivity.class));
			break;
		case R.id.btnImageRequest:
			startActivity(new Intent(MainActivity.this,
					ImageRequestActivity.class));
			break;
			case R.id.btnRecyclerViewRequest:
				startActivity(new Intent(com.abhi.example.volleyexample.MainActivity.this,
						com.abhi.example.recyclerviewexample.MainActivity.class));
				break;
		default:
			break;
		}
	}

}
