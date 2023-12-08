package com.sdanila.patterns.strategy.game;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    void fight() {
        weaponBehavior.useWeapon();
    }

    public void setWeapon(WeaponBehavior w) {
        this.weaponBehavior = w;
    }

}
