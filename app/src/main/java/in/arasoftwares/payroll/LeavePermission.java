package in.arasoftwares.payroll;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import in.arasoftwares.payroll.Fragment.DatePickerFragment;
import in.arasoftwares.payroll.Fragment.TimePickerFragment;

public class LeavePermission extends AppCompatActivity implements View.OnClickListener {

    ImageView sDateBtn, eDateBtn, sTimeBtn, eTimeBtn;
    TextView sDatetext, eDatetext, stimetext, etimetext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leavepermission);
        initializeViews();

    }

    private void initializeViews() {
        sDateBtn = (ImageView) findViewById(R.id.startdate);
        sDatetext = (TextView) findViewById(R.id.startdatetext);
        eDateBtn = (ImageView) findViewById(R.id.enddate);
        eDatetext = (TextView) findViewById(R.id.enddatetext);

        sTimeBtn = (ImageView) findViewById(R.id.starttime);
        stimetext = (TextView) findViewById(R.id.starttimetext);
        eTimeBtn = (ImageView) findViewById(R.id.endtime);
        etimetext = (TextView) findViewById(R.id.endtimetext);
        eDateBtn.setOnClickListener(this);
        sDateBtn.setOnClickListener(this);
        sTimeBtn.setOnClickListener(this);
        eTimeBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.startdate:

                DialogFragment startDateFragment = new DatePickerFragment();
                startDateFragment.show(getSupportFragmentManager(), "datePicker");
                break;
            case R.id.enddate:
                DialogFragment endDateFragment = new DatePickerFragment();
                endDateFragment.show(getSupportFragmentManager(), "datePicker");

                break;
            case R.id.starttime:
                DialogFragment starttimeFragment = new TimePickerFragment();
                starttimeFragment.show(getSupportFragmentManager(), "timePicker");
                break;

            case R.id.endtime:
                DialogFragment endtimeFragment = new TimePickerFragment();
                endtimeFragment.show(getSupportFragmentManager(), "timePicker");
                break;
            default:
                break;
        }
    }
}
