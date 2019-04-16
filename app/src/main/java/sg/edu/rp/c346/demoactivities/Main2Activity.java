package sg.edu.rp.c346.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Get the intent so as to get the "things" inside the intent
        Intent i = getIntent();
        // Get the String array name "info" we passed in
        String[] info = i.getStringArrayExtra("info");
        // Get the TextView object
        TextView tv1 = findViewById(R.id.textView1);
        // Display the name and age on the TextView
        tv1.setText("You are " + info[0] + ", age " + info[1]);
    }
}
