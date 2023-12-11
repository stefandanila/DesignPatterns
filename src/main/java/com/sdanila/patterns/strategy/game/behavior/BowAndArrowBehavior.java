package com.sdanila.patterns.strategy.game.behavior;

import com.sdanila.patterns.strategy.game.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Shooting an arrow");
    }
}
