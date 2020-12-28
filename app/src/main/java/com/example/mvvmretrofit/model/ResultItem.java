package com.example.mvvmretrofit.model;

import androidx.room.TypeConverters;

import java.util.List;

import com.example.mvvmretrofit.utils.CustomTypeConverter;
import com.google.gson.annotations.SerializedName;

public class ResultItem{


	@SerializedName("propertyTypes")
	@TypeConverters(CustomTypeConverter.class)
	private PropertyTypes propertyTypes;

	@SerializedName("amenities")
	@TypeConverters(CustomTypeConverter.class)
	private List<String> amenities;

	@SerializedName("own_parking")
	private boolean ownParking;

	@SerializedName("propertyLong")
	@TypeConverters(CustomTypeConverter.class)
	private Object propertyLong;

	@SerializedName("propertyCarpetArea")
	private String propertyCarpetArea;

	@SerializedName("propertiesImages")
	@TypeConverters(CustomTypeConverter.class)
	private List<String> propertiesImages;

	@SerializedName("balconies")
	@TypeConverters(CustomTypeConverter.class)
	private List<String> balconies;

	@SerializedName("videos")
	@TypeConverters(CustomTypeConverter.class)
	private List<Object> videos;

	@SerializedName("propertyTotalArea")
	private String propertyTotalArea;

	@SerializedName("propertyDeveloper")
	@TypeConverters(CustomTypeConverter.class)
	private PropertyDeveloper propertyDeveloper;

	@SerializedName("deletedBy")
	@TypeConverters(CustomTypeConverter.class)
	private Object deletedBy;

	@SerializedName("presentation")
	private String presentation;

	@SerializedName("propertyCity")
	private String propertyCity;

	@SerializedName("propertyStatus")
	@TypeConverters(CustomTypeConverter.class)
	private Object propertyStatus;

	@SerializedName("createdAt")
	@TypeConverters(CustomTypeConverter.class)
	private String createdAt;

	@SerializedName("bhkType")
	@TypeConverters(CustomTypeConverter.class)
	private String bhkType;

	@SerializedName("propertyId")
	@TypeConverters(CustomTypeConverter.class)
	private int propertyId;

	@SerializedName("others")
	@TypeConverters(CustomTypeConverter.class)
	private List<String> others;

	@SerializedName("updatedAt")
	@TypeConverters(CustomTypeConverter.class)
	private Object updatedAt;

	@SerializedName("propertyLat")
	@TypeConverters(CustomTypeConverter.class)
	private Object propertyLat;

	@SerializedName("brochure")
	@TypeConverters(CustomTypeConverter.class)
	private String brochure;

	@SerializedName("propertyAddress")
	@TypeConverters(CustomTypeConverter.class)
	private String propertyAddress;

	@SerializedName("propertyPincode")
	@TypeConverters(CustomTypeConverter.class)
	private int propertyPincode;

	@SerializedName("propertyState")
	@TypeConverters(CustomTypeConverter.class)
	private String propertyState;

	@SerializedName("propertyArea")
	@TypeConverters(CustomTypeConverter.class)
	private String propertyArea;

	@SerializedName("deletedAt")
	@TypeConverters(CustomTypeConverter.class)
	private Object deletedAt;

	@SerializedName("propertyName")
	@TypeConverters(CustomTypeConverter.class)
	private String propertyName;

	@SerializedName("propertyCountry")
	@TypeConverters(CustomTypeConverter.class)
	private String propertyCountry;


	public void setPropertyTypes(PropertyTypes propertyTypes){
		this.propertyTypes = propertyTypes;
	}

	public PropertyTypes getPropertyTypes(){
		return propertyTypes;
	}

	public void setAmenities(List<String> amenities){
		this.amenities = amenities;
	}

	public List<String> getAmenities(){
		return amenities;
	}

	public void setOwnParking(boolean ownParking){
		this.ownParking = ownParking;
	}

	public boolean isOwnParking(){
		return ownParking;
	}

	public void setPropertyLong(Object propertyLong){
		this.propertyLong = propertyLong;
	}

	public Object getPropertyLong(){
		return propertyLong;
	}

	public void setPropertyCarpetArea(String propertyCarpetArea){
		this.propertyCarpetArea = propertyCarpetArea;
	}

	public String getPropertyCarpetArea(){
		return propertyCarpetArea;
	}

	public void setPropertiesImages(List<String> propertiesImages){
		this.propertiesImages = propertiesImages;
	}

	public List<String> getPropertiesImages(){
		return propertiesImages;
	}

	public void setBalconies(List<String> balconies){
		this.balconies = balconies;
	}

	public List<String> getBalconies(){
		return balconies;
	}

	public void setVideos(List<Object> videos){
		this.videos = videos;
	}

	public List<Object> getVideos(){
		return videos;
	}

	public void setPropertyTotalArea(String propertyTotalArea){
		this.propertyTotalArea = propertyTotalArea;
	}

	public String getPropertyTotalArea(){
		return propertyTotalArea;
	}

	public void setPropertyDeveloper(PropertyDeveloper propertyDeveloper){
		this.propertyDeveloper = propertyDeveloper;
	}

	public PropertyDeveloper getPropertyDeveloper(){
		return propertyDeveloper;
	}

	public void setDeletedBy(Object deletedBy){
		this.deletedBy = deletedBy;
	}

	public Object getDeletedBy(){
		return deletedBy;
	}

	public void setPresentation(String presentation){
		this.presentation = presentation;
	}

	public String getPresentation(){
		return presentation;
	}

	public void setPropertyCity(String propertyCity){
		this.propertyCity = propertyCity;
	}

	public String getPropertyCity(){
		return propertyCity;
	}

	public void setPropertyStatus(Object propertyStatus){
		this.propertyStatus = propertyStatus;
	}

	public Object getPropertyStatus(){
		return propertyStatus;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setBhkType(String bhkType){
		this.bhkType = bhkType;
	}

	public String getBhkType(){
		return bhkType;
	}

	public void setPropertyId(int propertyId){
		this.propertyId = propertyId;
	}

	public int getPropertyId(){
		return propertyId;
	}

	public void setOthers(List<String> others){
		this.others = others;
	}

	public List<String> getOthers(){
		return others;
	}

	public void setUpdatedAt(Object updatedAt){
		this.updatedAt = updatedAt;
	}

	public Object getUpdatedAt(){
		return updatedAt;
	}

	public void setPropertyLat(Object propertyLat){
		this.propertyLat = propertyLat;
	}

	public Object getPropertyLat(){
		return propertyLat;
	}

	public void setBrochure(String brochure){
		this.brochure = brochure;
	}

	public String getBrochure(){
		return brochure;
	}

	public void setPropertyAddress(String propertyAddress){
		this.propertyAddress = propertyAddress;
	}

	public String getPropertyAddress(){
		return propertyAddress;
	}

	public void setPropertyPincode(int propertyPincode){
		this.propertyPincode = propertyPincode;
	}

	public int getPropertyPincode(){
		return propertyPincode;
	}

	public void setPropertyState(String propertyState){
		this.propertyState = propertyState;
	}

	public String getPropertyState(){
		return propertyState;
	}

	public void setPropertyArea(String propertyArea){
		this.propertyArea = propertyArea;
	}

	public String getPropertyArea(){
		return propertyArea;
	}

	public void setDeletedAt(Object deletedAt){
		this.deletedAt = deletedAt;
	}

	public Object getDeletedAt(){
		return deletedAt;
	}

	public void setPropertyName(String propertyName){
		this.propertyName = propertyName;
	}

	public String getPropertyName(){
		return propertyName;
	}

	public void setPropertyCountry(String propertyCountry){
		this.propertyCountry = propertyCountry;
	}

	public String getPropertyCountry(){
		return propertyCountry;
	}

	@Override
 	public String toString(){
		return 
			"ResultItem{" + 
			"propertyTypes = '" + propertyTypes + '\'' + 
			",amenities = '" + amenities + '\'' + 
			",own_parking = '" + ownParking + '\'' + 
			",propertyLong = '" + propertyLong + '\'' + 
			",propertyCarpetArea = '" + propertyCarpetArea + '\'' + 
			",propertiesImages = '" + propertiesImages + '\'' + 
			",balconies = '" + balconies + '\'' + 
			",videos = '" + videos + '\'' + 
			",propertyTotalArea = '" + propertyTotalArea + '\'' + 
			",propertyDeveloper = '" + propertyDeveloper + '\'' + 
			",deletedBy = '" + deletedBy + '\'' + 
			",presentation = '" + presentation + '\'' + 
			",propertyCity = '" + propertyCity + '\'' + 
			",propertyStatus = '" + propertyStatus + '\'' + 
			",createdAt = '" + createdAt + '\'' + 
			",bhkType = '" + bhkType + '\'' + 
			",propertyId = '" + propertyId + '\'' + 
			",others = '" + others + '\'' + 
			",updatedAt = '" + updatedAt + '\'' + 
			",propertyLat = '" + propertyLat + '\'' + 
			",brochure = '" + brochure + '\'' + 
			",propertyAddress = '" + propertyAddress + '\'' + 
			",propertyPincode = '" + propertyPincode + '\'' + 
			",propertyState = '" + propertyState + '\'' + 
			",propertyArea = '" + propertyArea + '\'' + 
			",deletedAt = '" + deletedAt + '\'' + 
			",propertyName = '" + propertyName + '\'' + 
			",propertyCountry = '" + propertyCountry + '\'' + 
			"}";
		}
}