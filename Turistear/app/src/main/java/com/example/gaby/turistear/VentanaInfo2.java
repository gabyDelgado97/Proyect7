package com.example.gaby.turistear;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VentanaInfo2 extends Activity{

    private Button sig2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana_info2);

        sig2=(Button)findViewById(R.id.botonSiguiente2);
        sig2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){
                Intent inten = new Intent(VentanaInfo2.this,VentanaInfo3.class);
                startActivity(inten);

            }
        });
    }
}

