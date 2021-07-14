package org.droidfoot.weirdworld;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Button
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Start()
    {
        setImage("start.png");
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
            Greenfoot.delay(3);
            Greenfoot.setWorld(new Level1Screen());
        }
    }
}
