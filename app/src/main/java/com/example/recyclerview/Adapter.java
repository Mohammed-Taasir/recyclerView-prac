package com.example.recyclerview;

import android.graphics.ColorSpace;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// YOU HAVE TO MAKE TWO CLASSES 1.MODELCLASS AND 2.VIEWHOLDER

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> userList;

    public Adapter(List<ModelClass> userList){
        this.userList = userList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) { // this binds data from mainactivity.java to inside our layout recycler view
        int resource = userList.get(position).getImageView();
        String name = userList.get(position).getTxtview1();
        String time = userList.get(position).getTxtview2();
        String msg = userList.get(position).getTxtview3();
        String line = userList.get(position).getDivider();

        holder.setData(resource, name, time, msg, line);
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView1;
        private TextView textView2;
        private TextView textView3;
        private TextView divider;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imgOnCard);
            textView1 = itemView.findViewById(R.id.nameTextview);
            textView2 = itemView.findViewById(R.id.timeTextview);
            textView3 = itemView.findViewById(R.id.msgTextview);
            divider = itemView.findViewById(R.id.horline);


        }

        public void setData(int resource, String name, String time, String msg, String line) {
            imageView.setImageResource(resource);
            textView1.setText(name);
            textView2.setText(time);
            textView3.setText(msg);
            divider.setText(line);
        }
    }
}
