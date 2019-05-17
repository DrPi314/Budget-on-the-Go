package com.example.budgetonthego;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Create extends Fragment {


    public Create() {
        // Required empty public constructor
    }

    ArrayList<String> accTypes = new ArrayList<>();
    accTypes.add("Credit");
    accTypes.add("Debit");
    accTypes.add("Savings");


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create, container, false);
    }

    AutoCompleteTextView acAccount = getView().findViewById(R.id.acAccount);
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
            android.R.layout.simple_list_item_1, accTypes);
    acAccount.setAdapter(adapter);

}
