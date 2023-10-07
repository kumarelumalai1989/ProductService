package dev.kumar.productservice.Services;

import dev.kumar.productservice.ThirdPartyClient.ProductServiceClient.FakeStoreClient.FakeStoreProductDTO;
import dev.kumar.productservice.dtos.GenericProductDTO;
import dev.kumar.productservice.exceptions.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public interface ProductService {

    GenericProductDTO createProduct(GenericProductDTO product);

    GenericProductDTO getProductyId(Long id) throws Exception;
    List<GenericProductDTO> getAllProducts();

    GenericProductDTO updateProductById(Long id,GenericProductDTO product);

    GenericProductDTO deteleProduct(Long id);

    List<String> getAllCategories();

    List<GenericProductDTO> getByCategory(String category);
}
