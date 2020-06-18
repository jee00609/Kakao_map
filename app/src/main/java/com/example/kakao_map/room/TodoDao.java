package com.example.kakao_map.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface TodoDao {
    @Query("SELECT * FROM Todo")
    List<Todo> getAll();

    @Insert
    void insert (Todo Todo);

    @Update
    void update (Todo Todo);

    @Delete
    void delete (Todo Todo);
}
