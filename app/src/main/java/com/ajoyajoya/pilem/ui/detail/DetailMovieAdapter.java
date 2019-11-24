package com.ajoyajoya.pilem.ui.detail;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ajoyajoya.pilem.BuildConfig;
import com.ajoyajoya.pilem.R;
import com.ajoyajoya.pilem.data.source.DetailMovieEntity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.glide.transformations.BlurTransformation;

import static com.ajoyajoya.pilem.utils.GlideOptions.bitmapTransform;

public class DetailMovieAdapter extends RecyclerView.Adapter<DetailMovieAdapter.CategoryViewHolder> {

    private final Context context;

    private final ArrayList<DetailMovieEntity> mData3 = new ArrayList<>();

    public DetailMovieAdapter(Context context) {
        this.context = context;
    }

    public void setListMovie(List<DetailMovieEntity> items) {
        mData3.clear();
        mData3.addAll(items);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_pilem, parent, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull final CategoryViewHolder holder, final int position) {

        holder.tvMovieName.setText(mData3.get(holder.getAdapterPosition()).getMovieName());
        holder.tvMovieRate.setText(mData3.get(holder.getAdapterPosition()).getMovieRated());
        holder.tvMovieCat.setText(mData3.get(holder.getAdapterPosition()).getMovieCategory());
        holder.tvMovieDesc.setText(mData3.get(holder.getAdapterPosition()).getMovieDesc());

        Glide.with(context).load(BuildConfig.URL_IMG+mData3.get(holder.getAdapterPosition()).getMoviePoster()).into(holder.imgMoviePoster);
        Glide.with(context).load(BuildConfig.URL_IMG+mData3.get(holder.getAdapterPosition()).getMoviePoster()).into(holder.imgTrailerLink);

        //noinspection deprecation
        Glide.with(context).load(BuildConfig.URL_IMG+mData3.get(holder.getAdapterPosition()).getMoviePoster())
                .apply(bitmapTransform(new BlurTransformation(25, 3)))
                .into(new SimpleTarget<Drawable>() {
                    @Override
                    public void onResourceReady(@NonNull Drawable resource, Transition<? super Drawable> transition) {
                        holder.bgMovieDetail.setBackground(resource);
                    }
                });

        float backgroundRating = Float.parseFloat(mData3.get(holder.getAdapterPosition()).getMovieRated());

        if (backgroundRating >= 8.0) {
            holder.tvMovieRate.setTextColor(Color.parseColor("#3498db"));
        } else if (backgroundRating >= 7.0) {
            holder.tvMovieRate.setTextColor(Color.parseColor("#2ecc71"));
        } else if (backgroundRating >= 6.0) {
            holder.tvMovieRate.setTextColor(Color.parseColor("#f1c40f"));
        } else if (backgroundRating >= 5.0) {
            holder.tvMovieRate.setTextColor(Color.parseColor("#e67e22"));
        } else {
            holder.tvMovieRate.setTextColor(Color.parseColor("#e74c3c"));
        }


        holder.tvMovieCrew2.setText(mData3.get(holder.getAdapterPosition()).getCrew1());
        holder.tvMovieJob1.setText(mData3.get(holder.getAdapterPosition()).getJob1());
        holder.tvMovieCrew1.setText(mData3.get(holder.getAdapterPosition()).getCrew2());
        holder.tvMovieJob2.setText(mData3.get(holder.getAdapterPosition()).getJob2());

    }

    @Override
    public int getItemCount() {
        return mData3.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {

        final TextView tvMovieName;
        final TextView tvMovieRate;
        final TextView tvMovieCat;
        final TextView tvMovieDesc;
        final ImageView imgMoviePoster;
        final ImageView imgTrailerLink;
        final LinearLayout bgMovieDetail;
        final TextView tvMovieCrew1;
        final TextView tvMovieCrew2;
        final TextView tvMovieJob1;
        final TextView tvMovieJob2;

        CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMovieName = itemView.findViewById(R.id.txt_movie_name);
            tvMovieRate = itemView.findViewById(R.id.txt_movie_rate);
            tvMovieCat = itemView.findViewById(R.id.txt_movie_cat);
            tvMovieDesc = itemView.findViewById(R.id.txt_movie_desc);
            imgMoviePoster = itemView.findViewById(R.id.img_poster_movie);
            imgTrailerLink = itemView.findViewById(R.id.img_trailer_link);
            bgMovieDetail = itemView.findViewById(R.id.bg_movie_detail);
            tvMovieCrew1 = itemView.findViewById(R.id.txt_movie_crew_name1);
            tvMovieCrew2 = itemView.findViewById(R.id.txt_movie_crew_name2);
            tvMovieJob1 = itemView.findViewById(R.id.txt_movie_crew_job1);
            tvMovieJob2 = itemView.findViewById(R.id.txt_movie_crew_job2);
        }
    }
}
