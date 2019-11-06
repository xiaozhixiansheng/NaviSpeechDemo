package com.xiaozhi.navispeechdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

public class MainActivity extends AppCompatActivity {
    private EditText mTextView;
    private Button mButton;
    private SpeechUtil mSpeechUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 初始化
        SpeechUtility.createUtility(MainActivity.this, SpeechConstant.APPID + "=5dc22194");
        mSpeechUtil = SpeechUtil.getInstance(getApplicationContext());
        // 初始化组件
        mTextView = findViewById(R.id.speech_text);
        mButton = findViewById(R.id.speech_button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSpeechUtil.speaking(mTextView.getText().toString().trim());
            }
        });
    }
}
