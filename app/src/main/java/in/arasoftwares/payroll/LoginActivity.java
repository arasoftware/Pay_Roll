package in.arasoftwares.payroll;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Switch;

import in.arasoftwares.payroll.util.Constant;

import static in.arasoftwares.payroll.util.Constant.snack;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = "LoginActivity - Log : ";
    RelativeLayout relativeLayout;
    EditText userName, password;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        views();
        if (!Constant.isNetworkAvailable(this)) {
            snack(relativeLayout, "" + R.string.internet);
        }


    }

    private void views() {
        relativeLayout = (RelativeLayout) findViewById(R.id.logincontainer);
        userName = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            default :
                Log.e(TAG,"No Listener Found");
                break;
        }
    }
}
