package com.example.android.hotelview.adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android.hotelview.R;
import com.example.android.hotelview.model.HotelModel;

import java.util.ArrayList;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ViewHolder> {

    private HotelAdapter.ItemClickListener itemClickListener;
    Context context;
    private ArrayList<HotelModel> hotelModel = new ArrayList<>();

    public interface ItemClickListener {
        void onClick(HotelModel HotelModel);
    }

    public void onClick(HotelAdapter.ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }


    @NonNull
    @Override
    public HotelAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HotelAdapter.ViewHolder viewHolder, int i) {
<<<<<<< HEAD
        viewHolder.bindItem(viewHolder.itemView.getContext(), hotelModel.get(i), itemClickListener);
=======
        viewHolder.bindItem(hotelModel.get(i), itemClickListener);
>>>>>>> origin/master


    }

    @Override
    public int getItemCount() {
        return hotelModel.size();
    }

    public void setData(ArrayList<HotelModel> hotelModel){
        this.hotelModel = hotelModel;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
<<<<<<< HEAD
        View view;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            view = itemView;

        }

        public void bindItem(Context ctx, HotelModel hotelModel, ItemClickListener itemClickListener) {

           TextView nama_hotel =view.findViewById(R.id.title);
            TextView alamat_hotel =view.findViewById(R.id.subTitle);
            TextView no_telp =view.findViewById(R.id.newsTitle);
            ImageView hotelsImage =view.findViewById(R.id.hotelsImage);


            nama_hotel.setText(hotelModel.getNama());
            alamat_hotel.setText(hotelModel.getAlamat());
            no_telp.setText(hotelModel.getNo_telp());

            if (hotelModel != null){
                Glide.with(ctx).load(hotelModel.getGambar_url()).into(hotelsImage);
            }
=======
        private final TextView nama_hotel;
        private final TextView alamat_hotel;
        private final TextView no_telp;
        private final ImageView hotelsImage;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nama_hotel =itemView.findViewById(R.id.title);
            alamat_hotel =itemView.findViewById(R.id.subTitle);
            no_telp =itemView.findViewById(R.id.newsTitle);
            hotelsImage =itemView.findViewById(R.id.hotelsImage);
        }

        public void bindItem(HotelModel hotelModel, ItemClickListener itemClickListener) {
            nama_hotel.setText(hotelModel.getNama());
            alamat_hotel.setText(hotelModel.getAlamat());
            no_telp.setText(hotelModel.getNo_telp());
//            Glide.with(context)
//                    .load(hotelModel.getGambar_url())
//                    .centerCrop()
//                    .into(hotelsImage);



>>>>>>> origin/master

            if (itemClickListener != null){
                itemView.setOnClickListener(view -> {
                    itemClickListener.onClick(hotelModel);
                });
            }
        }

    }
}
