package com.example.justin.mealwheel;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestFragment extends Fragment {


    public RestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.rest_fragment, container, false);

        String[] restaurantList = {"McDonalds","Taco Bell", "KFC"};
        ListView restList = (ListView) view.findViewById(R.id.restaurantlistview);


        ArrayAdapter<String> restListAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,restaurantList);

        restList.setAdapter(restListAdapter);

        return view;
    }

}
