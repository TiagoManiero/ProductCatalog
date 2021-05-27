package com.tiagomaniero.productcatalog.repository;

import com.tiagomaniero.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRespository extends CrudRepository<Product, Integer> {
}
