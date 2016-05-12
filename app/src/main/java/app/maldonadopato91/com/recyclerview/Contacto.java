package app.maldonadopato91.com.recyclerview;

import java.util.ArrayList;

/**
 * Created by User on 10/5/2016.
 */
public class Contacto {
    private int photoId;
    private String nombre;
    private String telefono;
    private String email;

    public Contacto(int photoId, String nombre, String telefono, String email) {
        this.photoId = photoId;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    ArrayList<Contacto> contactos= new ArrayList<Contacto>();

    private void InicializarDatos(){
        contactos.add(new Contacto(R.drawable.gray_puppy,"Patricio Maldoando","0987951295","pomr.91@gmail.com"));
        contactos.add(new Contacto(R.drawable.bailarina,"Isabel Maldonado","0984254721","imr@gmail.com"));
        contactos.add(new Contacto(R.drawable.abogada,"Isabel Rivera","0989632601","irn@gmail.com"));
        contactos.add(new Contacto(R.drawable.escalador, "Daniel Lopez","0984245721","dfl@gmail.com"));
    }


}


