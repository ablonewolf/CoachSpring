package com.arka99.coachspring.product;

import org.springframework.stereotype.Component;


@Component("adidas")
public class Adidas implements Product{
    @Override
    public String preferredProdcut() {
        return "Prefers Adidas running kit for best use.";
    }
}
