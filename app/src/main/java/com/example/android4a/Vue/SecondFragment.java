package com.example.android4a.Vue;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android4a.Modèle.Product;
import com.example.android4a.R;
import com.example.android4a.Vue.ProductAdapter;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {

    //a list to store all the products
    List<Product> productList;

    //the recyclerview
    RecyclerView recyclerView;

    private int[] mImages = new int[] {
            R.drawable.parallax
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

                //getting the recyclerview from xml
                recyclerView = view.findViewById(R.id.recyclerView);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

                //initializing the productlist
                productList = new ArrayList<>();


                //adding some items to our list
                productList.add(
                        new Product(
                                1,
                                "Développement informatique",
                                "Programmation Web",
                                "DCA CONSULTING",
                                R.drawable.informatique));

                productList.add(
                        new Product(
                                1,
                                "Développement informatique",
                                "Programmation Mobile",
                                "DCA CONSULTING",
                                R.drawable.informatique));

                productList.add(new Product(1,"Développement informatique", "Programmation Logiciel", "DCA CONSULTING", R.drawable.informatique));
                productList.add(new Product(1, "Développement informatique", "Programmation Fonctionelle", "DCA CONSULTING", R.drawable.informatique));

                //CYBERSECURITE
                productList.add(new Product(1,"Cybersécurité ", "Test d'instrusion", "DCA CONSULTING", R.drawable.cybersecurite));
                productList.add(new Product(1, "Cybersécurité", "Gestion de crises", "DCA CONSULTING", R.drawable.cybersecurite));
                productList.add(new Product(1,"Cybersécurité", "Sensibilisation", "DCA CONSULTING", R.drawable.cybersecurite));
                productList.add(new Product(1, "Cybersécurité", "Analyses statique", "DCA CONSULTING", R.drawable.cybersecurite));

                //Systeme embarqué
                productList.add(new Product(1,"Systeme embarqué", "Conceptions de cartes électroniques", "DCA CONSULTING", R.drawable.systeme_embarque));
                productList.add(new Product(1,"Systeme embarqué", "Réseaux de neurones", "DCA CONSULTING", R.drawable.systeme_embarque));
                productList.add(new Product(1,"Systeme embarqué", "Robotique", "DCA CONSULTING", R.drawable.systeme_embarque));
                productList.add(new Product(1,"Systeme embarqué", "Aéronautique", "DCA CONSULTING", R.drawable.systeme_embarque));

                //Gestion de projet
                productList.add(new Product(1,"Gestion de projet", "Agile", "DCA CONSULTING", R.drawable.gestion));
                productList.add(new Product(1, "Gestion de projet", "Plannification", "DCA CONSULTING", R.drawable.gestion));
                productList.add(new Product(1,"Gestion de projet", "MicrosoftProject / Pert", "DCA CONSULTING", R.drawable.gestion));
                productList.add(new Product(1, "Gestion de projet", "Analyses des riques", "DCA CONSULTING", R.drawable.gestion));

                //creating recyclerview adapter
                ProductAdapter adapter = new ProductAdapter(getContext(), productList);

                //setting adapter to recyclerview
                recyclerView.setAdapter(adapter);

                return view;
            }
        }














