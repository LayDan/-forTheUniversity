package com.example.demo.repository;

import com.example.demo.modal.dao.baseProduct.BaseProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseProductRepositoty extends JpaRepository<BaseProduct, Long> {
}
