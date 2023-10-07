package dev.kumar.productservice.Services;

import dev.kumar.productservice.ThirdPartyClient.ProductServiceClient.FakeStoreClient.FakeStoreProductDTO;
import dev.kumar.productservice.dtos.GenericProductDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SelfProductServiceImpl")
public class SelfProductServiceImpl implements ProductService{

    @Override
    public GenericProductDTO createProduct(GenericProductDTO product) {
        return null;
    }

    @Override
    public GenericProductDTO getProductyId(Long id) {
        return null;
    }

    @Override
    public List<GenericProductDTO> getAllProducts() {
        return null;
    }

    @Override
    public GenericProductDTO updateProductById(Long id,GenericProductDTO product) {
        return null;
    }

    @Override
    public GenericProductDTO deteleProduct(Long id) {
        return null;
    }

    @Override
    public List<String> getAllCategories() {
        return null;
    }

    @Override
    public List<GenericProductDTO> getByCategory(String category) {
        return null;
    }
}
