package com.yummy.bakery.service;

import com.yummy.bakery.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {

    Product getById(long id);

    //List<Product> findAll();

    Page<Product> findAllByPage(Pageable pageable);

}