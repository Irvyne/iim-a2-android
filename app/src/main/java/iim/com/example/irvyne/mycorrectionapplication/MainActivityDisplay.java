package iim.com.example.irvyne.mycorrectionapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivityDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_display);

        Intent intent = getIntent();

        String firstName = intent.getStringExtra(MainActivity.EXTRA_FIRST_NAME);
        String lastName  = intent.getStringExtra(MainActivity.EXTRA_LAST_NAME);
        String fullName = "Hello " + firstName + " " + lastName;

        //String protocol = "http://";
        //String website = "amazon.fr";
        //protocol.concat(website);

        TextView textFullName = (TextView) findViewById(R.id.textFullName);
        textFullName.setText(fullName);
    }
}
