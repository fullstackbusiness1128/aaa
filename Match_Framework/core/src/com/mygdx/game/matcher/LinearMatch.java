package com.mygdx.game.matcher;

import com.mygdx.game.objects.general_objects.Box;
import com.mygdx.game.objects.general_objects.LinearBox;
import com.mygdx.game.objects.general_objects.LinearNeighbors;

import java.util.ArrayList;

public class LinearMatch extends Matcher
{

    public LinearMatch(Matcher next)
    {
        super(next);
    }

    @Override
    public boolean HasMatch(Box b1, Box b2, ArrayList<LinearBox> gameBoxes)
    {
        if(b1==null || b2 ==null) return false;

        if(b1.getTile().getValue() == b2.getTile().getValue())
        {
            if(!b1.getMatchedStatus())
            {
                boxesThatMatched.add(b1);
                b1.setMatched(true);
                if(b1.getNeighbors().getBox(LinearNeighbors.Left) != null)HasMatch(b1,b1.getNeighbors().getBox(LinearNeighbors.Left),gameBoxes);
                if(b1.getNeighbors().getBox(LinearNeighbors.Right)!= null)HasMatch(b1,b1.getNeighbors().getBox(LinearNeighbors.Right),gameBoxes);
            }
            if(!b2.getMatchedStatus())
            {
                boxesThatMatched.add(b2);
                b2.setMatched(true);
                if(b2.getNeighbors().getBox(LinearNeighbors.Left) != null)HasMatch(b2,b2.getNeighbors().getBox(LinearNeighbors.Left),gameBoxes);
                if(b2.getNeighbors().getBox(LinearNeighbors.Right)!= null)HasMatch(b2,b2.getNeighbors().getBox(LinearNeighbors.Right),gameBoxes);
            }
            if(boxesThatMatched.size()>=1) Destroy(gameBoxes); //destroy a line of three or more boxes(this case >=1 allows match 2)
            //this covers the fact that bullets don't overlap between them
            return true;
        }
       return false;


    }

    @Override
    public void Destroy(ArrayList<LinearBox> gameBoxes)
    {
        boxesToRemove = new ArrayList<Box>();
        for (Box box:boxesThatMatched)
        {
            boxesToRemove.add(box);
        }
        boxesThatMatched.removeAll(boxesToRemove);

    }

    @Override
    public void clearMatchedBoxArray() //clears the matcher box collection
    {
        boxesToRemove = new ArrayList<Box>();
        for (Box box:boxesThatMatched)
        {
            box.setMatched(false);
            boxesToRemove.add(box);
        }
        boxesThatMatched.removeAll(boxesToRemove);
    }

}
