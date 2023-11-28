package com.mygdx.game.objects.general_objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.Zuma;
import com.mygdx.game.objects.GameObject;

public class Background extends GameObject
{

    private Texture texture;
    //constructor
    public Background(Texture texture)
    {

        this.position = new Vector2(0,0);
        this.texture = texture;

    }


    //OVERRIDDEN METHODS
    @Override
    public void draw(SpriteBatch batch)
    {

        batch.begin();
        batch.draw(this.texture,this.position.x,this.position.y,Zuma.width,Zuma.height);
        batch.end();

    }

    @Override
    public void dispose()
    {

        texture.dispose();

    }
}
