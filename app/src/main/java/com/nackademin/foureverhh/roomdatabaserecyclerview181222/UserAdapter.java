package com.nackademin.foureverhh.roomdatabaserecyclerview181222;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;


class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
