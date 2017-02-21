package com.example.cliente.colourquotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.StringBuilderPrinter;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.citaTextView)
    TextView citaTextView;
    @BindView(R.id.autorTextView)
    TextView autorCitaTextView;
    @BindView(R.id.nuevaCitaButton)
    Button nuevaCitaButton;
    @BindView(R.id.nuevoButton)
    Button nuevoEventoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @OnClick(R.id.nuevaCitaButton)
    public void onClick(View view) {
        GeneradorCita generadorCita = new GeneradorCita();
        Citas citas = generadorCita.obtenerCitasAleatorio();

        citaTextView.setText(citas.getCita());
        citaTextView.setTextColor(citas.getColor());
        autorCitaTextView.setText(citas.getAutor());
        autorCitaTextView.setTextColor(citas.getColor());

        nuevaCitaButton.setBackgroundColor(citas.getColor());
    }

    public void nuevoEvento(View view) {
        Log.d(TAG, "Me han tocado de nuevo");
    }
}
