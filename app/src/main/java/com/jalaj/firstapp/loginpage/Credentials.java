package com.jalaj.firstapp.loginpage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by jalajmehta on 7/10/16.
 */

public class Credentials implements Parcelable{
    String id;
    String password;
    private int mData;

    public Credentials(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int describeContents() {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(password);

    }

    public static final Parcelable.Creator<Credentials> CREATOR
            = new Parcelable.Creator<Credentials>() {
        public Credentials createFromParcel(Parcel in) {
            return new Credentials(in);
        }

        public Credentials[] newArray(int size) {
            return new Credentials[size];
        }
    };

    public Credentials(Parcel in){
        id = in.readString();
        password = in.readString();
    }
}
