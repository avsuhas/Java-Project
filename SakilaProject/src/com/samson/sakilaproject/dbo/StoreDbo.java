package com.samson.sakilaproject.dbo;

public class StoreDbo {
	
	int storeId;
	int managerId;
	int addressId;
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	@Override
	public String toString() {
		return "StoreDbo [storeId=" + storeId + ", managerId=" + managerId + ", addressId=" + addressId + "]";
	}

}
