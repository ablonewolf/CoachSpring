package com.arka99.coachspring.coach;

import com.arka99.coachspring.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("tennisCoach")
public class TennisCoach implements Coach {

    private Product product;

    public TennisCoach() {
    }

    @Autowired
    public TennisCoach(Product product) {
        this.product = product;
    }

    @Override
    public String getDailyWorkout() {
        return "Practiced 60 minutes to make a perfect ace.";
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String getProdcut() {
        return this.product.preferredProdcut();
    }

}
