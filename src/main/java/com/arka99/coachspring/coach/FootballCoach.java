package com.arka99.coachspring.coach;

import com.arka99.coachspring.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("footballCoach")
public class FootballCoach  implements Coach{
    @Autowired
    @Qualifier("adidas")
    private Product product;
    @Override
    public String getDailyWorkout() {
        return "Practiced 1 hour to take a perfect penalty shot.";
    }

    @Override
    public String getProdcut() {
        return this.product.preferredProdcut();
    }

    @PostConstruct
    public void afterCreation() {
        System.out.println("FootBall Coach bean has been created.");
    }

    @PreDestroy
    public void beforeDestroy() {
        System.out.println("FootBall Coach bean is about to be destroyed.");
    }
}
