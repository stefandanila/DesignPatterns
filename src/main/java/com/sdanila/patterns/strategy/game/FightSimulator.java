package com.sdanila.patterns.strategy.game;

import com.sdanila.patterns.strategy.game.behavior.AxeBehavior;

import java.util.ArrayList;
import java.util.List;

public class FightSimulator {
    public static void main(String[] args) {
        List<Character> characters = new ArrayList<>();
        Character queen = new Queen();
        characters.add(queen);
        characters.add(new Knight());
        characters.add(new King());
        characters.add(new Troll());

        for (Character character : characters) {
            character.fight();
        }

        queen.setWeapon(new AxeBehavior());
        queen.fight();
    }
}
