package org.example.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class Delivery {

    private Long Id;
    private Order order;
    private Long productId;
    private Integer quantity;
    private BigDecimal totalPrice;
    private Date deliveryDate;
    private String deliveryStatus;
    private String deliveryAddress;
    private Long clientId;
    private String clientName;
    private String clientAddress;
    private String deliveryMethod;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delivery delivery = (Delivery) o;
        return Objects.equals(Id, delivery.Id) && Objects.equals(order, delivery.order) && Objects.equals(productId, delivery.productId) && Objects.equals(quantity, delivery.quantity) && Objects.equals(totalPrice, delivery.totalPrice) && Objects.equals(deliveryDate, delivery.deliveryDate) && Objects.equals(deliveryStatus, delivery.deliveryStatus) && Objects.equals(deliveryAddress, delivery.deliveryAddress) && Objects.equals(clientId, delivery.clientId) && Objects.equals(clientName, delivery.clientName) && Objects.equals(clientAddress, delivery.clientAddress) && Objects.equals(deliveryMethod, delivery.deliveryMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, order, productId, quantity, totalPrice, deliveryDate, deliveryStatus, deliveryAddress, clientId, clientName, clientAddress, deliveryMethod);
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "Id=" + Id +
                ", order=" + order +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                ", deliveryDate=" + deliveryDate +
                ", deliveryStatus='" + deliveryStatus + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", clientAddress='" + clientAddress + '\'' +
                ", deliveryMethod='" + deliveryMethod + '\'' +
                '}';
    }

    public Integer getOrderId() {
        return Math.toIntExact((order != null) ? order.getId() : null);
    }

    public void setOrderId(Integer orderId) {

    }
}