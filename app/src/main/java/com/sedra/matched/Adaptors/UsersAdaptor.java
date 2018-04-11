package com.sedra.matched.Adaptors;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sedra.matched.Models.Users;
import com.sedra.matched.R;
import com.sedra.matched.ViewHolders.UsersViewHolder;

import java.util.ArrayList;

public class UsersAdaptor extends RecyclerView.Adapter<UsersViewHolder> {
    private ArrayList<Users> users;

    public UsersAdaptor(ArrayList<Users> users){
        this.users = users;
    }

    @NonNull
    @Override
    public UsersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //set the card layout on the holder
        View usersCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.users_card, parent, false);
        return new UsersViewHolder(usersCard);
    }

    @Override
    public void onBindViewHolder(@NonNull UsersViewHolder holder, int position) {
        final Users user = users.get(position);
        holder.updateUserUI(user);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
