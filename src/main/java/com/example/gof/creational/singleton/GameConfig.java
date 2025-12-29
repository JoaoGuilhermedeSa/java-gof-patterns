package com.example.gof.creational.singleton;

public class GameConfig {

    private static GameConfig instance;
    private String difficultyLevel;
    private int maxPlayers;

    private GameConfig() {
        // Private constructor to prevent instantiation
        this.difficultyLevel = "NORMAL";
        this.maxPlayers = 4;
    }

    public static synchronized GameConfig getInstance() {
        if (instance == null) {
            instance = new GameConfig();
        }
        return instance;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }
}
