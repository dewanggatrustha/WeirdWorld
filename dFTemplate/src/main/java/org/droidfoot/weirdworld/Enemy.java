package org.droidfoot.weirdworld;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int hpEnemy = 3;
    public void act() 
    {
    }   
    public void hit()
    {
        if(isTouching(Bullet.class))
        {
            removeTouching(Bullet.class);
            //scoreadd
            hpEnemy--;
            if(hpEnemy == 0)
            {
                Main.score.add(+5);
                deathExplodeBig();
            }
        }else if(isTouching(Player.class))
        {
            playerRespawn();
            Main.hp.add(-1);
            if (Main.hp.getValue()== 0)
            {
                 Main.hp.setValue(0);
                 deathExplodeSmall();
                 gameIsOver();
            }
            deathExplodeSmall();
        }
    }
    public void playerRespawn()
    {
        removeTouching(Player.class);
        getWorld().addObject(new Player(),getX(), getY());
    }
    public void deathExplodeBig()
    {
        getWorld().addObject(new ExplodeBig(), getX(), getY());
        Greenfoot.playSound("death1-sound.wav");
        getWorld().removeObject(this);
    }
    public void deathExplodeSmall()
    {
        getWorld().addObject(new ExplodeSmall(), getX(), getY());
        Greenfoot.playSound("death1-sound.wav");
    }
    public void gameIsOver()
    {
        Greenfoot.delay(3);
        Greenfoot.setWorld(new GameOverScreen());
    }
}

