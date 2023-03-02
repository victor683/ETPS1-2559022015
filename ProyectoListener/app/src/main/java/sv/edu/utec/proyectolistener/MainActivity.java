package sv.edu.utec.proyectolistener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   //llamara a la pantalla principal
    Button btnprincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnprincipal=findViewById(R.id.btnLsnt);

        //SIRVE PARA LLAMAR EL BOTON PRINCIPAL
        btnprincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento=new Intent(getApplicationContext(),Principal.class); //getApplicationContext()=contexto del objeto que se obtendra
                //SE COMIENZA LA ACTIVITY o llamar la pantalla 3
                startActivity(intento);
            }
        });
    }
    public void pantalla(View v){

        //ACTIVAR o lanzar OTRAS PANTALLAS SE UTILIZA LA CLASE INTENT; this= contexto actual o contexto global o metodo principal
        Intent intento=new Intent(this,Pantalla3.class);
        //SE COMIENZA LA ACTIVITY o llamar la pantalla 3
        startActivity(intento);
    }
    public void salir(View v){
        finish();
    }
}