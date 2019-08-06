package com.ginger.speednote.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ginger.speednote.R;
import com.ginger.speednote.adapter.MainRecycleAdapter;
import com.ginger.speednote.model.Note;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MainRecycleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle_main);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        DividerItemDecoration did = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(did);

        recyclerView.setHasFixedSize(true);

        Note[] notes = new Note[3];

        adapter = new MainRecycleAdapter(this, notes);
        recyclerView.setAdapter(adapter);
    }
}
