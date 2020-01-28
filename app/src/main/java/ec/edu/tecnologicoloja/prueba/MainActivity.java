package ec.edu.tecnologicoloja.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Button mButtonSend;
    private EditText mEditTextDate;
    private Spinner spinner;

    private String valorSpiner;
    private String numeroLetras;

    private String []opcionColores={"rojo","verde","amarillo","rojo"};

    private final String extra="Extracheck";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
    }

    private void setViews() {
        // Button
        mButtonSend = (Button) findViewById(R.id.button);

        // EditText
        mEditTextDate = (EditText) findViewById(R.id.editText);
        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner_data, android.R.layout.simple_spinner_item);

       adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

       // asignar arraay de colores al spiner

        spinner.setAdapter(adapter);


        mButtonSend.setOnClickListener(verificar);


    }

    private View.OnClickListener verificar = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        valorSpiner =spinner.getSelectedItem().toString();
            if (valorSpiner=="colores"){




            }else if(valorSpiner=="Cantidad de letras"){
               numeroLetras= mEditTextDate.getText().toString();
               int a= numeroLetras.length();

                Intent in = new Intent(MainActivity.this,Resultado.class);
                in.putExtra(extra,a);
                startActivity(in);

        }



            }
        };




 }















