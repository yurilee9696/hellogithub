package kr.hs.emirim.wwhhoo0011.hellogithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = (Button)findViewById(R.id.btnHello); //R = 리소스
        btnHello.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"SHINING DIAMONDS",Toast.LENGTH_SHORT).show();
    }
}
