package com.example.gaby.turistear;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VentanaInfo3 extends Activity{

    private Button sig3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana_info3);

        sig3=(Button)findViewById(R.id.botonSiguiente3);
        sig3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0){
                Intent inten = new Intent(VentanaInfo3.this,MapsActivity.class);
                startActivity(inten);

            }
        });
    }
}
