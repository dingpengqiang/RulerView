package com.ding.pengqiang.rulerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ding.pengqiang.rulerview.weight.OnRulerChangeListener;
import com.ding.pengqiang.rulerview.weight.RulerView;


public class MainActivity extends AppCompatActivity implements OnRulerChangeListener {

        TextView textView;
        RulerView rulerView;
        private int currLocation = 10000;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            rulerView = (RulerView) findViewById(R.id.rulerView);
            rulerView.setOnRulerChangeListener(this);
            rulerView.setCurrLocation(currLocation);
            textView = (TextView) findViewById(R.id.tvValue);
            textView.setText(currLocation + "");
        }
        @Override
        public void onChanged(int newValue) {
            textView.setText(newValue+"");
        }


}
