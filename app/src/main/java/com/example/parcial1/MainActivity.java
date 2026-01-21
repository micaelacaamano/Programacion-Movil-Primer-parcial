package com.example.parcial1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView tv1, tv2, tv3, tv4, tv5, tv6;
    private ImageView im1;
    private RadioButton rb1, rb2, rb3;
    private Button btn1;
    private CheckBox cb1;
    private EditText et1;
    private Spinner spi1;
    private Switch sw1;

    private int precio;
    private int adi;
    private int cantxhora;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1= findViewById(R.id.tv1);
        tv2= findViewById(R.id.tv2);
        tv3= findViewById(R.id.tv3);
        tv4= findViewById(R.id.tv4);
        tv5= findViewById(R.id.tv5);
        tv6= findViewById(R.id.tv6);

        im1=(ImageView) findViewById(R.id.im1);

        rb1= findViewById(R.id.rb1);
        rb2= findViewById(R.id.rb2);
        rb3= findViewById(R.id.rb3);

        sw1 = findViewById(R.id.sw1);
        btn1=(Button) findViewById(R.id.btn1);
        cb1= findViewById(R.id.cb1);
        et1= findViewById(R.id.et1);
        spi1= findViewById(R.id.spi1);

        String[] op= {"Efectivo", "Transferencia", "Tarjeta"};
        ArrayAdapter <String> adap = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, op);
        spi1.setAdapter(adap);

    }

    public void alquiler(View view){

        if (rb1.isChecked()){
            precio = 1000;
            Toast.makeText(this, "Bicicleta de montaña", Toast.LENGTH_SHORT).show();

        } else if (rb2.isChecked()) {
            precio = 2000;
            Toast.makeText(this, "Bicicleta urbana", Toast.LENGTH_SHORT).show();

        } else if (rb3.isChecked()) {
            precio = 4000;
            Toast.makeText(this, "Bicicleta eléctrica", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Seleccione una opción", Toast.LENGTH_SHORT).show();
        }
    }


    public void calcular (View view){
        int valor1= Integer.parseInt(et1.getText().toString());

        cantxhora= valor1 * precio;
    }
    public void adicional(View v){
        if (cb1.isChecked()){
            adi = (int) (cantxhora * 0.20);
        } else {
            adi = 0;
        }
    }


    public void metodo(View view){
        String selec = spi1.getSelectedItem().toString();
        double total = cantxhora + adi;

        if (selec.equals("Efectivo")){
            total = total * 0.80; // 20% descuento
        } else if (selec.equals("Transferencia")){
            total = total * 0.90; // 10% descuento
        } else {
            total = total * 1.10; // 10% recargo
        }

        tv6.setText("$ " + String.format("%.2f", total));

        if (sw1.isChecked()){
            total = total / 1000; // USD
            tv6.setText("USD " + String.format("%.2f", total));
        } else {
            tv6.setText("ARS $ " + String.format("%.2f", total));
        }
    }
    public void importeTotal(View View){
        alquiler(View);
        calcular(View);
        adicional(View);
        metodo(View);
    }
}