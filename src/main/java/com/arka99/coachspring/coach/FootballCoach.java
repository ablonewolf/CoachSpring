package com.arka99.coachspring.coach;

import com.arka99.coachspring.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("footballCoach")
public class FootballCoach  implements Coach{
    @Autowired
    private Product product;
    @Override
    public String getDailyWorkout() {
        return "Practiced 1 hour to take a perfect penalty shot.";
    }

    @Override
    public String getProdcut() {
        return this.product.preferredProdcut();
    }
}
