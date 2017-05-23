package com.yummy.bakery.controller;

import com.yummy.bakery.model.entity.Product;
import com.yummy.bakery.service.ProductService;
import com.yummy.bakery.utilities.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Constants.API_URL + Constants.URL_CATALOG)
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getProductById(@PathVariable("id") long id) {
        Product product = productService.getById(id);

        if (product == null) {
            return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getProducts(Pageable pageable) {
        Page<Product> productPage = productService.findAllByPage(pageable);

        return new ResponseEntity<>(productPage, HttpStatus.OK);
    }

}
