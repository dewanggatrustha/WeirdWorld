package org.droidfoot.weirdworld;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main extends World
{
    Player player = new Player();
    static Counter score = new Counter("Score: ");
    static Counter hp = new Counter("HP: ");
    /**
     * Constructor for objects of class Main.
     * 
     */
    public Main()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 570, 1); 
        setBackground("bg-day.png");
        prepare();

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cloud cloud = new Cloud();
        addObject(cloud,483,216);
        Cloud cloud2 = new Cloud();
        addObject(cloud2,690,64);
        Cloud cloud3 = new Cloud();
        addObject(cloud3,280,52);
        Cloud cloud4 = new Cloud();
        addObject(cloud4,109,232);

        Dirt dirt = new Dirt();
        addObject(dirt,400,485);

        Up up = new Up();
        addObject(up,144,445);

        Left left = new Left();
        addObject(left,70,520);

        Right right = new Right();
        addObject(right,216,520);

        Pew pew = new Pew();
        addObject(pew,661,485);

        Finish finish = new Finish();
        addObject(finish,696,320);

        DirtFloat dirtFloat = new DirtFloat();
        addObject(dirtFloat,162,287);
        DirtFloat dirtFloat2 = new DirtFloat();
        addObject(dirtFloat2,165,135);
        DirtFloat dirtFloat3 = new DirtFloat();
        addObject(dirtFloat3,532,136);

        Brick2 brick2 = new Brick2();
        addObject(brick2,264,128);
        Brick2 brick22 = new Brick2();
        addObject(brick22,315,208);
        Brick2 brick23 = new Brick2();
        addObject(brick23,371,277);
        Brick2 brick24 = new Brick2();
        addObject(brick24,419,277);
        Brick2 brick25 = new Brick2();
        addObject(brick25,467,277);
        Brick2 brick26 = new Brick2();
        addObject(brick26,513,277);

        Spike spike = new Spike();
        addObject(spike,572,388);
        Spike spike2 = new Spike();
        addObject(spike2,170,388);
        Spike spike3 = new Spike();
        addObject(spike3,523,388);

        Thug1 thug1 = new Thug1();
        addObject(thug1,387,349);

        Thug2 thug22 = new Thug2();
        addObject(thug22,518,204);
        Thug2 thug2 = new Thug2();
        addObject(thug2,224,349);

        Monster monster = new Monster();
        addObject(monster,673,349);
        Monster monster2 = new Monster();
        addObject(monster2,525,60);

        Coin coin = new Coin();
        addObject(coin,311,358);
        Coin coin2 = new Coin();
        addObject(coin2,417,209);
        Coin coin3 = new Coin();
        addObject(coin3,173,66);
        Coin coin4 = new Coin();
        addObject(coin4,460,358);
        Coin coin5 = new Coin();
        addObject(coin5,656,66);

        addObject(player,69,348);
        
        addObject(score,63,31);
        addObject(hp,732,31);
        score.setValue(0);
        hp.setValue(5);
    }

    public Player getPlayer()
    {
        return player;
    }
}
