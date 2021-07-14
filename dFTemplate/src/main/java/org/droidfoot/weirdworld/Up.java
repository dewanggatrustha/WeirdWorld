package org.droidfoot.weirdworld;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Up here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Up extends Button
{
    /**
     * Act - do whatever the Up wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Up()
    {
        setImage("arrow-up.png");
    }  
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
            Main main = (Main) getWorld();
            Player player = main.getPlayer();
            player.button("up");
        }
    }    
}
