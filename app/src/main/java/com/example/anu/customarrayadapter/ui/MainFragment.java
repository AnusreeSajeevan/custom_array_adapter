package com.example.anu.customarrayadapter.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.anu.customarrayadapter.R;
import com.example.anu.customarrayadapter.data.AndroidFlavor;
import com.example.anu.customarrayadapter.data.AndroidFlavorAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class MainFragment extends Fragment {

    private ListView listView;

    private AndroidFlavorAdapter androidFlavorAdapter;
    private ArrayList<AndroidFlavor> androidFlavorArrayList;
    private AndroidFlavor[] androidFlavor = {
            new AndroidFlavor("Cupcake", "1.5", R.drawable.cupcake),
            new AndroidFlavor("Donut", "1.6", R.drawable.donut),
            new AndroidFlavor("Eclair", "2.0-2.1", R.drawable.eclair),
            new AndroidFlavor("Froyo", "2.2-2.2.3", R.drawable.froyo),
            new AndroidFlavor("GingerBread", "2.3-2.3.7", R.drawable.gingerbread),
            new AndroidFlavor("Honeycomb", "3.0-3.2.6", R.drawable.honeycomb),
            new AndroidFlavor("Ice Cream Sandwich", "4.0-4.0.4", R.drawable.icecream),
            new AndroidFlavor("Jelly Bean", "4.1-4.3.1", R.drawable.jellybean),
            new AndroidFlavor("KitKat", "4.4-4.4.4", R.drawable.kitkat),
            new AndroidFlavor("Lollipop", "5.0-5.1.1", R.drawable.lollipop)
    };

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);
        listView = (ListView) view.findViewById(R.id.listview);
        androidFlavorAdapter = new AndroidFlavorAdapter(getActivity(), Arrays.asList(androidFlavor));
        listView.setAdapter(androidFlavorAdapter);
        return view;
    }
}
