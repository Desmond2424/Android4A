package com.example.android4a.Vue;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.android4a.R;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MediaFragment extends Fragment {

    Button play;
    MediaPlayer sound;

    private int[] mImages = new int[] {
            R.drawable.sunset_lover,
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.media_layout, container, false);

            CarouselView carouselView = view.findViewById(R.id.carousel);
            carouselView.setPageCount(mImages.length);
            carouselView.setImageListener(new ImageListener() {
                @Override
                public void setImageForPosition(int position, ImageView imageView) {
                    imageView.setImageResource(mImages[position]);
                }
            });

        play = view.findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer sound = MediaPlayer.create(getContext(), R.raw.sunset_lover);
                sound.start();

            }
        });


        return view;
    }
}





