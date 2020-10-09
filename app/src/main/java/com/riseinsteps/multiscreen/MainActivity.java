package com.riseinsteps.multiscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String MSG = "com.riseinsteps.multiscreen.ORDER";

    public void placeOrder(View view){
        Intent intent = new Intent(this, Order.class);
        EditText editText1 = findViewById(R.id.e1);
        EditText editText2 = findViewById(R.id.e2);
        EditText editText3 = findViewById(R.id.e3);
        if(editText1.getText().toString().equals("") || editText3.getText().toString().equals("") || editText2.getText().toString().equals("")){
            Toast.makeText(this, "Please fill above item", Toast.LENGTH_SHORT).show();
        } else {
            String message = "Order for " + editText1.getText().toString() + " , " + editText2.getText().toString() + " & " +
                    editText3.getText().toString() + " is successfully placed";

            intent.putExtra(MSG, message);
            startActivity(intent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}