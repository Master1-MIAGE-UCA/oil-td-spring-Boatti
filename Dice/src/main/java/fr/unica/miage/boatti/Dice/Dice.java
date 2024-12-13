package fr.unica.miage.boatti.Dice;

import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class Dice {
    private int value;

    public Dice() {
        this.value = 1;
    }

    public void roll() {
        this.value = (int) (Math.random() * 6) + 1;
    }

}