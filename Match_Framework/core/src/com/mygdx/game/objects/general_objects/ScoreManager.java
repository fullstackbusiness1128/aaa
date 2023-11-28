package com.mygdx.game.objects.general_objects;

import com.mygdx.game.interfaces.ScoreHandler;

public abstract class ScoreManager implements ScoreHandler
{

    protected int gameScore; //reference to the game score variable

    //METHODS
    public int getGameScore()
    {

        return this.gameScore;

    }

}
