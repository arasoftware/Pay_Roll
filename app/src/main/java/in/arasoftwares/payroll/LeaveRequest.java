package in.arasoftwares.payroll;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class LeaveRequest extends AppCompatActivity {
    private EditText edNoteReason, edTotalDate;
    private Spinner spnLeaveType;
    private Button btnSubmit;
    private TextView tvStartDate, tvEndDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaverequest);
        initializeViews();
    }

    private void initializeViews() {
        edNoteReason = (EditText) findViewById(R.id.noteReason);

    }
}
