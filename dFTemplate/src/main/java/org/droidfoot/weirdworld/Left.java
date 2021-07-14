package org.droidfoot.weirdworld;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Left here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Left extends Button
{
    /**
     * Act - do whatever the Left wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Left()
    {
        setImage("arrow-left.png");
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
            Main main = (Main) getWorld();
            Player player = main.getPlayer();
            player.button("left");
        }
    }    
}
