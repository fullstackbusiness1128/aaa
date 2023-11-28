package com.mygdx.game.objects.general_objects;

import java.util.HashMap;

public class Neighborhood<D, B extends Box>
{

    HashMap<D, B> map= new HashMap<D, B>();

    //methods

    public void add(D direction, B box)
    {

        map.put(direction,box);

    }

    public B getBox(D direction)
    {

        return map.get(direction);

    }

}
