package com.sdanila.patterns.strategy.game;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    void fight() {
        System.out.print(this.getClass().getSimpleName() + " -> ");
        weaponBehavior.useWeapon();
    }

    public void setWeapon(WeaponBehavior w) {
        this.weaponBehavior = w;
    }
}
