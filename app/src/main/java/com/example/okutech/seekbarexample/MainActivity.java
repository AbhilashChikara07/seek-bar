package com.example.okutech.seekbarexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private PriceSeekBar priceBar;
    private int price_min_value;
    private int price_max_value;


//Main Link for seekbar--
//    http://codingsignals.com/crystal-range-seekbar-in-android/
//    https://github.com/syedowaisali/crystal-range-seekbar


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        priceBar = (PriceSeekBar) findViewById(R.id.priceBar);

        priceBar.setOnRangeSeekbarChangeListener(new OnPriceSeekBarChangeListener() {
            @Override
            public void valueChanged(Number minValue, Number maxValue) {
                int minIntValue = minValue.intValue();
                int maxIntValue = maxValue.intValue();

                minIntValue /= 1000;
                minIntValue *= 1000;

                maxIntValue /= 1000;
                maxIntValue *= 1000;

                price_min_value = minIntValue;
                price_max_value = maxIntValue;

            }
        });

        priceBar.setMinStartValue(24000);
        priceBar.setMaxStartValue(100000);
        priceBar.apply();
    }
}
