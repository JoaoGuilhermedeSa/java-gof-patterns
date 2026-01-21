package com.example.gof.structural.adapter;

public class WizardAdapter implements Fighter {
    private final Wizard wizard;

    public WizardAdapter(Wizard wizard) {
        this.wizard = wizard;
    }

    @Override
    public String attack() {
        return wizard.castSpell();
    }
}
