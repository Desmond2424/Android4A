package com.example.android4a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

public class Image_adapter extends BaseAdapter {
    public int[] image_id = {R.drawable.desmond, R.drawable.ced,R.drawable.zak};
    public String[] name = {"Desmond CONTEH", "Cedric SOUMAILA", "Zakaria AZAKKOUR"};
    public String[] description = {"Co-CEO et Directeur associé", "Co-CEO et Directeur associé", "Co-CEO et Directeur associé"};

    Context context;

    public Image_adapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return image_id.length ;
    }

    public long getItemId (int Position){
        return Position;
    }

    public Object getItem(int position) {
        return image_id[position];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View gridview = convertView;

        if (gridview == null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            gridview = inflater.inflate(R.layout.custom_image_layout,null);
        }

        ImageView i1 = gridview.findViewById(R.id.myImage);
        i1.setImageResource(image_id[position]);
        TextView textView = gridview.findViewById(R.id.firstLine);
        textView.setText(name[position]);
        TextView textView2 = gridview.findViewById(R.id.description);
        textView2.setText(description[position]);

        return gridview;
    }
}
