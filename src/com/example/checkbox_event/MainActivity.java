package com.example.checkbox_event;

import android.os.Bundle;
import android.annotation.SuppressLint;
//import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import android.widget.CompoundButton.OnCheckedChangeListener;


@SuppressLint("NewApi")
public class MainActivity extends Activity implements OnClickListener {
	
	Button b1,b2,b3;
	CheckBox cb1,cb2,cb3,cb4,cb5;
	EditText e1,e2,e3,e4,e5,e6;
	TextView t1,t2,t3,t4,t5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Toast.makeText(this, "CREATED BY RAJKUMAR", Toast.LENGTH_SHORT).show();
		//Toast.makeText(this, "Select the items to place the order", Toast.LENGTH_SHORT).show();
		
		b1 = (Button)findViewById(R.id.button1);
		b2 = (Button)findViewById(R.id.button2);
		b3 = (Button)findViewById(R.id.button3);
		
		t1 = (TextView)findViewById(R.id.textView5);
		t2 = (TextView)findViewById(R.id.textView6);
		t3 = (TextView)findViewById(R.id.textView7);
		t4 = (TextView)findViewById(R.id.textView8);
		t5 = (TextView)findViewById(R.id.textView9);
		
		cb1 = (CheckBox)findViewById(R.id.checkBox1);
		cb2 = (CheckBox)findViewById(R.id.checkBox2);
		cb3 = (CheckBox)findViewById(R.id.checkBox3);
		cb4 = (CheckBox)findViewById(R.id.checkBox4);
		cb5 = (CheckBox)findViewById(R.id.checkBox5);
		
		e1 = (EditText)findViewById(R.id.editText1);
		e2 = (EditText)findViewById(R.id.editText2);
		e3 = (EditText)findViewById(R.id.editText3);
		e4 = (EditText)findViewById(R.id.editText4);
		e5 = (EditText)findViewById(R.id.editText5);
		e6 = (EditText)findViewById(R.id.editText6);
		
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		
		cb1.setOnCheckedChangeListener(new check());
		cb2.setOnCheckedChangeListener(new check());
		cb3.setOnCheckedChangeListener(new check());
		cb4.setOnCheckedChangeListener(new check());
		cb5.setOnCheckedChangeListener(new check());
		
		e1.addTextChangedListener(new TextWatcher(){
			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void beforeTextChanged(CharSequence s, int start,
					int count, int after) {
				// TODO Auto-generated method stub
			}
			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				// TODO Auto-generated method stub
				try
				{
					int no = Integer.parseInt(s.toString());
					int amt =no*100;
					e6.setText(amt+"");
					/*
					if(e2.getText().length() > 0)
					{
						int temp=Integer.parseInt(e2.getText().toString())*75;
						e6.setText(amt+temp+"");
					}
					if(e3.getText().length() > 0)
					{
						int temp=Integer.parseInt(e3.getText().toString())*70;
						e6.setText(amt+temp+"");
					}
					if(e4.getText().length() > 0)
					{
						int temp=Integer.parseInt(e4.getText().toString())*150;
						e6.setText(amt+temp+"");
					}
					if(e5.getText().length() > 0)
					{
						int temp=Integer.parseInt(e5.getText().toString())*90;
						e6.setText(amt+temp+"");
					}*/
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}	
			}		
		});
		
		e2.addTextChangedListener(new TextWatcher(){

			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void beforeTextChanged(CharSequence s, int arg1,
					int arg2, int arg3) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onTextChanged(CharSequence s, int arg1, int arg2,
					int arg3) {
				// TODO Auto-generated method stub
				try
				{
					int no = Integer.parseInt(s.toString());
					int amt = no*75;
					e6.setText(amt+"");
					/*
					if(e1.getText().length() > 0)
					{
						int temp=Integer.parseInt(e1.getText().toString())*75;
						e6.setText(amt+temp+"");
					}
					if(e3.getText().length() > 0)
					{
						int temp=Integer.parseInt(e3.getText().toString())*70;
						e6.setText(amt+temp+"");
					}
					if(e4.getText().length() > 0)
					{
						int temp=Integer.parseInt(e4.getText().toString())*150;
						e6.setText(amt+temp+"");
					}
					if(e5.getText().length() > 0)
					{
						int temp=Integer.parseInt(e5.getText().toString())*90;
						e6.setText(amt+temp+"");
					}*/
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				
			}
			
		});
		
		e3.addTextChangedListener(new TextWatcher(){

			@Override
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onTextChanged(CharSequence s, int arg1, int arg2,
					int arg3) {
				// TODO Auto-generated method stub
				try
				{
					int no = Integer.parseInt(s.toString());
					int amt = no*70;
					e6.setText(amt+"");
					/*
					if(e1.getText().length() > 0)
					{
						int temp=Integer.parseInt(e1.getText().toString())*75;
						e6.setText(amt+temp+"");
					}
					if(e2.getText().length() > 0)
					{
						int temp=Integer.parseInt(e2.getText().toString())*70;
						e6.setText(amt+temp+"");
					}
					if(e4.getText().length() > 0)
					{
						int temp=Integer.parseInt(e4.getText().toString())*150;
						e6.setText(amt+temp+"");
					}
					if(e5.getText().length() > 0)
					{
						int temp=Integer.parseInt(e5.getText().toString())*90;
						e6.setText(amt+temp+"");
					}*/
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
		});
		e4.addTextChangedListener(new TextWatcher(){

			@Override
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onTextChanged(CharSequence s, int arg1, int arg2,
					int arg3) {
				// TODO Auto-generated method stub
				try
				{
					int no = Integer.parseInt(s.toString());
					int amt = no*150;
					e6.setText(amt+"");
					/*
					if(e1.getText().length() > 0)
					{
						int temp=Integer.parseInt(e1.getText().toString())*75;
						e6.setText(amt+temp+"");
					}
					if(e2.getText().length() > 0)
					{
						int temp=Integer.parseInt(e2.getText().toString())*70;
						e6.setText(amt+temp+"");
					}
					if(e3.getText().length() > 0)
					{
						int temp=Integer.parseInt(e3.getText().toString())*150;
						e6.setText(amt+temp+"");
					}
					if(e5.getText().length() > 0)
					{
						int temp=Integer.parseInt(e5.getText().toString())*90;
						e6.setText(amt+temp+"");
					}*/
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
		});
		e5.addTextChangedListener(new TextWatcher(){

			@Override
			public void afterTextChanged(Editable arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void beforeTextChanged(CharSequence arg0, int arg1,
					int arg2, int arg3) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onTextChanged(CharSequence s, int arg1, int arg2,
					int arg3) {
				// TODO Auto-generated method stub
				try
				{
					int no = Integer.parseInt(s.toString());
					int amt = no*90;
					e6.setText(amt+"");
					/*
					if(e1.getText().length() > 0)
					{
						int temp=Integer.parseInt(e1.getText().toString())*75;
						e6.setText(amt+temp+"");
					}
					if(e2.getText().length() > 0)
					{
						int temp=Integer.parseInt(e2.getText().toString())*70;
						e6.setText(amt+temp+"");
					}
					if(e3.getText().length() > 0)
					{
						int temp=Integer.parseInt(e3.getText().toString())*150;
						e6.setText(amt+temp+"");
					}
					if(e4.getText().length() > 0)
					{
						int temp=Integer.parseInt(e4.getText().toString())*90;
						e6.setText(amt+temp+"");
					}*/
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
			
		});
	}
		
	public class check implements OnCheckedChangeListener
	{
		@Override
		public void onCheckedChanged(CompoundButton v, boolean isChecked) {
			// TODO Auto-generated method stub
			if(cb1.isChecked() == true)
			{
				e1.setText("1");
			}
			else
			{
				e1.setText("");
			}
			if(cb2.isChecked() == true)
			{
				e2.setText("1");
			}
			else{
				e2.setText("");
			}
			if(cb3.isChecked() == true)
			{
				e3.setText("1");
			}
			else{
				e3.setText("");
			}
			if(cb4.isChecked() == true)
			{
				e4.setText("1");
			}
			else{
				e4.setText("");
			}
			if(cb5.isChecked() == true)
			{
				e5.setText("1");
			}
			else{
				e5.setText("");
			}
		}
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		int p=100,b=75,s=70,n=150,sm=90,amt=0;
		int ed1,ed2,ed3,ed4,ed5;
		
		if(e1.getText().toString().trim().isEmpty())
		{
			e1.setText("0");
		}
		if(e2.getText().toString().trim().isEmpty())
		{
			e2.setText("0");
		}
		if(e3.getText().toString().trim().isEmpty())
		{
			e3.setText("0");
		}
		if(e4.getText().toString().trim().isEmpty())
		{
			e4.setText("0");
		}
		if(e5.getText().toString().trim().isEmpty())
		{
			e5.setText("0");
		}
		if(e6.getText().toString().trim().isEmpty())
		{
			e6.setText("0");
		}
		ed1 = Integer.parseInt(e1.getText().toString());
		ed2 = Integer.parseInt(e2.getText().toString());
		ed3 = Integer.parseInt(e3.getText().toString());
		ed4 = Integer.parseInt(e4.getText().toString());
		ed5 = Integer.parseInt(e5.getText().toString());
		
		
		//order button
		if(v.getId() == R.id.button1)
		{
			if(cb1.isChecked() == true)
			{
				amt+= p*ed1;
				//Toast.makeText(this, "You have ordered pizza ", Toast.LENGTH_SHORT).show();
				e6.setText(amt+"");
			}
			if(cb2.isChecked() == true)
			{		
				amt+= b*ed2;
				//Toast.makeText(this, "You have ordered Burger", Toast.LENGTH_SHORT).show();
				e6.setText(amt+"");
			}
			if(cb3.isChecked() == true)
			{			
				amt+= s*ed3;
				Toast.makeText(this, "You have ordered Sandwich", Toast.LENGTH_SHORT).show();
			}
			if(cb4.isChecked() == true)
			{
				amt+= n*ed4;
				Toast.makeText(this, "You have ordered Nuggets", Toast.LENGTH_SHORT).show();
			}
			if(cb5.isChecked() == true)
			{	
				amt+= sm*ed5;
				Toast.makeText(this, "You have ordered Smoothie", Toast.LENGTH_SHORT).show();
			}
			if(cb1.isChecked() == false &&  cb2.isChecked() == false && cb3.isChecked() == false && cb4.isChecked() == false && cb5.isChecked() == false)
			{
				Toast.makeText(this, "Please select your favourite dish to order", Toast.LENGTH_LONG).show();
			}		
			Toast.makeText(this, "Total payable amount is Rs:" + amt, Toast.LENGTH_LONG).show();
		}
		
		//refresh button
		
		if(v.getId() == R.id.button2)
		{
			e1.setText("");
			e2.setText("");
			e3.setText("");
			e4.setText("");
			e5.setText("");
			e6.setText("");
			if(cb1.isChecked() == true)
			{
				cb1.toggle();
			}
			if(cb2.isChecked() == true)
			{
				cb2.toggle();
			}
			if(cb3.isChecked() == true)
			{
				cb3.toggle();
			}
			if(cb4.isChecked() == true)
			{
				cb4.toggle();
			}
			if(cb5.isChecked() == true)
			{
				cb5.toggle();
			}
		}
		//amount button
		if(v.getId() == R.id.button3)
		{
			if(cb1.isChecked() == true)
			{
				amt+= p*ed1;
				e6.setText(""+amt);
			}
			if(cb2.isChecked() == true)
			{	
				amt+= b*ed2;
				e6.setText(""+amt);
			}
			if(cb3.isChecked() == true)
			{			
				amt+= s*ed3;
				e6.setText(""+amt);
			}
			if(cb4.isChecked() == true)
			{				
				amt+= n*ed4;
				e6.setText(""+amt);
			}
			if(cb5.isChecked() == true)
			{				
				amt+= sm*ed5;
				e6.setText(""+amt);
			}
			if(cb1.isChecked() == false && cb2.isChecked() == false && cb3.isChecked() == false && cb4.isChecked() == false && cb5.isChecked() == false)
			{
				Toast.makeText(this, "Please select your favourite dish to order", Toast.LENGTH_LONG).show();
			}		

		}
	}
	
}
