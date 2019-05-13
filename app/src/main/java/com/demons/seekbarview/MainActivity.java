package com.demons.seekbarview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.demons.seekbarview.binding.BindView;
import com.demons.seekbarview.binding.ViewBinder;
import com.demons.view.IndicatorSeekBar;
import com.demons.view.OnSeekChangeListener;
import com.demons.view.SeekParams;

public class MainActivity extends AppCompatActivity implements OnSeekChangeListener {
    @BindView(R.id.seek_bar)
    IndicatorSeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewBinder.bind(this);
        seekBar.setOnSeekChangeListener(this);
    }

    @Override
    public void onSeeking(SeekParams seekParams) {

    }

    @Override
    public void onStartTrackingTouch(IndicatorSeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(IndicatorSeekBar seekBar) {

    }
}
