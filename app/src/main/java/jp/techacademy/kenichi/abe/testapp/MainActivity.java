package jp.techacademy.kenichi.abe.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView1,mTextView2;
    private LinearLayout mLL;
    private final int WC = LinearLayout.LayoutParams.WRAP_CONTENT;
    private float mWeight = 1.0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //タイトルにカスタマイズレイアウトを指定する
        //requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_main);
        //カスタマイズしたレイアウトファイルを指定
        //getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.titlebar);

        mTextView1 = (TextView) findViewById(R.id.textview1);
        mTextView2 = (TextView) findViewById(R.id.textview2);
        mLL = (LinearLayout) findViewById(R.id.ll);
    }

    public void weight(View v){
        if(mWeight==1.0f){
            mWeight=30.0f;
        }else{
            mWeight=1.0f;
        }
        //LinearLayout.LayoutParams(int width, int height, float weight)
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(0,WC,mWeight);
        mTextView1.setLayoutParams(params);
        mTextView2.setLayoutParams(params);
    }
}
