package com.example.mvvmretrofit.repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.example.mvvmretrofit.dao.PropertyDao;
import com.example.mvvmretrofit.database.PropertyDatabase;
import com.example.mvvmretrofit.model.PropertyResponse;

/**
 * Created by Ajinkya on 12/28/2020.
 */
public class PropertyRepository {

    private PropertyDatabase propertyDatabase;

    private LiveData<PropertyResponse> propertyResponseLiveData;

    public PropertyRepository(Application application){
        propertyDatabase = PropertyDatabase.getInstance(application);
        propertyResponseLiveData = propertyDatabase.propertyDao().getAllProperties();
    }

    public void insert(PropertyResponse propertyResponse){
        new InsertAsynTask(propertyDatabase).execute(propertyResponse);
    }

    public LiveData<PropertyResponse> getPropertyResponseLiveData(){
        return propertyResponseLiveData;
    }

    static class InsertAsynTask extends AsyncTask<PropertyResponse,Void,Void>{

        private PropertyDao propertyDao;

        public InsertAsynTask(PropertyDatabase propertyDatabase) {
            propertyDao = propertyDatabase.propertyDao();
        }

        @Override
        protected Void doInBackground(PropertyResponse... propertyResponses) {
            propertyDao.insert(propertyResponses[0]);
            return null;
        }
    }

}
