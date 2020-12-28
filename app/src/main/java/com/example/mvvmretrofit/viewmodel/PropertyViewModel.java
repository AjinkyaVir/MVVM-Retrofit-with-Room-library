package com.example.mvvmretrofit.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.mvvmretrofit.model.PropertyResponse;
import com.example.mvvmretrofit.repository.PropertyRepository;

/**
 * Created by Ajinkya on 12/28/2020.
 */
public class PropertyViewModel extends AndroidViewModel {

    private PropertyRepository propertyRepository;
    private LiveData<PropertyResponse> getAllPropertyResult;
   // private LiveData<List<ResultItem>> getAllPropertyResult;

    public PropertyViewModel(@NonNull Application application) {
        super(application);
        propertyRepository = new PropertyRepository(application);
        getAllPropertyResult = propertyRepository.getPropertyResponseLiveData();
    }

    public void insert(PropertyResponse propertyResponse){
        propertyRepository.insert(propertyResponse);
    }

    public LiveData<PropertyResponse> getGetAllPropertyResult(){
        return getAllPropertyResult;
    }

}
