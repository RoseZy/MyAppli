package com.example.apple.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by apple on 17/2/20.
 */

public class DogAdapter extends RecyclerView.Adapter<DogAdapter.ViewHolder>{

    private List<Dog>mdogList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView dogImage;
        TextView dogName;


        public ViewHolder(View view){
            super(view);
            dogImage=(ImageView) view.findViewById(R.id.dog_image);
            dogName=(TextView) view.findViewById(R.id.dog_name);
        }

        }

        public DogAdapter(List<Dog>dogList){
            mdogList=dogList;
        }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.dog_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(DogAdapter.ViewHolder holder, int position) {
        Dog dog=mdogList.get(position);
        holder.dogImage.setImageResource(dog.getImageId());
        holder.dogName.setText(dog.getName());
    }

    @Override
    public int getItemCount() {
        return mdogList.size();
    }
}
