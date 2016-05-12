package app.maldonadopato91.com.recyclerviewmascotas;

import android.app.Activity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by Raul on 10/05/2016.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PetnViewHolder>{

    private Activity activity;
    private ArrayList<Mascota> datasetMascotas;

    public static class PetnViewHolder extends RecyclerView.ViewHolder {
        CardView cardview;
        TextView petName;
        TextView petLikes;
        ImageView petPhoto;
        ImageView yellowBone;
        ImageView whiteBone;

        PetnViewHolder(View itemView) {
            super(itemView);
            cardview = (CardView)itemView.findViewById(R.id.cardView);
            petName = (TextView)itemView.findViewById(R.id.TextView_PetName);
            petLikes = (TextView)itemView.findViewById(R.id.TextView_LikesNumner);
            petPhoto = (ImageView)itemView.findViewById(R.id.imageView_Photo);
            yellowBone = (ImageView)itemView.findViewById(R.id.imageView_YellowBone);
            whiteBone = (ImageView)itemView.findViewById(R.id.imageView_WhiteBone);
        }
    }

    RVAdapter(ArrayList<Mascota> datasetMascotas, Activity activity){
        this.datasetMascotas = datasetMascotas;
        this.activity = activity;
    }

    @Override
    public int getItemCount() {
        return datasetMascotas.size();
    }

    @Override
    public PetnViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view, viewGroup, false);
        PetnViewHolder pvh = new PetnViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PetnViewHolder petnViewHolder, final int i) {
        final Mascota pet = datasetMascotas.get(i);
        petnViewHolder.petName.setText(pet.getName());
        petnViewHolder.petLikes.setText(String.valueOf(pet.getLikes()));
        petnViewHolder.petPhoto.setImageResource(pet.getPhotoID());
        petnViewHolder.yellowBone.setImageResource(R.drawable.hueso_like);
        petnViewHolder.whiteBone.setImageResource(R.drawable.hueso);

        petnViewHolder.whiteBone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pet.increaseLikes();
                notifyItemChanged(i, pet);
            }
        });

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
