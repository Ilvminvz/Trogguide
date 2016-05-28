package com.example.kenny.trogguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class DriverInfo extends AppCompatActivity {
    Button btnDriDemand, btnDriLessTraf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_info);
        init();
    }

    private void init() {
        btnDriDemand= (Button) findViewById(R.id.btnDriDemand);
        btnDriLessTraf= (Button) findViewById(R.id.btnDriLessTraf);

        btnDriDemand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DriverInfo.this, FindLocation.class));
            }
        });

        btnDriLessTraf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DriverInfo.this, FindLocation.class));
            }
        });
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
