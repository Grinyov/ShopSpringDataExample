package com.grinyov.shop.service;

import com.grinyov.shop.exception.ShopNotFound;
import com.grinyov.shop.model.Shop;

import java.util.List;

/**
 * Created by green on 10.11.2015.
 */
public interface ShopService {

    public Shop create(Shop shop);
    public Shop delete(int id) throws ShopNotFound;
    public List<Shop> findAll();
    public Shop update(Shop shop) throws ShopNotFound;
    public Shop findById(int id);

}
