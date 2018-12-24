package sample.com.gselfie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpEnterOtpActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_enter_otp);

        btn_next=findViewById(R.id.next);
        btn_next.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.next :
                Intent intent=new Intent(this,CreatePasswordActivity.class);
                startActivity(intent);
        }
    }
}
