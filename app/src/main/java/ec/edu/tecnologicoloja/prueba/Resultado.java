package ec.edu.tecnologicoloja.prueba;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    private Button btnAtras;
    private TextView mostrarRes;
    private final String extra="Extracheck";
    String aa="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        btnAtras=(Button)findViewById(R.id.btn_atras);
        mostrarRes=(TextView) findViewById(R.id.lblMostrarResultado);


        btnAtras.setOnClickListener(cambiarVentana);
        Bundle extras=getIntent().getExtras();
        aa=extras.getString(extra);
        mostrarRes.setText(aa);




    }

    private View.OnClickListener cambiarVentana = new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            Intent in = new Intent(Resultado.this,MainActivity.class);
            startActivity(in);
        }
    };



}
