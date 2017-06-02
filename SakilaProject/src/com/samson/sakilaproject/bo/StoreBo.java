package com.samson.sakilaproject.bo;

public class StoreBo {

	int storeId;
	int ManagerId;
	int AddressId;
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public int getManagerId() {
		return ManagerId;
	}
	public void setManagerId(int managerId) {
		ManagerId = managerId;
	}
	public int getAddressId() {
		return AddressId;
	}
	public void setAddressId(int addressId) {
		AddressId = addressId;
	}
	@Override
	public String toString() {
		return "StoreBo [storeId=" + storeId + ", ManagerId=" + ManagerId + ", AddressId=" + AddressId + "]";
	}
	
}
