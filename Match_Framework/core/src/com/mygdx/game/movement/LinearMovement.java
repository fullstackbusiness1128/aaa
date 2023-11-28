package com.mygdx.game.movement;

import com.mygdx.game.objects.GameObject;

public class LinearMovement extends Movement
{
    private final float SPEED = 70f;


    @Override
    public void move(float deltaTime, GameObject obj)
    {

        obj.position.add(deltaTime * SPEED,0);

    }

}
