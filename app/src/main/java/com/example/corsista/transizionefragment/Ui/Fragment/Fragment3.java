package com.example.corsista.transizionefragment.Ui.Fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.corsista.transizionefragment.R;
import com.example.corsista.transizionefragment.SwitchListener;

/**
 * Created by corsista on 26/02/2018.
 */

public class Fragment3 extends Fragment {
    SwitchListener switchListener;
    int position=3;
    public View onCreateView(LayoutInflater layoutInflater,ViewGroup container,Bundle savedInstanceState){
        return layoutInflater.inflate(R.layout.frag3,container,false);
    }
    public void onViewCreated(View view, Bundle savedInstanceState) {
        TextView textView= view.findViewById(R.id.textfrag3);
        textView.setText("C");
        Button nextButton = view.findViewById(R.id.next);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switchListener.goRight(position);
            }
        });

        Button previousButton = view.findViewById(R.id.previous);

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switchListener.goLeft(position);
            }
        });

    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            switchListener = (SwitchListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement SwitchListener");
        }
    }
}