package fr.wildcoeschool.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**premiere partie quete*/
        CheckBox checkCase=findViewById(R.id.checkBox);
        checkCase.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                 @Override
                                                 public void onCheckedChanged(CompoundButton compoundButton, boolean check) {
                                                     if (check) {
                                                         EditText name = findViewById(R.id.yourFirstname);
                                                         name.setEnabled(true);
                                                         EditText surnom = findViewById(R.id.yourLastname);
                                                         surnom.setEnabled(true);
                                                         Button accept = findViewById(R.id.buttonAccept);
                                                         accept.setEnabled(true);
                                                     }
                                                     else {
                                                         EditText name = findViewById(R.id.yourFirstname);
                                                         name.setEnabled(false);
                                                         EditText surnom = findViewById(R.id.yourLastname);
                                                         surnom.setEnabled(false);
                                                         Button accept = findViewById(R.id.buttonAccept);
                                                         accept.setEnabled(false);
                                                     }
                                                 }
                                                                                                   });
                /**deuxieme partie et troisieme*/
        Button accept=findViewById(R.id.buttonAccept);
        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView congrulation=findViewById(R.id.congralutation);
                EditText name = findViewById(R.id.yourFirstname);
                EditText surnom = findViewById(R.id.yourLastname);
                String nameF=name.getText().toString();
                String surnomF=surnom.getText().toString();



                if(nameF.equals("")|| surnomF.equals("")) {
                    Toast.makeText(MainActivity.this, "Please fill your firstname and lastname", Toast.LENGTH_SHORT).show();
                }
                else{

                    congrulation.setText("Congralutation "+nameF+" "+surnomF);

                }



            }
        });




    }




}


