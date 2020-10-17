package com.hfag.project42;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder> {
    private String[] captions;
    private int[] images;


    //  1)Добавление слушателя как переменной
    private Listener listener;

    //  2)Добавление интерфейса слушателя
    interface Listener {
        void onClick(int position);
    }

    //  3)Добавление сеттера для регистрации слушателя
    public void setListener(Listener listener) {
        this.listener = listener;
    }



    //Имплементируем каличество елементов данных
    @Override
    public int getItemCount() {
        return captions.length;
    }
    //Имплементируем каличество елементов данных


    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

//        Указывает что ViewHolder дложен быть в ввиде карточки
        public ViewHolder(CardView v) {
            super(v);
            this.cardView = v;
        }
    }

    public CaptionedImagesAdapter(String[] captions, int[] images) {
        this.captions = captions;
        this.images = images;

    }

    //Метод сообщает как именно нужно создавать объекты и откуда их брать (добавляем XML)

    public CaptionedImagesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cv =(CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.kartochki_dla_dino, parent, false);
        return new ViewHolder(cv);
    }




    //Заполение текстом и картинками

    public void onBindViewHolder(ViewHolder viewHolder, @SuppressLint("RecyclerView") final int i) {
        //Макет для картинок и текстов
        final CardView cardView = viewHolder.cardView;
        ImageView imageView = cardView.findViewById(R.id.image_dinozavra);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), images[i]);

        //Картинка
        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(captions[i]);

        //Заглавие
        TextView textView = cardView.findViewById(R.id.title_dinozavra);
        textView.setText(captions[i]);


        //Добавление интерфейса слушателя
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(listener != null) {
                    listener.onClick(i);
                }
            }
        });

    }

}