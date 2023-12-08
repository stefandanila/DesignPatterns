package com.sdanila.patterns.strategy.game;

import com.sdanila.patterns.strategy.game.behavior.BowAndArrowBehavior;

public class Knight extends Character {
    public Knight() {
        super();
        weaponBehavior = new BowAndArrowBehavior();
    }
}
