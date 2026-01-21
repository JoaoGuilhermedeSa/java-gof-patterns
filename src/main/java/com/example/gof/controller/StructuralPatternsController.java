package com.example.gof.controller;

import com.example.gof.structural.adapter.Fighter;
import com.example.gof.structural.adapter.Wizard;
import com.example.gof.structural.adapter.WizardAdapter;
import com.example.gof.structural.decorator.ClubbedTroll;
import com.example.gof.structural.decorator.SimpleTroll;
import com.example.gof.structural.decorator.Troll;
import com.example.gof.structural.facade.DwarvenGoldmineFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/structural")
public class StructuralPatternsController {

    @GetMapping("/adapter")
    public String adapterDemo() {
        Wizard wizard = new Wizard();
        Fighter warrior = new WizardAdapter(wizard);
        return "The Captain expects a Fighter. We give him a WizardAdapter. Result: " + warrior.attack();
    }

    @GetMapping("/decorator")
    public String decoratorDemo(@RequestParam(defaultValue = "false") boolean clubbed) {
        Troll troll = new SimpleTroll();
        String result = "Simple Troll: " + troll.attack() + " (Power: " + troll.getAttackPower() + ")";
        
        if (clubbed) {
            Troll clubbedTroll = new ClubbedTroll(troll);
            result += " | Clubbed Troll: " + clubbedTroll.attack() + " (Power: " + clubbedTroll.getAttackPower() + ")";
        }
        
        return result;
    }

    @GetMapping("/facade")
    public List<String> facadeDemo() {
        DwarvenGoldmineFacade mine = new DwarvenGoldmineFacade();
        return mine.startNewShift();
    }
}
