package com.example.corsista.transizionefragment.Ui.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.corsista.transizionefragment.R;

/**
 * Created by corsista on 26/02/2018.
 */

public class Fragment3 extends Fragment {
    public View onCreateView(LayoutInflater layoutInflater,ViewGroup container,Bundle savedInstanceState){
        return layoutInflater.inflate(R.layout.frag3,container,false);
    }
    public void onViewCreated(View view, Bundle savedInstanceState) {
        TextView textView= (TextView) view.findViewById(R.id.textfrag3);
        textView.setText("C");
    }
}