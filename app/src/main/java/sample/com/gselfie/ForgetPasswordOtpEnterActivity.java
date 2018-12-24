package sample.com.gselfie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ForgetPasswordOtpEnterActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_enter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_next = findViewById(R.id.next);
        btn_next.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.next:
                Intent intent = new Intent(this, NewPasswordActivity.class);
                startActivity(intent);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "Nav Back", Toast.LENGTH_LONG).show();
        finish();
        return true;
    }
}
