package com.sdanila.patterns.strategy.game;
import com.sdanila.patterns.strategy.game.behavior.SwordBehavior;

public class King extends Character {

    public King() {
        super();
        weaponBehavior = new SwordBehavior();
    }
}
