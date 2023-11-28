package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.factories.Factory;
import com.mygdx.game.interfaces.CollisionHandler;
import com.mygdx.game.objects.general_objects.ScoreManager;

public abstract class  MyGame extends ApplicationAdapter implements CollisionHandler
{

   protected Factory factory;
   protected ScoreManager gsm;

   protected OrthographicCamera cam;
   protected SpriteBatch batch;
}
