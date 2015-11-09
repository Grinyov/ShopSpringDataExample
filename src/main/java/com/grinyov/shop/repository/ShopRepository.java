package com.grinyov.shop.repository;

import com.grinyov.shop.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by green on 10.11.2015.
 *
 * Репозиторий содеожащий все CRUD операции
 *
 * The JpaRepository interface contains the basic operations which can be performed with any entity (CRUD operations).
 * More information http://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html
 */
public interface ShopRepository extends JpaRepository<Shop, Integer> {

}
