package com.github.kingtimer12.skywars.game.chest;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bukkit.Location;

@Data
@AllArgsConstructor
public class ChestObj {

    private Location location;
    private ChestType chestType;

    public enum ChestType {
        ISLAND, MINI_FEAST, FEAST
    }

}
