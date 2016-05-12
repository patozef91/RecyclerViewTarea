package app.maldonadopato91.com.recyclerviewmascotas;

import java.util.ArrayList;

public class Mascota {
    private String name;
    private int likes = 0;
    private int photoID;
    private int id;


    public Mascota(String name, int photoID, int id) {
        this.photoID = photoID;
        this.name = name;
        this.id = id;
    }

    public int getPhotoID() {
        return photoID;
    }

    public String getName() {
        return name;
    }


    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    void increaseLikes(){
        this.likes = this.likes + 1;
    }


    static ArrayList<Mascota> getdatasetMascotas(){
        ArrayList<Mascota> datasetMascotas = null;
        datasetMascotas = new ArrayList<>();
        datasetMascotas.add(new Mascota("Armani", R.drawable.ax, 1));
        datasetMascotas.add(new Mascota("Channel", R.drawable.channel, 2));
        datasetMascotas.add(new Mascota("Dior", R.drawable.dior, 3));
        datasetMascotas.add(new Mascota("Lambo", R.drawable.lambo, 4));
        datasetMascotas.add(new Mascota("Prada", R.drawable.prada, 5));
        datasetMascotas.add(new Mascota("Nacho", R.drawable.nacho, 6));
        datasetMascotas.add(new Mascota("Vidal", R.drawable.vidal, 7));
        return(datasetMascotas);
    }

    static ArrayList<Mascota> getdatasetMascotasFavoritas(){
        ArrayList<Mascota> datasetMascotas = null;
        datasetMascotas = new ArrayList<>();
        datasetMascotas.add(new Mascota("Armani", R.drawable.ax, 1));
        datasetMascotas.add(new Mascota("Channel", R.drawable.channel, 2));
        datasetMascotas.add(new Mascota("Dior", R.drawable.dior, 3));
        datasetMascotas.add(new Mascota("Lambo", R.drawable.lambo, 4));
        datasetMascotas.add(new Mascota("Prada", R.drawable.prada, 5));
        return(datasetMascotas);
    }

}
