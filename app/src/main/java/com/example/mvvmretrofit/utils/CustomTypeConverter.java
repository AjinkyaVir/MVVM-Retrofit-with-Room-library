package com.example.mvvmretrofit.utils;

import androidx.room.TypeConverter;

import com.example.mvvmretrofit.model.PropertyDeveloper;
import com.example.mvvmretrofit.model.PropertyTypes;
import com.example.mvvmretrofit.model.ResultItem;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by Ajinkya on 12/28/2020.
 */
public class CustomTypeConverter {

    private static Gson gson = new Gson();

  /*  @TypeConverter
    public static List<ResultItem> stringToSomeObjectResult(String data) {

        Type listType = new TypeToken<List<ResultItem>>() {}.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String someObjectListToStringResult(List<ResultItem> someObjects) {
        return gson.toJson(someObjects);
    }*/

    @TypeConverter
    public static PropertyTypes stringToSomeObjectList(String data) {
        Type listType = new TypeToken<PropertyTypes>() {}.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String someObjectListToString(PropertyTypes someObjects) {
        return gson.toJson(someObjects);
    }

    @TypeConverter
    public static PropertyDeveloper stringToSomeObjectPropertyDeveloper(String data) {
        Type listType = new TypeToken<PropertyDeveloper>() {}.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String someObjectListToPropertyDeveloper(PropertyDeveloper someObjects) {
        return gson.toJson(someObjects);
    }

    @TypeConverter
    public static List<String> stringToSomeObjectAmenities(String data) {

        Type listType = new TypeToken<List<String>>() {}.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String someObjectListToStringAmenities(List<String> someObjects) {
        return gson.toJson(someObjects);
    }

    @TypeConverter
    public static List<ResultItem> stringToSomeObjectResultItem(String data) {

        Type listType = new TypeToken<List<ResultItem>>() {}.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String someObjectListToStringResultItem(List<ResultItem> someObjects) {
        return gson.toJson(someObjects);
    }


    @TypeConverter
    public static Object stringToSomeObjectPropetyLong(String data) {
        Type listType = new TypeToken<Object>() {}.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String someObjectListToStringPropertyLong(Object someObjects) {
        return gson.toJson(someObjects);
    }

    @TypeConverter
    public static List<Object> stringToSomeObjectVideo(String data) {

        Type listType = new TypeToken<List<Object>>() {}.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String someObjectListToStringVideo(List<Object> someObjects) {
        return gson.toJson(someObjects);
    }



}
