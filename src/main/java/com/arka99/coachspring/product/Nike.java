package com.arka99.coachspring.product;

import org.springframework.stereotype.Component;

@Component("nike")
public class Nike implements Product{
    @Override
    public String preferredProdcut() {
        return "Prefers Nike Keds for running.";
    }
}
