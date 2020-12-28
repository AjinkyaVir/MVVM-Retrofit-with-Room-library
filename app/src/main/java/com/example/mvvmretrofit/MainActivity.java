package com.example.mvvmretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.mvvmretrofit.adapter.PropertyAdapter;
import com.example.mvvmretrofit.model.PropertyResponse;
import com.example.mvvmretrofit.model.ResultItem;
import com.example.mvvmretrofit.network.ApiService;
import com.example.mvvmretrofit.network.RetrofitClientInstance;
import com.example.mvvmretrofit.repository.PropertyRepository;
import com.example.mvvmretrofit.viewmodel.PropertyViewModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private PropertyViewModel propertyViewModel;
    private RecyclerView recyclerView;
    private PropertyAdapter propertyAdapter;
    private ArrayList<ResultItem> propertyResponselist;
    private PropertyRepository propertyRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        propertyResponselist = new ArrayList<>();
        propertyRepository = new PropertyRepository(getApplication());
        propertyAdapter = new PropertyAdapter(this, propertyResponselist);


        propertyViewModel = new ViewModelProvider(this).get(PropertyViewModel.class);
        propertyViewModel.getGetAllPropertyResult().observe(this, new Observer<PropertyResponse>() {
            @Override
            public void onChanged(PropertyResponse propertyResponses) {
                ArrayList<ResultItem> mypr = (ArrayList<ResultItem>) propertyResponses.getResult();

                propertyAdapter.getAllProperties(mypr);
                recyclerView.setAdapter(propertyAdapter);
                Log.d("main","response" + mypr);
                Log.d("main","response->> " + propertyResponses);

            }
        });

        /*propertyAdapter.getAllProperties(propertyResponselist);
        recyclerView.setAdapter(propertyAdapter);
        Log.d("main","onChange =>> " + propertyResponse);*/

        networkRequest();

    }

    private void networkRequest() {

        ApiService service = RetrofitClientInstance.getRetrofitInstance(MainActivity.this).create(ApiService.class);
        Call<PropertyResponse> call = service.getAllProperties();
        Log.i("@propertyList","hit URL ==== >>> " + call.request().url());

        call.enqueue(new Callback<PropertyResponse>() {
            @Override
            public void onResponse(Call<PropertyResponse> call, Response<PropertyResponse> response) {
                Log.i("@propertyList","success response==========>"+response.code());
                if (response.isSuccessful()){

                    propertyRepository.insert((response.body()));

                }
            }

            @Override
            public void onFailure(Call<PropertyResponse> call, Throwable t) {
                Log.i("@propertyList","error response==========>"+t.getMessage());

            }
        });

    }

}
