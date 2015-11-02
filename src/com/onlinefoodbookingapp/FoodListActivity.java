package com.onlinefoodbookingapp;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.GridView;

public class FoodListActivity extends Activity {
	GridView grid;
	Button morebooks,back;
    public static  ArrayList<Details>detailsList;
    public static int getpositionimage;
   
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_food);
		grid = (GridView)findViewById(R.id.gridbooks);
		morebooks = (Button)findViewById(R.id.morebooks);
		back = (Button)findViewById(R.id.goback);
		morebooks.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
//				Intent blist = new Intent(getApplicationContext(), BookDetailsActivity.class);
//				startActivity(blist);
			}
		});
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent blist = new Intent(getApplicationContext(), MainActvity.class);
				
				startActivity(blist);
			}
		});
		detailsList = proresult();
		grid.setAdapter(new FoodAdapter(getApplicationContext(), detailsList));
		grid.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				Details detail = detailsList.get(position);
				Intent blist = new Intent(getApplicationContext(), FoodDetailsActivity.class);
				blist.putExtra("detail", detail);
				startActivity(blist);

			}
		});
	}

	private ArrayList<Details> proresult() {
		// TODO Auto-generated method stub
		ArrayList<Details>result = new ArrayList<Details>();
		int[]  Images = {R.drawable.biryani,R.drawable.burger,R.drawable.biryani,R.drawable.dosa,
				R.drawable.drumsticks,R.drawable.manchuria,R.drawable.noodls,R.drawable.samosa,
	    		R.drawable.vegbiryani,R.drawable.eggrole,R.drawable.eggmanchuria};
		
			Details pack1= new Details();
			pack1.setAuthor("Biryani");
//			pack1.setName("Tata McGraw-Hill Education");
			pack1.setPrice("200");
			pack1.setImage(Images[0]);
			result.add(pack1);
			
			Details pack2= new Details();
			pack2.setAuthor("Burger");
//			pack2.setName("Programming with C++");
			pack2.setPrice("250");
			pack2.setImage(Images[1]);
			result.add(pack2);
			
			
			
			Details pack3= new Details();
			pack3.setAuthor("ChickenBiryani");
//			pack3.setName("DATABASE MANAGEMENT SYSTEM");
			pack3.setPrice("200");
			pack3.setImage(Images[2]);
			result.add(pack3);
			
			Details pack4= new Details();
			pack4.setAuthor("Dosa");
//			pack4.setName("Object Oriented System With Java");
			pack4.setPrice("220");
			pack4.setImage(Images[3]);
			result.add(pack4);
			
			Details pack5= new Details();
			pack5.setAuthor("Drumsticks");
//			pack5.setName(" Programming with Java ");
			pack5.setPrice("250");
			pack5.setImage(Images[4]);
			result.add(pack5);
			
			Details pack6= new Details();
			pack6.setAuthor("Manchuria");
//			pack6.setName("The Definitive Guide");
			pack6.setPrice("250");
			pack6.setImage(Images[5]);
			result.add(pack6);
			
			Details pack7= new Details();
			pack7.setAuthor("Noodles");
//			pack7.setName("Springs and hibernate frame work");
			pack7.setPrice("150");
			pack7.setImage(Images[6]);
			result.add(pack7);
			
			Details pack8= new Details();
			pack8.setAuthor("Samosa");
//			pack8.setName("Oracle Database SQL Reference, 10g Release 2");
			pack8.setPrice("200");
			pack8.setImage(Images[7]);
			result.add(pack8);
			
			Details pack9= new Details();
			pack9.setAuthor("VegBiryani");
//			pack9.setName("SAP ERP Sales & Distribution ");
			pack9.setPrice("220");
			pack9.setImage(Images[8]);
			result.add(pack9);
			
			Details pack10= new Details();
			pack10.setAuthor("EggRole");
//			pack10.setName("Java Servlet Technology");
			pack10.setPrice("250");
			pack10.setImage(Images[9]);
			result.add(pack10);
			
			Details pack11= new Details();
			pack11.setAuthor("EggManchuria");
//			pack11.setName("Web Technology");
			pack11.setPrice("250");
			pack11.setImage(Images[10]);
			result.add(pack11);
		
		return result;
	}

}