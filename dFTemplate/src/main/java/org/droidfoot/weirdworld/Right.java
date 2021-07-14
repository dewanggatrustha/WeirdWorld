package org.droidfoot.weirdworld;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Right here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Right extends Button
{
    /**
     * Act - do whatever the Right wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Right()
    {
        setImage("arrow-right.png");
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
            Main main = (Main) getWorld();
            Player player = main.getPlayer();
            player.button("right");
        }
    }    
}
