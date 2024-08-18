package com.infy.ekart.dto;

import java.time.LocalDateTime;

public class OrderDTO {
	
	private Integer orderId;
	private String customerEmailId;
	private Integer orderNumber;
	private LocalDateTime dateOfOrder;
	private ProductDTO product;
	private Integer quantity;
	private Double totalPrice;
	private Integer addressId;
	private String errorMessage;
	private String orderStatus;
	private PaymentThrough paymentThrough;
	private LocalDateTime dataOfDelivery;
	
	@Override
	public String toString() {
		return "OrderDTO [orderId=" + orderId + ", customerEmailId=" + customerEmailId + ", orderNumber=" + orderNumber
				+ ", dateOfOrder=" + dateOfOrder + ", product=" + product + ", quantity=" + quantity + ", totalPrice="
				+ totalPrice + ", addressId=" + addressId + ", orderStatus=" + orderStatus + ", paymentThrough="
				+ paymentThrough + ", dataOfDelivery=" + dataOfDelivery + "]";
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getCustomerEmailId() {
		return customerEmailId;
	}
	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}
	public Integer getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}
	public LocalDateTime getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(LocalDateTime dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	
	public ProductDTO getProduct() {
		return product;
	}
	public void setProduct(ProductDTO product) {
		this.product = product;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public PaymentThrough getPaymentThrough() {
		return paymentThrough;
	}
	public void setPaymentThrough(PaymentThrough paymentThrough) {
		this.paymentThrough = paymentThrough;
	}
	public LocalDateTime getDataOfDelivery() {
		return dataOfDelivery;
	}
	public void setDataOfDelivery(LocalDateTime dataOfDelivery) {
		this.dataOfDelivery = dataOfDelivery;
	}

}
