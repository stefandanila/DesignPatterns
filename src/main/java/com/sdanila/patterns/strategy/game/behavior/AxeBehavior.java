package com.sdanila.patterns.strategy.game.behavior;

import com.sdanila.patterns.strategy.game.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Throwing the axe");
    }
}
