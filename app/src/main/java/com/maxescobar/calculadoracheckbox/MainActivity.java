package com.maxescobar.calculadoracheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etNumeroA, etNumeroB;
    private TextView tvSuma, tvResta, tvMultiplicacion, tvDivision;
    private CheckBox ckbSuma, ckbResta, ckbMultiplica, ckbdivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumeroA = (EditText) findViewById(R.id.etNumeroA);
        etNumeroB = (EditText) findViewById(R.id.etNumeroB);
        ckbSuma = (CheckBox) findViewById(R.id.ckSuma);
        ckbResta = (CheckBox) findViewById(R.id.ckResta);
        ckbMultiplica = (CheckBox) findViewById(R.id.ckMultiplicacion);
        ckbdivision = (CheckBox) findViewById(R.id.ckDivision);
        tvSuma = (TextView) findViewById(R.id.txvSumaResultado);
        tvResta = (TextView) findViewById(R.id.txvRestaResultado);
        tvMultiplicacion = (TextView) findViewById(R.id.txvMultipResultado);
        tvDivision = (TextView) findViewById(R.id.txvDivResultado);

    }

    //Accion del boton
    public void btnCalculo(View vista){

        //Transformacion a String
        String numA = etNumeroA.getText().toString();
        String numB = etNumeroB.getText().toString();

        //Transforma a int
        int numAint = Integer.parseInt(numA);
        int numBint = Integer.parseInt(numB);

        //String que se mostraran en la cadenas
        String resSuma = "Sin datos";
        String resResta = "Sin datos";
        String resMultiplicacion = "Sin datos";
        String resDivision = "Sin datos";

        if (ckbSuma.isChecked()){
            int suma = numAint + numBint;
            resSuma = "| " + suma + " |";
        }

        tvSuma.setText(resSuma);

        if (ckbResta.isChecked()){
            int resta = numAint - numBint;
            resResta = "| " + resta + " |";
        }

        tvResta.setText(resResta);

        if (ckbMultiplica.isChecked()){
            int multiplicacion = numAint * numBint;
            resMultiplicacion = "| " + multiplicacion + " |";
        }

        tvMultiplicacion.setText(resMultiplicacion);

        if (ckbdivision.isChecked()){
            if (numBint == 0){
                resDivision = "No se puede dividir por cero";
            }else {
                int division = numAint / numBint;
                resDivision = "| " + division + " |";
            }
        }

        tvDivision.setText(resDivision);

    }
}