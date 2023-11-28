package com.mygdx.game.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.movement.Movement;

public abstract class GameObject
{

    public Movement movement;
    public Vector2 position;
    protected float width,height;
    public Rectangle collider;

    public abstract void draw(SpriteBatch batch);
    public abstract void dispose();

}
