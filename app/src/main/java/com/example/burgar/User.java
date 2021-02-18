package com.example.burgar;
import android.widget.ImageView;
import android.widget.ImageView;

public class User {
    int img_Burgar;
    String N_Burgar;
    String P_Burgar;
    String Ingredients;

    public int getImg_Burgar() {
        return img_Burgar;
    }

    public String getN_Burgar() {
        return N_Burgar;
    }

    public String getP_Burgar() {
        return P_Burgar;
    }

    public String getIngredients() {
        return Ingredients;
    }

    public void setImg_Burgar(int img_Burgar) {
        this.img_Burgar = img_Burgar;
    }

    public void setN_Burgar(String n_Burgar) {
        N_Burgar = n_Burgar;
    }

    public void setP_Burgar(String p_Burgar) {
        P_Burgar = p_Burgar;
    }

    public void setIngredients(String ingredients) {
        Ingredients = ingredients;
    }

    public User(int img_Burgar, String n_Burgar, String p_Burgar, String ingredients) {
        this.img_Burgar = img_Burgar;
        N_Burgar = n_Burgar;
        P_Burgar = p_Burgar;
        Ingredients = ingredients;
    }
}
