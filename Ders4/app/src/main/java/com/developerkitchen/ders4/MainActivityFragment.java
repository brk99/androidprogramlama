package com.developerkitchen.ders4;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {
    private EditText editText;
    private Button button;
    private TextView textView;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        editText = (EditText) rootView.findViewById(R.id.editText);
        button = (Button) rootView.findViewById(R.id.button);
        textView = (TextView) rootView.findViewById(R.id.textView);
        button.setOnClickListener(this);
        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/


        return rootView;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if(id == R.id.button) {
            if(editText.getText().toString().length() > 0) {
                textView.setText(editText.getText().toString());
            } else {
                textView.setText("Lütfen alanı boş bırakmayınız.");
            }
        }
    }
}
