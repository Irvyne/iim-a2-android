package iim.com.example.irvyne.mycorrectionapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_FIRST_NAME = "iim.com.example.irvyne.mycorrectionapplication.FIRST_NAME";
    public static final String EXTRA_LAST_NAME = "iim.com.example.irvyne.mycorrectionapplication.LAST_NAME";
    public static final String EXTRA_URL = "iim.com.example.irvyne.mycorrectionapplication.URL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.spinnerProtocol);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinner_protocol, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

    public void displayWebView(View view) {
        Intent intent = new Intent(this, MainActivityWebView.class);

        String url = "";

        // Condition
        switch (view.getId()) {
            case R.id.buttonGoogle:
                url = "https://google.com";
                break;
            case R.id.buttonAmazon:
                url = "https://www.amazon.com";
                break;
            case R.id.buttonSendURL:
                String protocol = ((Spinner) findViewById(R.id.spinnerProtocol)).getSelectedItem().toString();
                url = protocol.concat(((EditText) findViewById(R.id.editURL)).getText().toString());
                break;
            default:
                url = "https://404.com";
        }

        intent.putExtra(EXTRA_URL, url);

        startActivity(intent);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivityDisplay.class);

        EditText editFirstName = (EditText) findViewById(R.id.editFirstName);
        String firstName = editFirstName.getText().toString();

        EditText editLastName = (EditText) findViewById(R.id.editLastName);
        String lastName = editLastName.getText().toString();

        intent.putExtra(EXTRA_FIRST_NAME, firstName);
        intent.putExtra(EXTRA_LAST_NAME, lastName);

        startActivity(intent);
    }
}
