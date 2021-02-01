package com.github.kingtimer12.skywars.game;

import com.github.kingtimer12.skywars.game.chest.ChestObj;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@AllArgsConstructor
@Data
public class GameObj {

    private String mapName;
    private List<ChestObj> chests;
    private int time;
    private GameState state;

    public enum GameState {
        WAITING, WAIT_IN_JAIL, IN_GAME, RESTARTING
    }

}
