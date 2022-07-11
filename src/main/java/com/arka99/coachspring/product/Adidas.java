package com.arka99.coachspring.product;

import org.springframework.stereotype.Component;


public class Adidas implements Product{
    @Override
    public String preferredProdcut() {
        return "This coach prefers Adidas products.";
    }
}
