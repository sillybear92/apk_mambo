package com.example.bbik.apk_mambo;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pDeviceList;
import android.net.wifi.p2p.WifiP2pInfo;
import android.net.wifi.p2p.WifiP2pManager;
import android.se.omapi.Channel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.parrot.arsdk.ARSDK;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "Apk_Mambo";



    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
        ARSDK.loadSDKLibs();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainBtn onClickListener = new MainBtn();


        Button buttonConnect=(Button)findViewById(R.id.connect_mambo);
        buttonConnect.setOnClickListener(onClickListener);
        Button buttonStart=(Button)findViewById(R.id.start_mambo);
        buttonStart.setOnClickListener(onClickListener);
        Button buttonRemote=(Button)findViewById(R.id.remote_mambo);
        buttonRemote.setOnClickListener(onClickListener);


    }







    class MainBtn implements Button.OnClickListener{
        @Override
        public void onClick(View view){
            switch (view.getId()){
                case R.id.connect_mambo:
                    Log.d("Log","CONNECT MAMBO");
                    Intent wifi_intent= new Intent(MainActivity.this,WiFiDirectActivity.class);
                    startActivity(wifi_intent);
                    break;

                case R.id.start_mambo:
                    Log.d("Log","START MAMBO");
                    break;
                case R.id.remote_mambo:
                    Log.d("Log","REMOTE MAMBO");
                    Intent remote_intent= new Intent(MainActivity.this,RemoteActivity.class);
                    startActivity(remote_intent);
                    break;
            }
        }
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
