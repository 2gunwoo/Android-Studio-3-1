package com.example.androidstudio3_1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private Button 도미넌스, 뉴스, 계산기, 로그인, 행운번호생성기;
    private ImageButton BTC, ETH, NFT, DeFi, WED3, DAPP, SMART, DARK;
    private Thread v;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("STAYBIT : 암호화폐");


        BTC = findViewById(R.id.BTC_move);
        BTC.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BTCActivity.class);
                startActivity(intent);
            }

        });

        NFT = findViewById(R.id.NFT_move);
        NFT.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NFTActivity.class);
                startActivity(intent);
            }

        });

        ETH = findViewById(R.id.ETH_move);
        ETH.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ETHActivity.class);
                startActivity(intent);

            }
        });
        DeFi = findViewById(R.id.DEFI_move);
        DeFi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DeFiActivity.class);
                startActivity(intent);


            }
        });

        계산기 = findViewById(R.id.DOL_move);
        계산기.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DOLLORActivity.class);
                startActivity(intent);
            }
        });

        로그인 = findViewById(R.id.onechart_move);
        로그인.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FullscreenActivity.class);
                startActivity(intent);
            }
        });

        행운번호생성기 = findViewById(R.id.oppo_move);
        행운번호생성기.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OPPOACTIVITY.class);
                startActivity(intent);
            }
        });

        도미넌스 = findViewById(R.id.DOMI_move);
        도미넌스.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CHARTActivity.class);
                startActivity(intent);
            }
        });

        뉴스 = findViewById(R.id.NEWS_move);
        뉴스.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NEWSActivity.class);
                startActivity(intent);
            }
        });


        WED3 = findViewById(R.id.WED3_move);
        WED3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WED3Activity.class);
                startActivity(intent);
            }
        });
        SMART = findViewById(R.id.SMART_move);
        SMART.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SMARTActivity.class);
                startActivity(intent);
            }
        });

        DAPP = findViewById(R.id.DAPP_move);
        DAPP.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DAPPActivity.class);
                startActivity(intent);
            }
        });

        DARK = findViewById(R.id.DARK_move);
        DARK.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DARKActivity.class);
                startActivity(intent);
            }
        });


    }
    public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (v.getId()) {
            case R.id.long_short:
                intent.setData(Uri.parse("https://coinsect.io/"));
                startActivity(intent);
                break;
        }
    }

}
