package com.ginger.speednote.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ginger.speednote.model.Note;
import com.ginger.speednote.R;

public class MainRecycleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private Note[] notes;

    public MainRecycleAdapter(Context context,Note[] notes) {
        this.context = context;
        this.notes = notes;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_main_layout, null, false);
        RecyclerView.ViewHolder holder = new MainViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return notes.length;
    }

    class MainViewHolder extends RecyclerView.ViewHolder{
        TextView textView;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView_recycler_main);
        }
    }
}
