package com.mygdx.game.objects.zuma_objects;

import com.mygdx.game.objects.general_objects.Box;
import com.mygdx.game.objects.general_objects.LinearBox;
import com.mygdx.game.objects.general_objects.ScoreManager;

import java.util.ArrayList;

public class ScoreZuma extends ScoreManager
{

    //OVERRIDDEN METHODS
    @Override
    public void HandleScore(ArrayList<LinearBox> gameBoxes) //call it just before removing them from the collection
    {
        this.gameScore = 0;
        for (Box box: gameBoxes)
        {

            if(box.getMatchedStatus())
                this.gameScore += box.points;

        }



    }
}
