package com.sda.mvc.controller;

import com.sda.mvc.model.GiantModel;
import com.sda.mvc.model.Health;
import com.sda.mvc.view.GiantView;

public class GiantController {

    private GiantView giantView;
    private GiantModel giantModel;

    public GiantController(GiantView giantView, GiantModel giantModel) {
        this.giantView = giantView;
        this.giantModel = giantModel;
    }


    public void updateView() {
        this.giantView.displayGiant(giantModel);
    }

    public Health getHealth(){
        return this.giantModel.getHealth();
    }

    public void setHealth(Health health) {
        this.giantModel.setHealth(health);
    }
}
