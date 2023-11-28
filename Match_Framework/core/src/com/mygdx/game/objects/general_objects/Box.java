package com.mygdx.game.objects.general_objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.objects.GameObject;
import com.mygdx.game.interfaces.Destructable;

import java.util.ArrayList;

public  class Box<D> extends GameObject implements Destructable
{

    //Attributes
    public Tile tile;
    public Neighborhood neighbors;
    public int points;
    private boolean matchedStatus = false;

    //methods

    //getters

    public  Box getNeighbor(D direction)
    {
        return neighbors.getBox(direction);

    }

    public boolean getMatchedStatus()
    {
        return this.matchedStatus;
    }

    public Neighborhood getNeighbors()
    {

        return this.neighbors;

    }

    //setters

    public void setPosition(float x, float y){this.position = new Vector2(x,y);}

    public void setMatched(boolean bool){this.matchedStatus = bool;}

    //OVERRIDDEN

    @Override
    public void Destroy(ArrayList<LinearBox> boxes)
    {
        dispose();
    }

    @Override
    public void draw(SpriteBatch batch)
    {
        tile.draw(batch);
    }

    @Override
    public void dispose()
    {

        tile.dispose();

    }

    public Tile getTile()
    {
        return tile;
    }

}
