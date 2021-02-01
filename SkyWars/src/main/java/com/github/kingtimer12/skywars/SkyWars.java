package com.github.kingtimer12.skywars;

import org.bukkit.plugin.java.JavaPlugin;

public class SkyWars extends JavaPlugin {

    public static SkyWars getInstance() {
        return SkyWars.getPlugin(SkyWars.class);
    }

    @Override
    public void onEnable() {
        //TODO: PlayerObj, PlayerManager, GameObj, GameManager, ScoreboardBuilder, Kit(s)

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
