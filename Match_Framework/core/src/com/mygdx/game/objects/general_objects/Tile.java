package com.mygdx.game.objects.general_objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.objects.GameObject;

public class Tile<F> extends GameObject
{
    //Attributes
    Texture texture;
    F value;

    public Tile(F value,float w, float h)
    {
        this.value = value;
        this.width = w; this.height = h;

    }

    //constructor


    //methods
    public F getValue()
    {
        return value;
    }

    //Setters

    public void setPosition(GameObject object)
    {

        this.position = object.position;

    }

    public void setTexture(Texture texture)
    {
        this.texture = texture;
    }

    @Override
    public void draw(SpriteBatch batch)
    {
       batch.begin();
       batch.draw(texture,position.x,position.y,this.width,this.height);
       batch.end();
    }

    @Override
    public void dispose()
    {
        texture.dispose();
    }
}
