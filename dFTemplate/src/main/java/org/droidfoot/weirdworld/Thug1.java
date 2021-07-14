package org.droidfoot.weirdworld;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Thug1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Thug1 extends Enemy
{
    /**
     * Act - do whatever the Thug1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Thug1()
    {
        setImage("thug1.png");
    }
    public void act() 
    {
        hit();
    }    
}
