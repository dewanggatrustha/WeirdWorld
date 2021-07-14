package org.droidfoot.weirdworld;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Thug2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Thug2 extends Enemy
{
    /**
     * Act - do whatever the Thug2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Thug2()
    {
        setImage("thug2.png");
    }
    public void act() 
    {
        hit();
    }    
}
