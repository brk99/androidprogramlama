package com.developerkitchen.ders6;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by macbook on 27.05.2016.
 */
public class FragmentB extends Fragment {
    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_b, container, false);

        String text = getArguments().getString("text");

        textView = (TextView) rootView.findViewById(R.id.textView);
        textView.setText(text);

        return rootView;
    }
}
