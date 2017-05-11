package iim.com.example.irvyne.mycorrectionapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivityWebView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_web_view);

        Intent intent = getIntent();
        String url = intent.getStringExtra(MainActivity.EXTRA_URL);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl(url);
    }
}
