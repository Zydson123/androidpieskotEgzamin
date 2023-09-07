package com.example.egzaminacyjnetres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText mailBox = findViewById(R.id.emailBox);
        EditText hasloBox = findViewById(R.id.haslo);
        EditText hasloBox2 = findViewById(R.id.haslo2);
        Button btn = findViewById(R.id.zatwierdz);
        TextView txt = findViewById(R.id.witaj);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = mailBox.getText().toString();
                String haslo = hasloBox.getText().toString();
                String haslo2 = hasloBox2.getText().toString();

                if(!email.contains("@")){
                    txt.setText("Podaj prawidłowy mail!");
                }
                else if(!haslo.equals(haslo2) || haslo.equals("")){
                    txt.setText("Hasła się różnią!");
                }
                else{
                    txt.setText("Witaj: " + email);
                }
            }
        });
    }
}