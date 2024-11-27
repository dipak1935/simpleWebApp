package com.telusko.simpleWebApp.service;

import com.telusko.simpleWebApp.model.Product;
import com.telusko.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;


//    List<Product> products= new ArrayList<>(Arrays.asList(
//                                            new Product(101,"Iphone",50000),
//                                            new Product(102,"Samsung Phone",12000),
//                                            new Product(103,"Tablet",20000)));


    public List<Product> getProducts(){


//        return products;


        return repo.findAll();
    }

    public Product getProductById(int prodId) {

//        return products.stream()
//                .filter(p->p.getProdId()==prodId)
//                .findFirst().get();


//        return repo.getReferenceById(prodId);

        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product product){

//        products.add(product);

        repo.save(product);
    }

    public void updateProduct(Product product) {

//        int index=0;
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdId()==product.getProdId()){
//                index=i;
//                break;
//            }
//        }
//
//        products.set(index,product);


        repo.save(product);

    }

    public void deleteProduct(int productId) {

//        int index=0;
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdId()==productId){
//                index=i;
//                break;
//            }
//        }
//
//        products.remove(index);


        repo.deleteById(productId);

    }
}
