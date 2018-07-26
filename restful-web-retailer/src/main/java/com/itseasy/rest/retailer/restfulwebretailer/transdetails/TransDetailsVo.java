package com.itseasy.rest.retailer.restfulwebretailer.transdetails;

import java.util.Date;

public class TransDetailsVo 
{
	public TransDetailsVo()
	{
		
	}
	@Override
	public String toString() {
		return "TransDetailsVo [mobileNo=" + mobileNo + ", cardNo=" + cardNo + ", amount=" + amount + ", date=" + date
				+ ", transId=" + transId + "]";
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	String mobileNo;
	String cardNo;
	int amount;
	Date date;
	String transId;
	public String getTransId() {
		return transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}
	
}
