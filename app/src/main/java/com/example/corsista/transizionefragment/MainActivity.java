package com.example.corsista.transizionefragment;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.corsista.transizionefragment.Ui.Fragment.Fragment1;
import com.example.corsista.transizionefragment.Ui.Fragment.Fragment2;
import com.example.corsista.transizionefragment.Ui.Fragment.Fragment3;

public class MainActivity extends AppCompatActivity implements SwitchListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        Fragment1 fragment1= new Fragment1();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isnext",false);
        fragment1.setArguments(bundle);
        fragmentTransaction.replace(R.id.contenitoreFragment,fragment1).addToBackStack("ciaone").commit();
    }



    @Override
    public void goRight(int position) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        if(position==3){
            Fragment1 nuovoFrammento =new Fragment1();
            Bundle bundle = new Bundle();
            bundle.putBoolean("isnext",true);
            nuovoFrammento.setArguments(bundle);
            fragmentTransaction.replace(R.id.contenitoreFragment,nuovoFrammento).addToBackStack("ciaone").commit();
        }
        else{
            if(position==1){
                Fragment2 nuovoFrammento=new Fragment2();
                fragmentTransaction.replace(R.id.contenitoreFragment,nuovoFrammento).addToBackStack(null).commit();
            }
            else{
                Fragment3 nuovoFrammento=new Fragment3();
                fragmentTransaction.replace(R.id.contenitoreFragment,nuovoFrammento).addToBackStack(null).commit();
            }
        }
    }

    @Override
    public void goLeft(int position) {
        FragmentManager fragmentManager = getFragmentManager();
        if(position==3){
            fragmentManager.popBackStack("ciaone",0);
        }
        else {
            fragmentManager.popBackStack();
        }
    }
}


