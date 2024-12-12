package com.example.ShoppingCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ShoppingCart.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}