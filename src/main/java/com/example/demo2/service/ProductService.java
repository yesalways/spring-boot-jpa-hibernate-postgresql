package com.example.demo2.service;

import com.example.demo2.model.Product;
import com.example.demo2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository repo;
    public List<Product> listAll(){
        return repo.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }
    public void save(Product product){
        repo.save(product);
    }
    public Product get(long id){
        return repo.findById(id).get();
    }
    public void delete(long id){
        repo.deleteById(id);
    }
}
