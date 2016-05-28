package com.example.kenny.trogguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity implements View.OnClickListener {
    Button btnHomeGenInfo, btnHomeDriInfo, btnHomeCommInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();


    }

    private void init() {
        btnHomeGenInfo= (Button) findViewById(R.id.btnHomeGenInfo);
        btnHomeDriInfo= (Button) findViewById(R.id.btnHomeDriInfo);
        btnHomeCommInfo= (Button) findViewById(R.id.btnHomeCommInfo);

        btnHomeGenInfo.setOnClickListener(Home.this);
        btnHomeCommInfo.setOnClickListener(Home.this);
        btnHomeDriInfo.setOnClickListener(Home.this);

    }

    @Override
    public void onClick(View v) {
        Intent nextActivity = null;
        if(v.getId()==R.id.btnHomeGenInfo){
            nextActivity=new Intent(getApplicationContext(), GeneralInfo.class);
        }else if(v.getId()==R.id.btnHomeCommInfo){
            nextActivity=new Intent(getApplicationContext(), CommuterInfo.class);
        }else if(v.getId()==R.id.btnHomeDriInfo) {
            nextActivity = new Intent(getApplicationContext(), DriverInfo.class);
        }
        startActivity(nextActivity);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.settings, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent next=null;

        if(item.getItemId()==R.id.btnSettingsInterface){

        }else if(item.getItemId()==R.id.btnSettingsSound){

        }else if(item.getItemId()==R.id.btnSettingsLanguage){

        }else if(item.getItemId()==R.id.btnSettingsFeedBack){

        }else if(item.getItemId()==R.id.btnSettingsShare){

        }

        return super.onOptionsItemSelected(item);
    }
}
