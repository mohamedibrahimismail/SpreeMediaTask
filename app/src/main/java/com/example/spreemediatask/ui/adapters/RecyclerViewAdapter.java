package com.example.spreemediatask.ui.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.spreemediatask.R;
import com.example.spreemediatask.data.models.companies.Campaigns;
import com.example.spreemediatask.data.models.companies.Datum;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    Context context;
    List<Datum> list;


    public RecyclerViewAdapter(Context context, Campaigns campaigns){
        list = campaigns.getData();
        this.context =context;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.layout_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.title)
        TextView title;
        @BindView(R.id.status_txt)
        TextView status_txt;
        @BindView(R.id.status_img)
        ImageView status_img;
        @BindView(R.id.cover)
        ImageView cover;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        public void setData(Datum data){
            title.setText(data.getTitle());
            status_txt.setText(data.getStatus());
            switch (data.getStatus()){
                case "SUBMITTED":
                    status_img.setImageDrawable(context.getDrawable(R.drawable.submitted));
                    break;
                case "NOTSUBMITTED":
                    status_img.setImageDrawable(context.getDrawable(R.drawable.pending));
                    break;
                case "ACTIVE":
                    status_img.setImageDrawable(context.getDrawable(R.drawable.active));
                    break;
                case "EXPIRED":
                    status_img.setImageDrawable(context.getDrawable(R.drawable.expired));
                    break;
                case "CANCELED":
                    status_img.setImageDrawable(context.getDrawable(R.drawable.cancelled));
                    break;
            }
            Picasso.with(context).load(data.getCover().getData().getImage()).into(cover);

        }



    }
}
