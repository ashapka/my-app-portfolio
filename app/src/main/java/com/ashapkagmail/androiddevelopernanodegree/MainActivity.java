package com.ashapkagmail.androiddevelopernanodegree;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void runSelectedApp(View view) {

        Context context = view.getContext();

        CharSequence buttonText = ((Button) view).getText();
        CharSequence displayText = "This button will launch " + buttonText;

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, displayText, duration);
        toast.show();
    }
}
