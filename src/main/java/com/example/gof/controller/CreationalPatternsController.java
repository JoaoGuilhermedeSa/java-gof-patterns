package com.example.gof.controller;

import com.example.gof.creational.abstractfactory.*;
import com.example.gof.creational.builder.Hero;
import com.example.gof.creational.factorymethod.*;
import com.example.gof.creational.prototype.Enemy;
import com.example.gof.creational.prototype.Orc;
import com.example.gof.creational.singleton.GameConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/creational")
public class CreationalPatternsController {

    @GetMapping("/singleton")
    public GameConfig getSingletonConfig() {
        return GameConfig.getInstance();
    }

    @GetMapping("/builder")
    public Hero createHero(@RequestParam(defaultValue = "Arthur") String name, @RequestParam(defaultValue = "Warrior") String profession) {
        return new Hero.Builder(name, profession)
                .withStrength(10)
                .withAgility(5)
                .withIntelligence(2)
                .withWeapon("Sword")
                .build();
    }

    @GetMapping("/prototype")
    public Enemy createEnemyClone() {
        Orc originalOrc = new Orc();
        return originalOrc.clone();
    }

    @GetMapping("/factory-method")
    public String useItem(@RequestParam String type) {
        ItemFactory factory;
        if ("potion".equalsIgnoreCase(type)) {
            factory = new PotionFactory();
        } else {
            factory = new WeaponFactory();
        }
        return factory.deliverItem() + " - " + factory.createItem().use();
    }

    @GetMapping("/abstract-factory")
    public Map<String, String> createKingdom(@RequestParam String type) {
        KingdomFactory factory;
        if ("elf".equalsIgnoreCase(type)) {
            factory = new ElfKingdomFactory();
        } else {
            factory = new OrcKingdomFactory();
        }

        King king = factory.createKing();
        Castle castle = factory.createCastle();

        Map<String, String> result = new HashMap<>();
        result.put("king", king.getDescription());
        result.put("castle", castle.getDescription());
        return result;
    }
}
