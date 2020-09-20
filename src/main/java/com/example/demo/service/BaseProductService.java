package com.example.demo.service;

import com.example.demo.modal.dao.baseProduct.BaseProduct;
import com.example.demo.repository.BaseProductRepositoty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BaseProductService extends AbstractService<BaseProduct, BaseProductRepositoty> {

    public BaseProduct save(BaseProduct baseProduct) {
        BaseProduct newBaseProduct = null;
        log.info("start save product");
        try {
            newBaseProduct = super.save(baseProduct);
        } catch (Exception e) {
            log.error("Строка 17:" + this.getClass().getSimpleName() + "\n" + e.getMessage());
        }
        log.info("end save product");
        return newBaseProduct;
    }
}
