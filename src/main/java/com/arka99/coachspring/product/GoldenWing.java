package com.arka99.coachspring.product;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("goldenWing")
public class GoldenWing implements Product{
    @Override
    public String preferredProdcut() {
        return "He prefers racket of Golden Wing.";
    }
}
