package org.droidfoot.weirdworld;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExplodeSmall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExplodeSmall extends Actor
{
    /**
     * Act - do whatever the ExplodeSmall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counterTime = 0;
    public ExplodeSmall()
    {
        setImage("death-explode2.png");
    }
    public void act() 
    {
        counterTime++;
        if(counterTime == 30)
        {
            getWorld().removeObject(this);
        }
    }
}
