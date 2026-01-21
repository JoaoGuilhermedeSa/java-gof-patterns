package com.example.gof.structural.adapter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdapterTest {

    @Test
    public void testWizardAdapter() {
        Wizard wizard = new Wizard();
        Fighter fighter = new WizardAdapter(wizard);
        
        String result = fighter.attack();
        
        assertEquals("Wizard casts a fireball!", result);
    }
}
