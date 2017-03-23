package com.rghossi.colormaker;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mColorView;
    SeekBar mRedSeekBar;
    SeekBar mGreenSeekBar;
    SeekBar mBlueSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mColorView = (TextView) findViewById(R.id.colorView);
        mRedSeekBar = (SeekBar) findViewById(R.id.redSeekBar);
        mGreenSeekBar = (SeekBar) findViewById(R.id.greenSeekBar);
        mBlueSeekBar = (SeekBar) findViewById(R.id.blueSeekBar);

        SeekBar.OnSeekBarChangeListener changeListener = new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int r = mRedSeekBar.getProgress();
                int g = mGreenSeekBar.getProgress();
                int b = mBlueSeekBar.getProgress();
                Log.d("COLORS", r + " | " + g + " | " + b);
                mColorView.setBackgroundColor(Color.rgb(r,g,b));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        };

        mRedSeekBar.setOnSeekBarChangeListener(changeListener);
        mGreenSeekBar.setOnSeekBarChangeListener(changeListener);
        mBlueSeekBar.setOnSeekBarChangeListener(changeListener);
    }
}
