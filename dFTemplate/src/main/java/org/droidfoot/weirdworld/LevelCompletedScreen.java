package org.droidfoot.weirdworld;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelCompletedScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelCompletedScreen extends World
{

    /**
     * Constructor for objects of class LevelCompletedScreen.
     * 
     */
    public LevelCompletedScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 570, 1);
        setBackground("bg-level-completed.png");
        prepare();
    }
    
    private void prepare()
    {

        LevelCompleted levelCompleted = new LevelCompleted();
        addObject(levelCompleted,404,271);
    }
}
