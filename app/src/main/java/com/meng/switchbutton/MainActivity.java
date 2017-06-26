package com.meng.switchbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ButtonView buttonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonView=(ButtonView)this.findViewById(R.id.btView);
        buttonView.setChangeListener(new ButtonView.onChangeListener() {
            @Override
            public void onChange(boolean state) {
                // TODO Auto-generated method stub
                Toast.makeText(MainActivity.this, "状态:"+state, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
