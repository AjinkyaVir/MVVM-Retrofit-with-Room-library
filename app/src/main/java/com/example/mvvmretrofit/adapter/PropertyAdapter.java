package com.example.mvvmretrofit.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mvvmretrofit.R;
import com.example.mvvmretrofit.model.PropertyResponse;
import com.example.mvvmretrofit.model.ResultItem;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ajinkya on 12/28/2020.
 */
public class PropertyAdapter extends RecyclerView.Adapter<PropertyAdapter.PropertyViewHolder> {

    private Context context;
    //private List<PropertyResponse> propertyResponseLiveData;
    private ArrayList<ResultItem> propertyResponseLiveData;

    /*public PropertyAdapter(Context context, List<PropertyResponse> propertyResponseLiveData) {
        this.context = context;
        this.propertyResponseLiveData = propertyResponseLiveData;
    }*/

    public PropertyAdapter(Context context, ArrayList<ResultItem> propertyResponseLiveData) {
        this.context = context;
        this.propertyResponseLiveData = propertyResponseLiveData;
    }

    @NonNull
    @Override
    public PropertyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PropertyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.property_listing,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PropertyViewHolder holder, int position) {
        ResultItem propertyResponse = propertyResponseLiveData.get(position);
        holder.txtName.setText(propertyResponse.getPropertyName());
        holder.txtBuilderName.setText(propertyResponse.getPropertyDeveloper().getPropertyDeveloperName());
        holder.txtAddress.setText(propertyResponse.getPropertyAddress()+", "+
                propertyResponse.getPropertyCity());
        holder.txtBhk.setText(propertyResponse.getBhkType());
//        Picasso.with(context).load((Uri) propertyResponse.getPropertiesImages()).into(holder.imgProperty);
    }

    public void getAllProperties(ArrayList<ResultItem> propertyResponse){
        this.propertyResponseLiveData = propertyResponse;
    }

    @Override
    public int getItemCount() {
        return propertyResponseLiveData.size();
    }

    public static class PropertyViewHolder extends RecyclerView.ViewHolder {

        TextView txtBhk,txtPrice,txtName,txtBuilderName,txtAddress;
        ImageView imgProperty;


        public PropertyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtBhk = itemView.findViewById(R.id.txtBhk);
            txtPrice = itemView.findViewById(R.id.txtPricing);
            txtName = itemView.findViewById(R.id.txtName);
            txtBuilderName = itemView.findViewById(R.id.txtBuilderName);
            txtAddress = itemView.findViewById(R.id.txtAddress);
            imgProperty = itemView.findViewById(R.id.imgProperty);

        }
    }
}
