package com.jalaj.firstapp.loginpage;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class ValidateAndWelcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validate_and_welcome);

        Intent intent =getIntent();
        Bundle b = intent.getExtras();
        Credentials credentials =  b.getParcelable("Credentials");

        Log.d("Credentials",credentials.getId()+credentials.getPassword());


        TextView textView = (TextView)findViewById(R.id.textView);

        if ((credentials.getId().compareTo("Welcome")==0)  && (credentials.getPassword().compareTo("Password")==0))
        {

            textView.setText("Welcome "+credentials.getId());
            textView.setTypeface(Typeface.MONOSPACE);

        }
        else textView.setText("Access Denied");
    }
}
