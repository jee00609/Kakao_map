package com.example.kakao_map.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface WifiDao {
    @Query("SELECT * FROM Wifi")
    List<Wifi> getAll();

    @Insert
    void insert (Wifi wifi);

    @Update
    void update (Wifi wifi);

    @Delete
    void delete (Wifi wifi);
}
