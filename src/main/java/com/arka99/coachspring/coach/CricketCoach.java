package com.arka99.coachspring.coach;

import com.arka99.coachspring.product.Product;

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

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return Team;
    }
}
