package com.mygdx.game.objects.general_objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.movement.Movement;


public class LinearBox extends Box<LinearNeighbors>
{

    //bullet attributes
    public boolean remove;

    //constructor
    public LinearBox(Movement m, LinearBox r, LinearBox l, float x, float y, float w, float h)
    {

        this.movement = m;
        this.position = new Vector2();

        this.position.x = x;
        this.position.y = y;

        this.width = w; this.height = h;

        //points per Linear box
        this.points = 10;

        //Neighbors
        this.neighbors = new Neighborhood<LinearNeighbors, LinearBox>(); //box collection

        this.collider = new Rectangle(x,y,50,50);

    }

    public void setTilePositionToBoxPos()
    {
        this.tile.setPosition(this);
    }

    public void setBoxTile(Tile tile)
    {

        this.tile = tile;

    }

    public void setNeighbors(LinearBox right, LinearBox left)
    {

        this.neighbors.add(LinearNeighbors.Right,right);
        this.neighbors.add(LinearNeighbors.Left,left);

    }

    private void updateColliderPos()
    {

        this.collider.setPosition(this.position.x,this.position.y);

    }

    //methods

    @Override
    public void draw(SpriteBatch batch)
    {
        super.draw(batch);
        updateColliderPos();
    }

    @Override
    public void dispose()
    {
        super.dispose();
    }
}
