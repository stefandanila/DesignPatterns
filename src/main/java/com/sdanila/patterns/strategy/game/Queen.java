package com.sdanila.patterns.strategy.game;

import com.sdanila.patterns.strategy.game.behavior.KnifeBehavior;

public class Queen extends Character {
    public Queen() {
        super();
        weaponBehavior = new KnifeBehavior();
    }
}
