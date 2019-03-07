package com.ljy.socketdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * @author LiuJinYang
 * @date 2019/3/7
 */
public class MainSwitch extends AppCompatActivity
{

    private Button btn_server;
    private Button btn_client;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_switch_main );
        btn_server=(Button)findViewById ( R.id.btn_server );
        btn_client=(Button)findViewById ( R.id.btn_client );

        btn_server.setOnClickListener ( new View.OnClickListener ( )
        {
            @Override
            public void onClick(View v)
            {
                startActivity ( new Intent( MainSwitch.this,MainSocketServer.class ) );
            }
        } );
        btn_client.setOnClickListener ( new View.OnClickListener ( )
        {
            @Override
            public void onClick(View v)
            {
                startActivity ( new Intent( MainSwitch.this,MainSocketClient.class ) );
            }
        } );

    }
}
