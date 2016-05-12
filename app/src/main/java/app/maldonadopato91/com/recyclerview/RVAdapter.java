package app.maldonadopato91.com.recyclerview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by User on 10/5/2016.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ContactoViewHolder> {

    public static class ContactoViewHolder extends RecyclerView.ViewHolder {
        CardView cvContacto;
        TextView personName;
        TextView personTelef;
        ImageView personPhoto;

        ContactoViewHolder(View itemView) {
            super(itemView);
            cvContacto = (CardView) itemView.findViewById(R.id.cvContacto);
            personName = (TextView) itemView.findViewById(R.id.person_name);
            personTelef = (TextView) itemView.findViewById(R.id.person_telef);
            personPhoto = (ImageView) itemView.findViewById(R.id.person_photo);
        }
    }

    List<Contacto> contactos;

    RVAdapter(List<Contacto> persons){
        this.contactos = contactos;
    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    @Override
    public ContactoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_main, viewGroup, false);
        ContactoViewHolder cvh = new ContactoViewHolder(v);
        return cvh;
    }

    @Override
    public void onBindViewHolder(ContactoViewHolder personViewHolder, int i) {
        personViewHolder.personName.setText(contactos.get(i).getNombre());
        personViewHolder.personTelef.setText(contactos.get(i).getTelefono());
        personViewHolder.personPhoto.setImageResource(contactos.get(i).getPhotoId());
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
