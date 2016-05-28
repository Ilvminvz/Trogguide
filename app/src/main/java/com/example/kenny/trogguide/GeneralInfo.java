package com.example.kenny.trogguide;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class GeneralInfo extends AppCompatActivity implements View.OnClickListener {
    Button btnGenFindRoute, btnGenFindBus, btnGenCallPolice, btnGenCallAmb, btnGenCallFire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_info);
        init();
    }

    private void init() {
        btnGenCallAmb = (Button) findViewById(R.id.btnGenCallAmb);
        btnGenCallFire = (Button) findViewById(R.id.btnGenCallFire);
        btnGenCallPolice = (Button) findViewById(R.id.btnGenCallPolice);
        btnGenFindBus = (Button) findViewById(R.id.btnGenFindBus);
        btnGenFindRoute = (Button) findViewById(R.id.btnGenFindRoute);

        btnGenFindRoute.setOnClickListener(GeneralInfo.this);
        btnGenCallFire.setOnClickListener(GeneralInfo.this);
        btnGenCallPolice.setOnClickListener(GeneralInfo.this);
        btnGenFindBus.setOnClickListener(GeneralInfo.this);
        btnGenCallAmb.setOnClickListener(GeneralInfo.this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.settings, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent next = null;

        if (item.getItemId() == R.id.btnSettingsInterface) {

        } else if (item.getItemId() == R.id.btnSettingsSound) {

        } else if (item.getItemId() == R.id.btnSettingsLanguage) {

        } else if (item.getItemId() == R.id.btnSettingsFeedBack) {

        } else if (item.getItemId() == R.id.btnSettingsShare) {

        }
        startActivity(next);
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnGenCallFire) {
            Uri num=Uri.parse("tel:192");
            startActivity(new Intent(Intent.ACTION_DIAL, num));
        } else if (v.getId() == R.id.btnGenCallAmb) {
            Uri num=Uri.parse("tel:193");
            startActivity(new Intent(Intent.ACTION_DIAL, num));
        } else if (v.getId() == R.id.btnGenCallPolice) {
            Uri num=Uri.parse("tel:191");
            startActivity(new Intent(Intent.ACTION_DIAL, num));
        }else if(v.getId()==R.id.btnGenFindBus){
            findbusLoc();
            startActivity(new Intent(getApplicationContext(),FindLocation.class));
        }else if(v.getId()==R.id.btnGenFindRoute){
            startActivity(new Intent(getApplicationContext(), FindLocation.class));
        }
    }

    private void findbusLoc(){
        File file=new File(String.valueOf(getResources().openRawResource(R.raw.stops)));
        try{
        Scanner scan=new Scanner(file);
        int size=300;
        String line;
        ArrayList[][] terminal = new ArrayList[size][4];
            String[] temp=new String[4];
        while(scan.hasNextLine()) {
            line = scan.nextLine();
            for (int i = 0; i < size; i++) {
               temp=line.split(",");
                for(int j=0; j<4; j++){
                    terminal[i][j].add(temp[j]);
            }
        }
        }}
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
