package org.example.dto;

import java.util.Date;
import java.util.Objects;

public class OrderDTO {

    private Integer id;
    private Integer clientId;
    private Date orderDate;
    private Double totalPrice;
    private String status;
    private String deliveryStatus;
    private String paymentStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDTO orderDTO = (OrderDTO) o;
        return Objects.equals(id, orderDTO.id) && Objects.equals(clientId, orderDTO.clientId) && Objects.equals(orderDate, orderDTO.orderDate) && Objects.equals(totalPrice, orderDTO.totalPrice) && Objects.equals(status, orderDTO.status) && Objects.equals(deliveryStatus, orderDTO.deliveryStatus) && Objects.equals(paymentStatus, orderDTO.paymentStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientId, orderDate, totalPrice, status, deliveryStatus, paymentStatus);
    }
}
