package me.alexjordache.currency_converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void clickConvert(View view) {

        EditText currencyString = (EditText) findViewById(R.id.currencyInput);
        Double currencyNumber = Double.parseDouble(currencyString.getText().toString());
        Double currencyToEuro = currencyNumber * 0.66;
        Toast.makeText(getApplicationContext(), currencyToEuro.toString() + "Euro", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
