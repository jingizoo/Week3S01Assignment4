package com.jalaj.firstapp.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button b;
    EditText txtField1, txtField2;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_liner);
        txtField1  = (EditText)findViewById(R.id.txtUsername);
        txtField2  = (EditText)findViewById(R.id.txtPassword);
        b = (Button)findViewById(R.id.btn_login);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        bundle = new Bundle();

        String s1 = (txtField1.getText().toString());
        String s2 = (txtField2.getText().toString());
        Log.d(s1,s2);
       Credentials credentials = new Credentials(s1,s2);
        bundle.putParcelable("Credentials",credentials);
        Intent intent = new Intent(MainActivity.this, ValidateAndWelcome.class);
        intent.putExtras(bundle);
        startActivity(intent);
       /* Log.d(s1,s2);
        if ((s1.compareTo("Welcome")==0)  && (s2.compareTo("Password") ==0)) {
            startActivity(intent);
        }*/
    }
}
