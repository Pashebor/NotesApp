package com.example.mynotepadapp;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class StarUpList extends Activity implements OnClickListener{
	final int MENU_EXIT = 1;
	Button btnVk, btnInst, btnNote;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.staruplist);
		
		btnVk = (Button) findViewById(R.id.btnVk);
		btnNote = (Button) findViewById(R.id.btnNote);
		btnInst = (Button) findViewById(R.id.btnInst);
		
		btnVk.setOnClickListener(this);
		btnNote.setOnClickListener(this);
		btnInst.setOnClickListener(this);
	}
	@Override
	public void onClick(View v){
		Intent intent;
		switch (v.getId()){
		case R.id.btnVk:
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/"));
			startActivity(intent);
			break;
		case R.id.btnInst:
			intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://instagram.com/"));
			startActivity(intent);
			break;
		case R.id.btnNote:
			intent = new Intent(this, MyNotelist.class);
			startActivity(intent);
			break;
			
		}
		
	}

public boolean onCreateOptinosMenu(Menu menu){
	// TODO Auto-generated method stub
	menu.add(0,MENU_EXIT,0,"Выход");
	return super.onCreateOptionsMenu(menu);
}
@Override
public boolean onOptionsItemSelected(MenuItem item){
	switch(item.getItemId()){
	case MENU_EXIT:
		finish();
		break;
	}
	return super.onOptionsItemSelected(item);
}
}


