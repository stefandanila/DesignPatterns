package com.sdanila.patterns.strategy.game.behavior;

import com.sdanila.patterns.strategy.game.WeaponBehavior;

public class KnifeBehavior  implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Stabbing with knife");
    }
}
