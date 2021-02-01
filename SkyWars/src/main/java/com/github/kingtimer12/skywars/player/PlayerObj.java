package com.github.kingtimer12.skywars.player;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
public class PlayerObj {

    private UUID uuid;
    private short kills;
    private boolean alive;

}
