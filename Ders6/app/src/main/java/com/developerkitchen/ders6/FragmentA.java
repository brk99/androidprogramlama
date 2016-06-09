package com.developerkitchen.ders6;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by macbook on 27.05.2016.
 */
public class FragmentA extends Fragment {
    private EditText editText;
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_a, container, false);

        editText = (EditText) rootView.findViewById(R.id.editText);
        button = (Button) rootView.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                if(text.length() > 0) {

                    FragmentB fragmentB = new FragmentB();
                    Bundle bundle = new Bundle();
                    bundle.putString("text", text);
                    fragmentB.setArguments(bundle);

                    getFragmentManager().beginTransaction().add(R.id.container, fragmentB, "FragmentB").addToBackStack("FragmentB").commit();

                }
            }
        });



        return rootView;
    }
}
