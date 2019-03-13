import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import lt.vtvpmc.lt.ems.zp182.androidscreen1.R;

public class MainActivity extends AppCompatActivity {

    public EditText input;
    public Button buttonon;
    public TextView nameResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonon = (Button) findViewById(R.id.buttonon);
        nameResult = (TextView) findViewById(R.id.nameResult);

        buttonon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputas = input.getText().toString();// = (EditText) findViewById(R.id.input);

                nameResult.setText(inputas);

            }
        });


    }
}