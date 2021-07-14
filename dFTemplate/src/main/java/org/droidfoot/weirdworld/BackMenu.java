package org.droidfoot.weirdworld;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackMenu extends Button
{
    /**
     * Act - do whatever the BackMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BackMenu()
    {
        setImage("help-backMenu.png");
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
            Greenfoot.delay(3);
            Greenfoot.setWorld(new MyWorld());
        }
    }    
}
