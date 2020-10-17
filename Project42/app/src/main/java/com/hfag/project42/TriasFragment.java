package com.hfag.project42;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.hfag.project42.triasEra.TriasDetaisActivity;
import com.hfag.project42.triasEra.TriasEra;

public class TriasFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Добавляем RecyclerView во фрагмент
        RecyclerView triasRecycler = (RecyclerView) inflater.inflate(R.layout.fragment_trias, container, false);

        // Массив выводящий заголовки
        String[] names = new String[TriasEra.triases.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = TriasEra.triases[i].getName();
        }

        //Массив выводящий картинки
        int [] images = new int[TriasEra.triases.length];
        for (int i = 0; i < images.length; i++) {
            images[i] = TriasEra.triases[i].getImageResourcesId();
        }

        //Массив выводящий описание(description)
//        String[] description = new String[TriasEra.triases.length];
//        for (int i = 0; i < description.length; i++) {
//            description[i] = TriasEra.triases[i].getDescription();
//        }

        //Массивы передаются адаптеру
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(names, images);
        triasRecycler.setAdapter(adapter);

             //Способ представления
//            GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
//            triasRecycler.setLayoutManager(layoutManager);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        triasRecycler.setLayoutManager(layoutManager);

        //Реализация метода onClick интерфейса OnClickListener
        adapter.setListener(new CaptionedImagesAdapter.Listener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), TriasDetaisActivity.class);
                intent.putExtra(TriasDetaisActivity.EXTRA_TRIAS_ID, position);
                getActivity().startActivity(intent);
            }
        });

        return triasRecycler;

    }
}



//    Списковое представление во фрагменте

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(
//                inflater.getContext(),
//                android.R.layout.simple_list_item_1,
//                getResources().getStringArray(R.array.trias)
//        );
//        setListAdapter(adapter);
//        //ПЕРЕДЕЛАТЬ RETURN
//        return super.onCreateView(inflater, container, savedInstanceState);
//    }