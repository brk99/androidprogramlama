package com.developerkitchen.ders7;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private ImageView imageView;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);


        imageView = (ImageView) rootView.findViewById(R.id.imageView);

        Picasso.with(getContext()).load("https://upload.wikimedia.org/wikipedia/tr/4/48/Kaptan_Resim_1.jpg").into(imageView);


        return rootView;
    }
}
