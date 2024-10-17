package com.ecommerce.orders.sevice;

import com.ecommerce.orders.dto.ProductDTO;
import reactor.core.publisher.Flux;

public interface ProductService {
    Flux<ProductDTO> getAllProducts();
}
