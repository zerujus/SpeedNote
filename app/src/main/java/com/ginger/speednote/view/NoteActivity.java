package com.ginger.speednote.view;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.ginger.speednote.R;

import java.util.ArrayList;

public class NoteActivity extends AppCompatActivity {

    private ArrayList<View> viewArray;

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        viewArray = new ArrayList<>();

        initEditText();
    }

    /**
     * set default editView
     */
    private void initEditText() {
        editText = findViewById(R.id.editText_note);
        editText.setHorizontallyScrolling(false);
        editText.setSingleLine(false);
        viewArray.add(editText);
    }

    /**
     * add image
     */
    private void addImage(){
        ImageView imageView = new ImageView(this);

    }
}
