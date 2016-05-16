package com.developerkitchen.ders1;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private TextView textView1;
    private Button button;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        textView1 = (TextView) rootView.findViewById(R.id.textView1);
        textView1.setText("Benim adım ibrahim gündüz.");

        button = (Button) rootView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //yapılan işlem
                textView1.setText(textView1.getText().toString() + "/n" + "Ben android programcısıyım.");
            }
        });

        return rootView;
    }
}
