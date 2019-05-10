package com.emporium.sssistemas.ssandroid.ssandroidjava.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PedidoEmporiumModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("DataFieldList")
	private List<DataFieldList> DataFieldList = new ArrayList<>();

	@JsonProperty("DataSetCount")
    private Integer DataSetCount;
	
	@JsonProperty("DataSetName")
    private String DataSetName;
	
	public PedidoEmporiumModel() {
		
	}	

	public PedidoEmporiumModel(Integer dataSetCount, String dataSetName) {
		super();
		DataSetCount = dataSetCount;
		DataSetName = dataSetName;
	}
	@JsonProperty("DataFieldList")
	public List<DataFieldList> getDataFieldList() {
		return DataFieldList;
	}
	@JsonProperty("DataFieldList")
	public void setDataFieldList(List<DataFieldList> dataFieldList) {
		DataFieldList = dataFieldList;
	}
	@JsonProperty("DataSetCount")
	public Integer getDataSetCount() {
		return DataSetCount;
	}
	@JsonProperty("DataSetCount")
	public void setDataSetCount(Integer dataSetCount) {
		DataSetCount = dataSetCount;
	}
	@JsonProperty("DataSetName")
	public String getDataSetName() {
		return DataSetName;
	}
	@JsonProperty("DataSetName")
	public void setDataSetName(String dataSetName) {
		DataSetName = dataSetName;
	}
	
	@Override
    public String toString()
    {
        return "PedidoEmporiumModel [DataFieldList = "+DataFieldList+", DataSetCount = "+DataSetCount+", DataSetName = "+DataSetName+"]";
    }	
}
