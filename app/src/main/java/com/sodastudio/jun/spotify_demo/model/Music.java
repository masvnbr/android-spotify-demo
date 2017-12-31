package com.sodastudio.jun.spotify_demo.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

import java.net.URL;

/**
 * Created by jun on 12/29/17.
 */

public class Music implements Parcelable
{

    private String uri;
    private String title;
    private String album;
    private String album_image;
    private long duration;
    private String artist;

    public Music(String u, String t, String a, String a_img, long dura, String art){
        uri = u;
        title = t;
        album = a;
        album_image = a_img;
        duration = dura;
        artist = art;
    }

    protected Music(Parcel in) {
        uri = in.readString();
        title = in.readString();
        album = in.readString();
        album_image = in.readString();
        duration = in.readLong();
        artist = in.readString();
    }

    public static final Creator<Music> CREATOR = new Creator<Music>() {
        @Override
        public Music createFromParcel(Parcel in) {
            return new Music(in);
        }

        @Override
        public Music[] newArray(int size) {
            return new Music[size];
        }
    };

    public String getUri() {
        return uri;
    }

    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }

    public String getAlbum_image() {
        return album_image;
    }

    public long getDuration() {
        return duration;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(uri);
        parcel.writeString(title);
        parcel.writeString(album);
        parcel.writeString(album_image);
        parcel.writeLong(duration);
        parcel.writeString(artist);
    }
}
