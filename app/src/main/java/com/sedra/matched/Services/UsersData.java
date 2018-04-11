package com.sedra.matched.Services;

import com.sedra.matched.Models.Users;

import java.util.ArrayList;

public class UsersData {

    private static final UsersData userInstance = new UsersData();

    public static UsersData getUserInstance() {
        return userInstance;
    }

    private UsersData() {
    }

    //manual test data
    public ArrayList<Users> userData (){

        ArrayList<Users> list = new ArrayList<>();
        list.add(new Users("George"));
        list.add(new Users("Andrei"));
        list.add(new Users("Dorel"));
        list.add(new Users("Alexandru"));

        return list;
    }
}
