package com.mygdx.game.data_manager;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import java.util.ArrayList;


public  class DataManager
{
    //static attributes

    //DIMENSIONS
    public final float tile_width = 70.5f;
    public final float tile_height = 90.5f;
    public final float cannon_width = 100;
    public final float cannon_height = 130;

    //GAME CONSTANT VALUES
    public final int amountOfBoxes = 10;
    public final int distanceBetweenBoxes = -95;
    public final int boxPosY = 350;
    public final int fluctuation = 5; //values of tile
    public Vector2 CannonTip = new Vector2(129.5f,100f);

    //TEXTURES
    public final Texture frogTexture = new Texture("frog_Def.png");
    public final Texture texture1 = new Texture("gem_A.png");
    public final Texture texture2 = new Texture("gem_B.png");
    public final Texture texture3 = new Texture("gem_C.png");
    public final Texture texture4 = new Texture("gem_D.png");
    public final Texture texture5 = new Texture("gem_E.png");
    public final ArrayList<Texture> tileTextures = new ArrayList<Texture>();

    //SETTING UP TILE TEXTURES
    public void setTileTextures()
    {

        tileTextures.add(texture1);
        tileTextures.add(texture3);
        tileTextures.add(texture4);
        tileTextures.add(texture5);
        tileTextures.add(texture2);


    }


}
