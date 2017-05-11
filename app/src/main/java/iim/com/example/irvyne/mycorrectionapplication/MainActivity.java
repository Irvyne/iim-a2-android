package iim.com.example.irvyne.mycorrectionapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_FIRST_NAME = "iim.com.example.irvyne.mycorrectionapplication.FIRST_NAME";
    public static final String EXTRA_LAST_NAME = "iim.com.example.irvyne.mycorrectionapplication.LAST_NAME";
    public static final String EXTRA_URL = "iim.com.example.irvyne.mycorrectionapplication.URL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayWebView(View view) {

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivityDisplay.class);

        EditText editFirstName = (EditText) findViewById(R.id.editFirstName);
        EditText editLastName = (EditText) findViewById(R.id.editLastName);

        String firstName = editFirstName.getText().toString();
        String lastName = editLastName.getText().toString();

        intent.putExtra(EXTRA_FIRST_NAME, firstName);
        intent.putExtra(EXTRA_LAST_NAME, lastName);

        startActivity(intent);
    }
}
