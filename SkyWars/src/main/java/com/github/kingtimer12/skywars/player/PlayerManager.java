package com.github.kingtimer12.skywars.player;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class PlayerManager {

    private static List<PlayerObj> player = new ArrayList<>();

    public static void create(UUID uuid) {
        create(uuid, true);
    }

    public static void create(UUID uuid, boolean alive) {
        player.add(PlayerObj.builder().uuid(uuid).alive(alive).kills((short)0).build());
    }

    public static void remove(UUID uuid) {
        getPlayer(uuid).ifPresent(playerObj -> player.remove(playerObj));
    }

    public static void setSpectator(UUID uuid) {
        getPlayer(uuid).ifPresent(playerObj -> playerObj.setAlive(false));
    }

    public static void addKills(UUID uuid) {
        short kills = (short)(getKills(uuid)+1);
        getPlayer(uuid).ifPresent(playerObj -> playerObj.setKills(kills));
    }

    public static boolean isAlive(UUID uuid) {
        return getPlayer(uuid).map(PlayerObj::isAlive).orElse(true);
    }

    public static int getKills(UUID uuid) {
        return getPlayer(uuid).map(playerObj -> (int) playerObj.getKills()).orElse(0);
    }

    public static Optional<PlayerObj> getPlayer(UUID uuid) {
        return player.stream().filter(playerObj -> playerObj.getUuid().equals(uuid)).findAny();
    }

}
