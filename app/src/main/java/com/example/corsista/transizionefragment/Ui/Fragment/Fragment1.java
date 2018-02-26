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

public class Fragment1 extends Fragment {
    public View onCreateView(LayoutInflater layoutInflater,ViewGroup container,Bundle savedInstanceState){
        return layoutInflater.inflate(R.layout.frag1,container,false);
    }
    public void onViewCreated(View view, Bundle savedInstanceState) {
        TextView textView= (TextView) view.findViewById(R.id.textfrag1);
        textView.setText("A");
    }
}
