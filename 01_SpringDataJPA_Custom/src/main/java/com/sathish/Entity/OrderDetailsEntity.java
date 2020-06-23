package com.sathish.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ORDR_DTLS")

public class OrderDetailsEntity {

	@Id
	@Column(name = "ORDER_ID")
	@GenericGenerator(name = "order_id_gen", strategy = "com.ashokit.generators.OrderIdGenerator")
	@GeneratedValue(generator = "order_id_gen")
	private String orderId;
	
	@Column(name = "ORDER_BY")
	private String orderBy;
	
	@Column(name = "ORDER_PLACED_DT")
	private String orderPlacedDate;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getOrderPlacedDate() {
		return orderPlacedDate;
	}

	public void setOrderPlacedDate(String orderPlacedDate) {
		this.orderPlacedDate = orderPlacedDate;
	}
}
