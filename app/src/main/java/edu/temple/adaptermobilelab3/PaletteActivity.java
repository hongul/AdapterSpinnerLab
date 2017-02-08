package edu.temple.adaptermobilelab3;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class PaletteActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        Spinner mySpinner = (Spinner) findViewById(R.id.planets_spinner);
        final View myLayout = findViewById(R.id.activity_palette);

        final String[] myColors = {"White", "Cyan", "Blue", "Grey", "Purple"};

        ColorAdapter myAdapter = new ColorAdapter(this, myColors);

        mySpinner.setAdapter(myAdapter);

        AdapterView.OnItemSelectedListener myOISL = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                myLayout.setBackgroundColor(Color.parseColor(((TextView) view).getText().toString()));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        };
        mySpinner.setOnItemSelectedListener(myOISL);
    }
}
