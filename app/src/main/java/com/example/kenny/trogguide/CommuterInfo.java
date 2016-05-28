package com.example.kenny.trogguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CommuterInfo extends AppCompatActivity implements View.OnClickListener{
    Button btnCommFindLoc, btnCommFindBus, btnCommRequestBus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commuter_info);
        init();
    }

    private void init() {
        btnCommFindBus= (Button) findViewById(R.id.btnCommFindBus);
        btnCommFindLoc= (Button) findViewById(R.id.btnCommFindLoc);
        btnCommRequestBus= (Button) findViewById(R.id.btnCommRequestBus);

        btnCommFindBus.setOnClickListener(CommuterInfo.this);
        btnCommFindLoc.setOnClickListener(CommuterInfo.this);
        btnCommRequestBus.setOnClickListener(CommuterInfo.this);
    }

    @Override
    public void onClick(View v) {
        Intent next = null;

        if (v.getId() == R.id.btnCommRequestBus) {

        } else if (v.getId() == R.id.btnCommFindLoc) {
            next=new Intent(getApplicationContext(),FindLocation.class);
        } else if (v.getId() == R.id.btnCommFindBus) {

        }
        startActivity(next);
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
            startActivity(next);
        return super.onOptionsItemSelected(item);
    }
}

