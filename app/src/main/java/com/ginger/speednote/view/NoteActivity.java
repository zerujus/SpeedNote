package com.ginger.speednote.view;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ginger.speednote.R;
import com.ginger.speednote.presenter.NotePresenter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class NoteActivity extends AppCompatActivity implements BaseActivity{

    private ArrayList<View> viewArray;
    private NotePresenter presenter;

    private LinearLayout panel_note;
    private TextView date_note;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        // init note presenter
        presenter = new NotePresenter();

        viewArray = new ArrayList<>();

        initLinearLayout();
        initTextView();
        initEditText();
    }

    /**
     * init panel of substance
     */
    private void initLinearLayout() {
        panel_note = findViewById(R.id.panel_note);
    }

    /**
     * set time
     */
    private void initTextView() {
        date_note = findViewById(R.id.date_note);
        Date date  = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分");
        String time = dateFormat.format(date);
        date_note.setText(time);
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
     * add View
     * @param view
     */
    public void addImage(View view) {
        presenter.addImage(panel_note, view);
    }

    /**
     * set note background
     * @param view
     */
    public void setBackground(View view) {
        presenter.setBackground(panel_note, view);
    }

    /**
     * set TextView font
     * @param view
     */
    public void setFont(View view) {

    }

    /**
     * add voice
     * @param view
     */
    public void addVoice(View view) {
        presenter.addVoice(panel_note, view);
    }
}
