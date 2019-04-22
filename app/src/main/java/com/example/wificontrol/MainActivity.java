package com.example.wificontrol;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private WifiManager wifiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);


    }

    public void wifi_enable(View view) {

        wifiManager.setWifiEnabled(true);
        Toast.makeText(this, "Wifi Enabling...", Toast.LENGTH_SHORT).show();


    }

    public void wifi_disable(View view) {
        wifiManager.setWifiEnabled(false);
        Toast.makeText(this, "WiFi Disabled", Toast.LENGTH_SHORT).show();




    }
}
