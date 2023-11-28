package com.mygdx.game.factories;

import com.mygdx.game.data_manager.DataManager;
import com.mygdx.game.matcher.LinearMatch;
import com.mygdx.game.matcher.Matcher;
import com.mygdx.game.movement.LinearMovement;
import com.mygdx.game.movement.Movement;
import com.mygdx.game.objects.general_objects.LinearBox;
import com.mygdx.game.objects.general_objects.Tile;
import com.mygdx.game.objects.zuma_objects.Cannon;

import java.util.ArrayList;
import java.util.Random;

public class Zuma_Factory extends Factory
{

    //attributes
    private Random rand;

    //constructor
    public Zuma_Factory()
    {
        dm = new DataManager();
        dm.setTileTextures(); //set the texture data for the tiles in the game
    }

    //methods
    @Override
    public LinearBox createLinearBox(Movement m, LinearBox r, LinearBox l, float pos_x, float pos_y)
    {
       return new LinearBox(m,r,l,pos_x,pos_y,dm.tile_width,dm.tile_height);
    }
    @Override
    public Cannon createCannon(float pos_x, float pos_y)
    {
        return new Cannon(dm.frogTexture,dm.cannon_width,dm.cannon_height,pos_x,pos_y);
    }
    @Override
    public Tile createTile(int val)
    {
        return new Tile(val,dm.tile_width,dm.tile_height);
    }

    public Matcher createLinearMatcher(Matcher nextMatch)
    { return new LinearMatch(null); }

    //generate game boxes
    public ArrayList<LinearBox> generateGameBoxes()
    {

        ArrayList<LinearBox> inGameBoxes = new ArrayList<LinearBox>();
        int distance = 0; //distance setter

        //create boxes
        for (int i = 0; i<dm.amountOfBoxes ; i++)
        {

            inGameBoxes.add(new LinearBox(new LinearMovement(),null,null,0,0,dm.tile_width,dm.tile_height));

        }

        //fix the x position of each box
        for (int i = 0; i<dm.amountOfBoxes; i++)
        {
            inGameBoxes.get(i).setPosition(distance,dm.boxPosY);
            distance+=dm.distanceBetweenBoxes;

        }


        //set each box neighbor
        for (int i = 0; i<dm.amountOfBoxes; i++)
        {

            if(i == 0) inGameBoxes.get(i).setNeighbors(null,inGameBoxes.get(i+1)); //first box
            else if(i == dm.amountOfBoxes-1)inGameBoxes.get(i).setNeighbors(inGameBoxes.get(i-1),null);//last box
            else inGameBoxes.get(i).setNeighbors(inGameBoxes.get(i-1),inGameBoxes.get(i+1));//normal case in middle boxes

        }

        return inGameBoxes;

    }

    //put a tile on each box


    //generate random Tiles
    public ArrayList<Tile> generateGameTiles()
    {

        ArrayList<Tile> gameTiles = new ArrayList<Tile>();
        rand = new Random();

        for(int i = 0; i<dm.fluctuation; i++)
        {

            gameTiles.add(new Tile(rand.nextInt(dm.fluctuation),dm.tile_width,dm.tile_height)); //creates as many random tiles as the amount of boxes in the game

        }

        setGameTilesTextures(gameTiles);
        return gameTiles;

    }

    public void setGameTilesTextures(ArrayList<Tile> gameTiles)
    {
        for (int i = 0; i< gameTiles.size();i++) //verify
        {

            switch ((Integer)gameTiles.get(i).getValue())
            {

                case 0:
                    gameTiles.get(i).setTexture(dm.tileTextures.get(0));
                    break;
                case 1:
                    gameTiles.get(i).setTexture(dm.tileTextures.get(1));
                    break;
                case 2:
                    gameTiles.get(i).setTexture(dm.tileTextures.get(2));
                    break;
                case 3:
                    gameTiles.get(i).setTexture(dm.tileTextures.get(3));
                    break;
                case 4:
                    gameTiles.get(i).setTexture(dm.tileTextures.get(4));
                    break;

            }

        }

    }

}
