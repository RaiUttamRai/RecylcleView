package com.example.recycleview;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
//import android.setName;

//import androidx.annotation.NonNull;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{
    Activity context;
    //RecyclerView recyclerView;
    //ImageView imageView;
    //TextView textView;
    int[] image;
    String[] name;
    public RecyclerViewAdapter(Activity context, String[] name, int[] image) {
        this.name=name;
        this.image=image;
        this.context=context;

    }

    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View listItem= layoutInflater.inflate(R.layout.recyleview_items,parent,false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        holder.txtName.setText(name[position]);
        holder.imageView.setImageResource(image[position]);
    }

    @Override
    public int getItemCount(){
        return name.length;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtName ;
        ImageView imageView;
        public ViewHolder(View itemView){
            super(itemView);
            txtName= itemView.findViewById(R.id.txtName);
            imageView = itemView.findViewById(R.id.image);
        }

    }
    
}
