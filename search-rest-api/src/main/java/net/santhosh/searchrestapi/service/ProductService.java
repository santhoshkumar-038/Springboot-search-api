package net.santhosh.searchrestapi.service;

import net.santhosh.searchrestapi.entity.Product;
import java.util.List;

public interface ProductService {

    List<Product> searchProduct(String query);

    Product createProduct(Product product);
}
