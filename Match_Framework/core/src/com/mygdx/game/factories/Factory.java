package com.mygdx.game.factories;

import com.mygdx.game.data_manager.DataManager;
import com.mygdx.game.matcher.Matcher;
import com.mygdx.game.movement.Movement;
import com.mygdx.game.objects.general_objects.LinearBox;
import com.mygdx.game.objects.general_objects.Tile;
import com.mygdx.game.objects.zuma_objects.Cannon;

import java.util.ArrayList;

public abstract class Factory
{

    protected DataManager dm;
    public abstract LinearBox createLinearBox(Movement m, LinearBox r, LinearBox l, float x, float y);
    public abstract Cannon createCannon(float x, float y);
    public abstract Tile createTile(int val);
    public abstract ArrayList<LinearBox> generateGameBoxes();
    public abstract ArrayList<Tile> generateGameTiles();
    public abstract Matcher createLinearMatcher(Matcher nextMatch);

    //GETTER
    public DataManager getDm()
    {
        return dm;
    }

}
