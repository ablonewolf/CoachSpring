package com.arka99.coachspring.coach;

import com.arka99.coachspring.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component("tennisCoach")
public class TennisCoach implements Coach {

    private Product product;

    public TennisCoach() {
    }

    @Autowired
    public TennisCoach(@Qualifier(value = "goldenWing") Product product) {
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

    @PostConstruct
    public void afterCreation() {
        System.out.println("Tennis Coach bean has been created.");
    }

    @PreDestroy
    public void beforeDestroy() {
        System.out.println("Tennis Coach bean is about to be destroyed.");
    }


}
