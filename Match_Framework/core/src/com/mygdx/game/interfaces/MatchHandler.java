package com.mygdx.game.interfaces;

import com.mygdx.game.objects.general_objects.Box;
import com.mygdx.game.objects.general_objects.LinearBox;

import java.util.ArrayList;

public interface MatchHandler
{

    boolean HasMatch(Box b1, Box b2, ArrayList<LinearBox> gameBoxes);

}
