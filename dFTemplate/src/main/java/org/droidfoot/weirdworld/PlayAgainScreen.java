package org.droidfoot.weirdworld;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayAgainScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayAgainScreen extends World
{

    /**
     * Constructor for objects of class PlayAgainScreen.
     * 
     */
    public PlayAgainScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 570, 1);
        setBackground("bg-playagain.png");
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlayAgain playAgain = new PlayAgain();
        addObject(playAgain,407,212);
        Yes yes = new Yes();
        addObject(yes,331,363);
        No no = new No();
        addObject(no,473,363);
    }
}
