package com.arka99.coachspring.coach;

import com.arka99.coachspring.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("cricketCoach")
public class CricketCoach implements Coach {

    private Product product;
    private String emailAddress;
    private String Team;


    public CricketCoach() {
    }

    public CricketCoach(Product product) {
        this.product = product;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        Team = team;
    }

    public String getDailyWorkout() {
        return "Spend 45 minutes on batting practice";
    }


    @Override
    public String getProdcut() {
        return this.product.preferredProdcut();
    }


    @Autowired
    @Qualifier("nike")
    public void setProduct(Product product) {
        this.product = product;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return Team;
    }
    @PostConstruct
    public void afterCreation() {
        System.out.println("Cricket Coach bean has been created.");
    }

    @PreDestroy
    public void beforeDestroy() {
        System.out.println("Cricket Coach bean is about to be destroyed.");
    }
}
