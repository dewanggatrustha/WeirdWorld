package org.droidfoot.weirdworld;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends Button
{
    /**
     * Act - do whatever the Help wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Help()
    {
        setImage("help.png");
    }
    public void act() 
    {
        if(Greenfoot.mousePressed(this))
        {
            Greenfoot.delay(3);
            Greenfoot.setWorld(new HelpScreen());
        }
    }    
}
