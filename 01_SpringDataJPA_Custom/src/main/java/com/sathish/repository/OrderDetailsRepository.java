package com.sathish.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathish.Entity.OrderDetailsEntity;

public interface OrderDetailsRepository extends JpaRepository<OrderDetailsEntity, Serializable> {

}
