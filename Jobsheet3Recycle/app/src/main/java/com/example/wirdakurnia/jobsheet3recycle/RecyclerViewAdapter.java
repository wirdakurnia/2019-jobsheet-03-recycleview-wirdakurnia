package com.example.wirdakurnia.jobsheet3recycle;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<String> rvData;

    public RecyclerViewAdapter(ArrayList<String> inputData) {
        rvData = inputData;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvTitle;
        public TextView tvSubtitle;

        public ViewHolder(View v) {
            super(v);
            tvTitle = (TextView) v.findViewById(R.id.tv_title);
            tvSubtitle = (TextView) v.findViewById(R.id.tv_subtitle);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "Playing " +tvTitle.getText(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_rv_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final String name = rvData.get(position);
        holder.tvTitle.setText(rvData.get(position));
        holder.tvSubtitle.setText("Playlist " + position);
}

    @Override
    public int getItemCount() {
        return rvData.size();
    }
}
