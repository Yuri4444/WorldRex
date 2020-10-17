package com.hfag.project42;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.hfag.project42.ursEra.UrsDetailsActivity;
import com.hfag.project42.ursEra.UrsEra;

public class UrsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        RecyclerView ursRecycler = (RecyclerView)inflater.inflate(R.layout.fragment_urs, container, false);
        String[] names = new String[UrsEra.urses.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = UrsEra.urses[i].getName();
        }

        int[] images = new int[UrsEra.urses.length];
        for (int i = 0; i < images.length; i++) {
            images[i] = UrsEra.urses[i].getImageResourcesId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(names, images);
        ursRecycler.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        ursRecycler.setLayoutManager(layoutManager);

        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), UrsDetailsActivity.class);
                intent.putExtra(UrsDetailsActivity.EXTRA_URS_ID, position);
                getActivity().startActivity(intent);
            }
        });

        //ПЕРЕДЕЛАТЬ RETURN

        return ursRecycler;
    }
}