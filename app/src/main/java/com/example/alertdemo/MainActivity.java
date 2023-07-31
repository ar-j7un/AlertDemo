package com.example.alertdemo;

import static android.content.DialogInterface.*;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void BoxAlert(View v)
    {
        AlertDialog.Builder obj= new AlertDialog.Builder(this);
        obj.setMessage("Are you Sure ?");
        obj.setCancelable(true);

        obj.setPositiveButton(android.R.string.ok, this);
        obj.setNegativeButton(android.R.string.cancel, this);

        AlertDialog d= obj.create();
        d.show();

    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        if(i==-1)
        {
            finish();
        }
        else
        {
            dialogInterface.cancel();
        }

    }
}