package com.example.barAndRestaurantMgnt.service.implementation;

import com.example.barAndRestaurantMgnt.model.Bar;
import com.example.barAndRestaurantMgnt.repository.BarRepo;
import com.example.barAndRestaurantMgnt.service.BarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class BarServiceImpl implements BarService {
    @Autowired
    BarRepo barRepo;

    @Override
    public Bar registerProduct(Bar bar) {
        return barRepo.save(bar);
    }

    @Override
    public Bar updateProduct(Bar bar) {
        Bar theBar= findProductByProductId(bar);
        if (theBar != null){
            theBar.setProductName(bar.getProductName());
            theBar.setProductId(bar.getProductId());
            theBar.setStock(bar.getStock());
            theBar.setPrice(bar.getPrice());
            theBar.setSales(bar.getSales());
            theBar.setBalance(bar.getBalance());
            theBar.setAmount(bar.getAmount());

            return barRepo.save(theBar);
        }else {

            return registerProduct(bar);

        }
    }

    @Override
    public void deleteProduct(Bar bar) {
        barRepo.delete(bar);

    }

    @Override
    public List<Bar> productList() {
        return barRepo.findAll();
    }

    @Override
    public Bar findProductByProductId(Bar bar) {
        return barRepo.findById(bar.getId()).get();
    }
}
