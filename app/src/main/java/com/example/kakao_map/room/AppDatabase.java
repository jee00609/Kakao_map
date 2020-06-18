package com.example.kakao_map.room;


import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Wifi.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract WifiDao WifiDao();
}
