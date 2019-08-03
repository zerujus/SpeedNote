package com.ginger.speednote;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ginger.adapter.MainRecycleAdapter;
import com.ginger.wight.FontNote;

import butterknife.BindView;

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

        FontNote[] notes = new FontNote[3];
        notes[0] = new FontNote("This is first note", null);
        notes[1] = new FontNote("This is second note\t it's great", null);
        notes[2] = new FontNote("This is third note", null);

        adapter = new MainRecycleAdapter(this, notes);
        recyclerView.setAdapter(adapter);
    }
}
