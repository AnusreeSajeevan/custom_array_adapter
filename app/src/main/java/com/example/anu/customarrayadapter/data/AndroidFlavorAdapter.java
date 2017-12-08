package com.example.anu.customarrayadapter.data;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.anu.customarrayadapter.R;

import java.util.List;

/**
 * Created by Design on 25-11-2017.
 */

public class AndroidFlavorAdapter extends ArrayAdapter<AndroidFlavor> {

    private ImageView imageView;
    private TextView txtVersionName;
    private TextView txtVersionNumber;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the List is the data we want
     * to populate into the lists
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param androidFlavors A List of AndroidFlavor objects to display in a list
     */
    public AndroidFlavorAdapter(Activity context, List<AndroidFlavor> androidFlavors) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, androidFlavors);
    }

    /**
     * methods providing a view for the adapter view
     * @param position the position that is requesting a view
     * @param covertview the recycled view to populate
     * @param parent the parent ViewGroup that is used for inflation
     * @return the view for the position in the AdapterView
     */
    @Override
    public View getView(int position, View covertview, ViewGroup parent){
        if (covertview == null){
            covertview = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list_item, parent, false);
        }
        AndroidFlavor androidFlavor = getItem(position);
        imageView = (ImageView) covertview.findViewById(R.id.img);
        txtVersionName = (TextView) covertview.findViewById(R.id.tv_version_name);
        txtVersionNumber = (TextView) covertview.findViewById(R.id.tv_version_number);

        imageView.setImageDrawable(getContext().getResources().getDrawable(androidFlavor.getImage()));
        txtVersionName.setText(androidFlavor.getVersionName());
        txtVersionNumber.setText(androidFlavor.getVersionNumber());


        return  covertview;
    }

}
