package com.simon.keyboarddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.simon.keyboardlib.callback.IkeyBoardCallback;
import com.simon.keyboardlib.core.KeyBoardEventBus;

public class MainActivity extends AppCompatActivity implements IkeyBoardCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        KeyBoardEventBus.getDefault().register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        KeyBoardEventBus.getDefault().unregister(this);
    }

    @Override
    public void onKeyBoardShow() {
        Log.v("ghy", "键盘显示");

    }

    @Override
    public void onKeyBoardHidden() {
        Log.v("ghy", "键盘隐藏");
    }
}
