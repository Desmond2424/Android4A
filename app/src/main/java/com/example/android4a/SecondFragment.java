package com.example.android4a;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class SecondFragment extends Fragment {

    private int[] mImages = new int[] {
            R.drawable.pexels,
            R.drawable.pexels2,
            R.drawable.pexels3,

    };

    private String[] mImageTitle = new String[] {
            "DCA-Consulting",
            "DCA-Consulting",
            "DCA-Consulting"
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.secondfragment_layout, container, false);

        CarouselView carouselView = view.findViewById(R.id.carousel);
        carouselView.setPageCount(mImages.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages[position]);
            }
        });
        return view;
    }

}