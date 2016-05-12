package app.maldonadopato91.com.recyclerview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contacto> contactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rvContactos = (RecyclerView)findViewById(R.id.rvContactos);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvContactos.setLayoutManager(llm);
        contactos= new ArrayList<Contacto>();
        InicializarDatos();
        RVAdapter adapter = new RVAdapter(contactos);
        rvContactos.setAdapter(adapter);
    }

    private void InicializarDatos(){
        contactos.add(new Contacto(R.drawable.gray_puppy,"Patricio Maldoando","0987951295","pomr.91@gmail.com"));
        contactos.add(new Contacto(R.drawable.bailarina,"Isabel Maldonado","0984254721","imr@gmail.com"));
        contactos.add(new Contacto(R.drawable.abogada,"Isabel Rivera","0989632601","irn@gmail.com"));
        contactos.add(new Contacto(R.drawable.escalador, "Daniel Lopez","0984245721","dfl@gmail.com"));
    }
}
