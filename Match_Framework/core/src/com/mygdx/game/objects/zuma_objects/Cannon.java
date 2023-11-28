package com.mygdx.game.objects.zuma_objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.objects.GameObject;


public class Cannon extends GameObject
{
   //attributes
    private Texture texture;

    //constructor
    public Cannon(Texture t, float widthT, float heightT, float pos_x, float pos_y) //pixel units
    {
        this.texture = t;
        this.height = heightT;
        this.width = widthT;
        this.position = new Vector2(pos_x,pos_y);
    }
    //Overridden Methods
    @Override
    public void draw(SpriteBatch batch)
    {
        batch.begin();
        batch.draw(this.texture,this.position.x,this.position.y,this.width,this.height);
        batch.end();
    }

    @Override
    public void dispose()
    {
        texture.dispose();
    }

}
