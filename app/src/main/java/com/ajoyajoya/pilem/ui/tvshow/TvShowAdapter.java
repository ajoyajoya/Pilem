package com.ajoyajoya.pilem.ui.tvshow;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ajoyajoya.pilem.BuildConfig;
import com.ajoyajoya.pilem.R;
import com.ajoyajoya.pilem.data.TvshowEntity;
import com.ajoyajoya.pilem.ui.detail.DetailMovie;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class TvShowAdapter extends RecyclerView.Adapter<TvShowAdapter.GridViewHolder> {

    private final Context context;

    private List<TvshowEntity> listTvShow;

    public TvShowAdapter(Context context) {
        this.context = context;
    }

    private List<TvshowEntity> getListTvShow() {
        return listTvShow;
    }

    public void setListTvShow(List<TvshowEntity> listTvShow) {
        this.listTvShow = listTvShow;
    }


    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_tvshow, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder gridViewHolder, final int position) {
        gridViewHolder.txtMovieName.setText(getListTvShow().get(gridViewHolder.getAdapterPosition()).getTvName());
        gridViewHolder.txtMovieDescription.setText(getListTvShow().get(gridViewHolder.getAdapterPosition()).getTvDesc());
        gridViewHolder.txtMovieCategory.setText(getListTvShow().get(gridViewHolder.getAdapterPosition()).getTvCategory());
        gridViewHolder.txtMovieRating.setText(getListTvShow().get(gridViewHolder.getAdapterPosition()).getTvRated());

        Glide.with(context)
                .load(BuildConfig.URL_IMG+getListTvShow().get(gridViewHolder.getAdapterPosition()).getTvPoster())
                .apply(new RequestOptions())
                .into(gridViewHolder.imgMoviePoster);


        float backgroundRating = Float.parseFloat(getListTvShow().get(gridViewHolder.getAdapterPosition()).getTvRated());

        if (backgroundRating>=8.0){
            gridViewHolder.txtMovieRating.setBackgroundColor(Color.parseColor("#3498db"));
        } else if (backgroundRating>=7.0){
            gridViewHolder.txtMovieRating.setBackgroundColor(Color.parseColor("#2ecc71"));
        } else if (backgroundRating>=6.0){
            gridViewHolder.txtMovieRating.setBackgroundColor(Color.parseColor("#f1c40f"));
        } else if (backgroundRating>=5.0){
            gridViewHolder.txtMovieRating.setBackgroundColor(Color.parseColor("#e67e22"));
        } else {
            gridViewHolder.txtMovieRating.setBackgroundColor(Color.parseColor("#e74c3c"));
        }

        gridViewHolder.itemView.setOnClickListener(v -> {
            //Toast.makeText(context, "Kamu Memilih "+  getListTvShow().get(position).getTvName(), Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(context, DetailMovie.class);
            intent.putExtra(DetailMovie.EXTRA_MOVIE, "t"+getListTvShow().get(gridViewHolder.getAdapterPosition()).getTvId());
            context.startActivity(intent);

        });
    }

    @Override
    public int getItemCount() {
        return getListTvShow().size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {

        final TextView txtMovieName;
        final TextView txtMovieRating;
        final TextView txtMovieDescription;
        final TextView txtMovieCategory;
        final ImageView imgMoviePoster;

        GridViewHolder(@NonNull View itemView) {
            super(itemView);
            txtMovieName = itemView.findViewById(R.id.tv_item_title);
            txtMovieRating = itemView.findViewById(R.id.txt_tv_rate);
            txtMovieCategory = itemView.findViewById(R.id.txt_tv_cat);
            txtMovieDescription = itemView.findViewById(R.id.txt_tv_desc);
            imgMoviePoster = itemView.findViewById(R.id.img_item_thumbphoto);
        }
    }
}