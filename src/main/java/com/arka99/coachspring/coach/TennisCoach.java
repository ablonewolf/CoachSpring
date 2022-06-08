package com.arka99.coachspring.coach;

import com.arka99.coachspring.product.Product;

public class TennisCoach implements Coach {

    private Product product;
    private String email;
    private String player;

    public TennisCoach() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }
}
