package com.sdanila.patterns.strategy.game.behavior;

import com.sdanila.patterns.strategy.game.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Cutting with the sword");
    }
}
