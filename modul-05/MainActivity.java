
package com.example.modul5ku;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import androidx.activity.ComponentActivity;

public class MainActivity extends ComponentActivity {

    Button btnOpenSecond;
    Button btnOpenBrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Tombol membuka SecondActivity
        btnOpenSecond = findViewById(R.id.btnOpenSecond);

        btnOpenSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(
                        MainActivity.this,
                        SecondActivity.class
                );

                startActivity(intent);
            }
        });

        // Tombol membuka Browser
        btnOpenBrowser = findViewById(R.id.btnOpenBrowser);

        btnOpenBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.unipma.ac.id")
                );

                startActivity(intent);
            }
        });
    }
}
