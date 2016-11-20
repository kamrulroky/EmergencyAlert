package com.example.kamrulhasan.EmergencyAlert;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MedicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Typeface mytypeface = Typeface.createFromAsset(getAssets(), "TT.ttf");
        TextView mytextview = (TextView) findViewById(R.id.select);
        mytextview.setTypeface(mytypeface);

        onClickAlertListener();
    }


    public void onClickAlertListener() {
        ImageButton alertbutton = (ImageButton) findViewById(R.id.AlertButton);
        alertbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert_builder = new AlertDialog.Builder(MedicalActivity.this);
                alert_builder.setMessage("Do You Want To Call Your Emergency Contact")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent callintent = new Intent(Intent.ACTION_CALL);
                                callintent.setData(Uri.parse("tel:01672145347"));
                                startActivity(callintent);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                AlertDialog redalert =alert_builder.create();
                redalert.setTitle("Confirmation!!!!");
                redalert.show();
            }
        });


    }
}


