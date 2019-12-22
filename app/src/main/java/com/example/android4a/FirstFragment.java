package com.example.android4a;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;


public class FirstFragment extends Fragment {

    private int[] mImages = new int[] {
        R.drawable.carousel_two,
        R.drawable.carousel_three,
        R.drawable.carousel_one
    };

    private String[] mImageTitle = new String[] {
            "DCA-Consulting",
            "DCA-Consulting",
            "DCA-Consulting"
    };

    public String[] text = {"Desmond CONTEH", "Cedric SOUMAILA", "Zakaria AZAKKOUR"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.firstfragment_layout, container, false);

        CarouselView carouselView = view.findViewById(R.id.carousel);
        carouselView.setPageCount(mImages.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages[position]);
            }
        });

        GridView gridView = view.findViewById(R.id.myGridview);

        Image_adapter image_adapter = new Image_adapter(getContext());
        gridView.setAdapter(image_adapter);


//        ImageView imageView = view.findViewById(R.id.icon);
//        ImageView imageView2 = view.findViewById(R.id.icon1);
//        ImageView imageView3 = view.findViewById(R.id.icon2);
//
//        String url = "https://cdn.pixabay.com/photo/2017/11/06/18/39/apple-2924531_960_720.jpg";
//
//        Picasso.with(getActivity()).load(url).into(imageView);
//        Picasso.with(getActivity()).load(url).into(imageView2);
//        Picasso.with(getActivity()).load(url).into(imageView3);

        return view;
    }
}
