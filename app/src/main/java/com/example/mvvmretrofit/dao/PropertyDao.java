package com.example.mvvmretrofit.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.mvvmretrofit.model.PropertyResponse;

import java.util.List;

/**
 * Created by Ajinkya on 12/28/2020.
 */
@Dao
public interface PropertyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(PropertyResponse propertyResponse);

    @Query("SELECT * FROM property_table")
    LiveData<PropertyResponse> getAllProperties();

    @Query("DELETE FROM property_table")
    void deleteAllProperty();

}
