package org.droidfoot.weirdworld;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverScreen extends World
{

    /**
     * Constructor for objects of class GameOverScreen.
     * 
     */
    public GameOverScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 570, 1);
        setBackground("bg-gameOver.png");
        prepare();
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Dirt dirt = new Dirt();
        addObject(dirt,400,485);
        GameOver gameOver = new GameOver();
        addObject(gameOver,407,112);
        Finish finish = new Finish();
        addObject(finish,657,320);
        finish.setLocation(635,322);
        Monster monster = new Monster();
        addObject(monster,555,352);
        Spike spike = new Spike();
        addObject(spike,250,387);
        Spike spike2 = new Spike();
        addObject(spike2,301,387);
        Brick brick = new Brick();
        addObject(brick,353,373);
        Brick brick2 = new Brick();
        addObject(brick2,353,321);
        Player player = new Player();
        addObject(player,76,348);
        Spike spike3 = new Spike();
        addObject(spike3,352,282);
    }

}
