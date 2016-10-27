package com.aryaan.ankitha.scrollingtab;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ankitha on 10/27/2016.
 */
public class FragmentA extends Fragment {

    @Override
    public void onAttach(Context context) {
        Log.i("ANKI","on attach is called");
        super.onAttach(context);
    }

    @Override
    public void onCreate( Bundle savedInstanceState) {
        Log.i("ANKI","on create is called");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        Log.i("ANKI","on create view is called");
        return inflater.inflate(R.layout.fragment_a,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        Log.i("ANKI","on Activity Created is called");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.i("ANKI","on start is called");
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.i("ANKI","on resume is called");
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.i("ANKI","on pause is called");
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        Log.i("ANKI","on Save Instance State is called");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStop() {
        Log.i("ANKI","on stop is called");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.i("ANKI","on Destroy view is called");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.i("ANKI","on Destroy is called");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.i("ANKI","on Detach is called");
        super.onDetach();
    }
}
