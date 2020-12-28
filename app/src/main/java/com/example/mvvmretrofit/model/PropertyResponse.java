package com.example.mvvmretrofit.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.util.List;

import com.example.mvvmretrofit.utils.CustomTypeConverter;
import com.google.gson.annotations.SerializedName;
@Entity(tableName = "property_table")
public class PropertyResponse extends ResultItem {

	@PrimaryKey(autoGenerate = true)
	private int property_result_id;

	@SerializedName("msg")
	@ColumnInfo(name = "msg")
	private String msg;

	@SerializedName("result")
	@ColumnInfo(name = "result")
	@TypeConverters(CustomTypeConverter.class)
	private List<ResultItem> result;

	@SerializedName("status")
	@ColumnInfo(name = "status")
	private String status;

	public PropertyResponse(int property_result_id, String msg, List<ResultItem> result, String status) {
		this.property_result_id = property_result_id;
		this.msg = msg;
		this.result = result;
		this.status = status;
	}

	public int getProperty_result_id() {
		return property_result_id;
	}

	public void setProperty_result_id(int property_result_id) {
		this.property_result_id = property_result_id;
	}

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getMsg(){
		return msg;
	}

	public void setResult(List<ResultItem> result){
		this.result = result;
	}

	public List<ResultItem> getResult(){
		return result;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
	public String toString() {
		return "PropertyResponse{" +
				"property_result_id=" + property_result_id +
				", msg='" + msg + '\'' +
				", result=" + result +
				", status='" + status + '\'' +
				'}';
	}
}