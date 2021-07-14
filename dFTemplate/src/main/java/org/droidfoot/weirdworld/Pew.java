package org.droidfoot.weirdworld;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pew here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Pew extends Button
{
    private int delay;
    /**
     * Act - do whatever the Pew wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Pew()
    {
        setImage("pew.png");
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
            Main main = (Main) getWorld();
            Player player = main.getPlayer();
            player.button("pew");
        }
    }    
}
