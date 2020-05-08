package application.rahul.findmyage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText placeholder;
    Button button;
    TextView intro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        placeholder = findViewById(R.id.placeholder);
        button = findViewById(R.id.age);
        intro = findViewById(R.id.intro);

        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                int value = Integer.parseInt(placeholder.getText().toString());
                int year = Calendar.getInstance().get(Calendar.YEAR);
                Toast.makeText( MainActivity.this, "You should be " +(year-value)+ " this year", Toast.LENGTH_LONG).show();
            }
        });
    }
}
