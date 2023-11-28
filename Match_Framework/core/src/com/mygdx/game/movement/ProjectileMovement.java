package com.mygdx.game.movement;

import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.objects.GameObject;

public class ProjectileMovement extends Movement
{
    float SPEED = 900f;
    private Vector2 tmp;

    //constructor
    public ProjectileMovement(Vector2 coordinates) //in this case we'll be getting the touch coordinates
    {
        this.tmp = coordinates; //give the object the coordinates of the position you want the obj passed in move method to reach
    }

    //OVERRIDDEN METHODS
    @Override
    public void move(final float deltaTime, final GameObject obj) //pass the object that i'll move
    {
        Vector2 dir = new Vector2(); //create a vector 2
        dir.set(tmp.x,tmp.y).sub(obj.position.x,obj.position.y); //transform it into a directional vector (B-A)
        //B will be the touch coordinates and A will be the obj that the method will move
        dir.nor();//normalize the directional vector
        obj.position.add(dir.x * deltaTime * SPEED,dir.y * deltaTime * SPEED); //add to object's position the directional coordinates * delta *Speed (this line will move the object)
    }

}
