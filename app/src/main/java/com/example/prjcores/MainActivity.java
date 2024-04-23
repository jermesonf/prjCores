package com.example.prjcores;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtCor, txtRed, txtGreen, txtBlue;
    SeekBar sbRed;
    SeekBar sbGreen;
    SeekBar sbBlue;

    int red = 0, green = 0, blue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCor = findViewById(R.id.txtCor);
        sbRed = findViewById(R.id.sbRed);
        sbGreen = findViewById(R.id.sbGreen);
        sbBlue = findViewById(R.id.sbBlue);
        txtRed = findViewById(R.id.txtRed);
        txtGreen = findViewById(R.id.txtGreen);
        txtBlue = findViewById(R.id.txtBlue);

        txtCor.setBackgroundColor(Color.rgb(red,green,blue));


        sbRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int posicao, boolean bn)
            {
                //programe aqui

                txtRed.setText("R = " + posicao);

                red = posicao;
                txtCor.setBackgroundColor(Color.rgb(red,green,blue)); //ou chamar o metodo


            }

            @Override//não
            public void onStartTrackingTouch(SeekBar seekBar) { }
            @Override//não
            public void onStopTrackingTouch(SeekBar seekBar) { }
        });


        sbGreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int posicao, boolean bn)
            {
                //programe aqui
                txtGreen.setText("G = " + posicao);

                green = posicao;
                //txtCor.setBackgroundColor(Color.rgb(red,green,blue)); //ou chamar o metodo
                mudancaCor();
            }

            @Override//não
            public void onStartTrackingTouch(SeekBar seekBar) { }
            @Override//não
            public void onStopTrackingTouch(SeekBar seekBar) { }
        });

        sbBlue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int posicao, boolean bn)
            {
                //programe aqui
                txtBlue.setText("B = " + posicao);

                blue = posicao;
                //txtCor.setBackgroundColor(Color.rgb(red,green,blue)); //ou chamar o metodo
                mudancaCor();
            }

            @Override//não
            public void onStartTrackingTouch(SeekBar seekBar) { }
            @Override//não
            public void onStopTrackingTouch(SeekBar seekBar) { }
        });

    }//eventos

    public void mudancaCor()
    {
        txtCor.setBackgroundColor(Color.rgb(red,green,blue));
    }

    public void fechar(View v)
    {
        finish();
    }

}//antes método