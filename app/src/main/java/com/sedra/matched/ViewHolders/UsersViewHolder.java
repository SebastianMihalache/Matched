package com.sedra.matched.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.sedra.matched.Models.Users;
import com.sedra.matched.R;

public class UsersViewHolder extends RecyclerView.ViewHolder {

    private TextView nume;

    public UsersViewHolder(View itemView) {
        super(itemView);

        this.nume = (TextView)itemView.findViewById(R.id.numeUser);

    }

    public void updateUserUI (Users users){
        nume.setText(users.getUserName());
    }
}
