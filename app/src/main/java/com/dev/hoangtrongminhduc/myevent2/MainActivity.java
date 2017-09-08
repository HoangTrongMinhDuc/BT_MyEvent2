package com.dev.hoangtrongminhduc.myevent2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btntinhtong=(Button) findViewById(R.id.btn_sum);
        btntinhtong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edta=(EditText) findViewById(R.id.edta);
                EditText edtb=(EditText) findViewById(R.id.edtb);
                int a=Integer.parseInt(edta.getText()+"");
                int b=Integer.parseInt(edtb.getText()+"");
                TextView txvkq=(TextView) findViewById(R.id.txvkq);
                txvkq.setText((a+b)+"");
            }
        });
    }
}
