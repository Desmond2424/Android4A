package com.example.android4a.Vue;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;


import androidx.fragment.app.Fragment;

import com.example.android4a.R;

public class VideoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.video_layout, container, false);

        VideoView videoView = view.findViewById(R.id.video);

        MediaController mediaController= new MediaController(getActivity());
        mediaController.setAnchorView(videoView);

        //Location of Media File
        Uri uri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.liverpool);

        //Starting VideView By Setting MediaController and URI
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

        return view;
    }
}