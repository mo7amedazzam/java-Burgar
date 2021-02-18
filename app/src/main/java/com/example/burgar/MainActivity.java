package com.example.burgar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageView N_Burgar;
    TextView P_Burgar;
    TextView Ingredients;
    public String s1[];
    public String s2[];
    public String s3[];


    public int img_Buragr[] = {R.drawable.beefburger, R.drawable.smokyburger, R.drawable.chickenburger,
            R.drawable.clasicburger,R.drawable.bisonburgers,R.drawable.pestoburger,R.drawable.turkeyburger,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        N_Burgar = findViewById(R.id.img_Burgar);
        P_Burgar = findViewById(R.id.P_Burgar);
        Ingredients = findViewById(R.id.Ingredients);


        recyclerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.N_Burgar);
        s2 = getResources().getStringArray(R.array.P_Burgar);
        s3 = getResources().getStringArray(R.array.Ingredients);
        MyAdapter myAdapter = new MyAdapter(this , s1,s2,s3,img_Buragr);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}