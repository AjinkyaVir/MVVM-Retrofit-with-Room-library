package com.example.mvvmretrofit.database;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.mvvmretrofit.dao.PropertyDao;
import com.example.mvvmretrofit.model.PropertyResponse;

/**
 * Created by Ajinkya on 12/28/2020.
 */
@Database(entities = {PropertyResponse.class}, version = 4)
public abstract class PropertyDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "PROPERTY_DATABASE";

    public abstract PropertyDao propertyDao();

    private static volatile PropertyDatabase INSTANCE;

    public static PropertyDatabase getInstance(Context context){
        if (INSTANCE == null){
            synchronized (PropertyDatabase.class){
                if (INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context,
                            PropertyDatabase.class,DATABASE_NAME)
                            .addCallback(callback)
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    static RoomDatabase.Callback callback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateAsynTask(INSTANCE);
        }
    };

    static class PopulateAsynTask extends AsyncTask<Void,Void,Void> {
        private PropertyDao propertyDao;
        PopulateAsynTask(PropertyDatabase propertyDatabase){
            propertyDao = propertyDatabase.propertyDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            propertyDao.deleteAllProperty();
            return null;
        }


    }

}
