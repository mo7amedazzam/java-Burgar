package com.example.burgar;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String tv1[], tv2[], tv3[];
    int imagesS1[];
    Context context;


    public MyAdapter(Context ct, String s1[], String s2[], String s3[], int img[]) {
        context = ct;
        tv1 = s1;
        tv2 = s2;
        tv3 = s3;
        imagesS1 = img;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_screen__burgar, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.img_Burgar.setImageResource(imagesS1[position]);
        holder.N_Burgar.setText(tv1[position]);
        holder.P_Burgar.setText(tv2[position]);
        holder.Ingredients.setText(tv3[position]);

    }

    @Override
    public int getItemCount() {
        return imagesS1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView N_Burgar, P_Burgar, Ingredients;
        ImageView img_Burgar;
        ConstraintLayout mainLayout;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img_Burgar = itemView.findViewById(R.id.img_Burgar);
            N_Burgar = itemView.findViewById(R.id.N_Bugrar);
            P_Burgar = itemView.findViewById(R.id.P_Burgar);
            Ingredients = itemView.findViewById(R.id.Ingredients);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}