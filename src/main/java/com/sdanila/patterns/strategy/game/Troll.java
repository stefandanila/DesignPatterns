package com.sdanila.patterns.strategy.game;

import com.sdanila.patterns.strategy.game.behavior.AxeBehavior;

public class Troll extends  Character {
    public Troll() {
        super();
        weaponBehavior = new AxeBehavior();
    }
}
