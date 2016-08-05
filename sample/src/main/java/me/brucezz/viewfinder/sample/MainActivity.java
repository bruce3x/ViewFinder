package me.brucezz.viewfinder.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import me.brucezz.viewfinder.ViewFinder;
import me.brucezz.viewfinder.annotation.BindView;
import me.brucezz.viewfinder.annotation.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv) TextView mTextView;
    @BindView(R.id.btn) Button mButton;
    @BindView(R.id.et) EditText mEditText;

    @OnClick(R.id.btn)
    public void onButtonClick() {
        Toast.makeText(this, "onButtonClick", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.tv)
    public void onTextClick() {
        Toast.makeText(this, "onTextClick", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewFinder.inject(this);
    }
}
