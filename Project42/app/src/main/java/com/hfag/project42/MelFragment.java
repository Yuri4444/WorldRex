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

import com.hfag.project42.melEra.MelDetailsActivity;
import com.hfag.project42.melEra.MelEra;

public class MelFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView melRecycler = (RecyclerView)inflater.inflate(R.layout.fragment_mel, container, false);

        String[] names = new String[MelEra.melas.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = MelEra.melas[i].getName();
        }
        int [] images = new int[MelEra.melas.length];
        for (int i = 0; i < images.length; i++) {
            images[i] = MelEra.melas[i].getImageResourcesId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(names, images);
        melRecycler.setAdapter(adapter);

        LinearLayoutManager layoutManager= new LinearLayoutManager(getActivity());
        melRecycler.setLayoutManager(layoutManager);

        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), MelDetailsActivity.class);
                intent.putExtra(MelDetailsActivity.EXTRA_MEL_ID, position);
                getActivity().startActivity(intent);
            }
        });

        // ОТКЛЮЧИТЬ ЭТО  return inflater.inflate(R.layout.fragment_mel, container, false);
        return melRecycler;
    }
}

/*
ArrayAdapter<String> adapter = new ArrayAdapter<>(
                inflater.getContext(),
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.mel)
        );
        setListAdapter(adapter);
 */