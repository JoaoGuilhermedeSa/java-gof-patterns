package com.example.gof.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class DwarvenGoldmineFacade {
    private final TunnelDigger tunnelDigger;
    private final GoldExcavator goldExcavator;
    private final CartOperator cartOperator;

    public DwarvenGoldmineFacade() {
        this.tunnelDigger = new TunnelDigger();
        this.goldExcavator = new GoldExcavator();
        this.cartOperator = new CartOperator();
    }

    public List<String> startNewShift() {
        List<String> actions = new ArrayList<>();
        actions.add(tunnelDigger.digTunnel());
        actions.add(goldExcavator.excavateGold());
        actions.add(cartOperator.moveGold());
        return actions;
    }
}
