package com.example.brian.byblos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

/**
 * Created by Brian on 2/6/2016.
 */
public class AccountSetup extends Activity {

    private Button backBtn;
    private Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.account_setup);

        backBtn = (Button) findViewById(R.id.back1);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountSetup.this, MainActivity.class);
                startActivity(intent);
            }
        });

        nextBtn = (Button) findViewById(R.id.next1);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountSetup.this, CreditCard.class);
                startActivity(intent);
            }
        });
    }
}
