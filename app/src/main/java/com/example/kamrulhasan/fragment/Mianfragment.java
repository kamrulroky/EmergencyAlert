package com.example.kamrulhasan.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.kamrulhasan.EmergencyAlert.R;

/**
 * Created by kamrul hasan on 2/8/2016.
 */

public class Mianfragment extends Fragment {


    ImageButton imgButton1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View  rootView = inflater.inflate(R.layout.fragment_main,container,false);
        return rootView;




    }
}
