package org.example;

import org.jfugue.player.Player;
import org.jfugue.rhythm.Rhythm;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.play("C D E F G A B");

        Rhythm rhythm = new Rhythm()
                .addLayer("O..oO...O..oOO..")
                .addLayer("..S...S...S...S.")
                .addLayer("````````````````")
                .addLayer("...............+");
        new Player().play(rhythm.getPattern().repeat(4));
        }
    }
