package com.sda.mvc;

import com.sda.mvc.controller.GiantController;
import com.sda.mvc.model.Fatigue;
import com.sda.mvc.model.GiantModel;
import com.sda.mvc.model.Health;
import com.sda.mvc.model.Nourishment;
import com.sda.mvc.view.GiantView;

public class Main {

    public static void main(String[] args) {

        GiantModel giantModel = new GiantModel(Fatigue.SLEEPING, Health.DEAD, Nourishment.HUNGRY);
        GiantView giantView = new GiantView();

        GiantController giantController = new GiantController(giantView, giantModel);
        giantController.updateView();
        giantController.setHealth(Health.HEALTHY);
        giantController.updateView();

    }
}
