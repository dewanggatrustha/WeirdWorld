package org.droidfoot.weirdworld;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int hurtTime = 0;
    public int speed = 5;
    public int vSpeed = 0;
    public int vUp = 1;
    public int hop = 25;
    private int delay;
    private boolean onMove = true;
    private String turnPlayer= "up";
    public Player()
    {
        setImage("player.png");
    }
    public void act() 
    {
        control();
        autoMove();
        checkIfFall();
        Finished();
        hitSpike();
    }

    public void autoMove()
    {
        if(onMove)
        {
            if(turnPlayer.equalsIgnoreCase("right"))
            {
                move(+1);
            }else if(turnPlayer.equalsIgnoreCase("left"))
            {
                move(-1);
            }
        }
    }

    public void shoot()
    {
        Bullet bullet = new Bullet();
        getWorld().addObject(new Bullet(), getX()+50, getY()+9);
        setImage("player.png");
        Greenfoot.playSound("bullet-sound.wav");
    }      

    public void control()
    {
        if("up".equals(Greenfoot.getMouseInfo()))
        {
            button("up");
        }else if("left".equals(Greenfoot.getMouseInfo()))
        {
            button("left");
        }else if("right".equals(Greenfoot.getMouseInfo()))
        {
            button("right");
        }else if("pew".equals(Greenfoot.getMouseInfo()))
        {
            button("pew");
        }
    }

    public void button(String key)
    {
        if(key.equalsIgnoreCase("up"))
        {
            if(delay > 0) delay--;
            if (delay == 0 && key.equalsIgnoreCase("up"))
            {
                setLocation(getX(),getY()-150);
                delay = 2;
            }
        }else if(key.equalsIgnoreCase("left"))
        {
            turnPlayer = "left";
            move(-speed);
            setImage("player-flip.png");
        }else if(key.equalsIgnoreCase("right"))
        {
            turnPlayer = "right";
            move(+speed);
            setImage("player.png");
        }else if(key.equalsIgnoreCase("pew"))
        {
            if(delay > 0) delay--;
            if (delay == 0 && key.equalsIgnoreCase("pew"))
            {
                shoot();
                delay = 2;
            }
        }
    }

    public void checkIfFall()
    {
        if (onDirt())
        {
            vSpeed = 0;
        }
        else
        {
            fall();
        }
    }

    public boolean onDirt()
    {
        Actor unter = getOneObjectAtOffset(0, getImage().getHeight()/2, Ground.class);
        return unter != null;
    }

    public void fall()
    {
        setLocation(getX(), getY()+vSpeed);
        vSpeed = vSpeed + vUp;
    }
    public void Finished()
    {
        if(isTouching(Finish.class))
        {
          Greenfoot.setWorld(new LevelCompletedScreen());
        }
    }
    public void hitSpike()
    {
        if(isTouching(Spike.class))
        {
            Greenfoot.playSound("hit-sound.wav");
            if(turnPlayer == "left")
            {
                setImage("player-hurt-flip.png");
                //getWorld().removeObject(this);
                //setImage("player-flip.png");
                hurtTime++;
            }else if(turnPlayer == "right")
            {
                setImage("player-hurt.png");
                //getWorld().removeObject(this);
                //setImage("player.png");
                hurtTime++;
            }
            Main.hp.add(-1);
            if (Main.hp.getValue()== 0)
            {
                 Main.hp.setValue(0);
                 deathExplodeSmall();
                 gameIsOver();
            }
        }else if(hurtTime >= 40)
        {
            if(turnPlayer == "left")
            {
                setImage("player-flip.png");
            }else if(turnPlayer == "right")
            {
                setImage("player.png");
            }
            hurtTime = 0;
        }
    }
    public void deathExplodeSmall()
    {
        getWorld().addObject(new ExplodeSmall(), getX(), getY());
        Greenfoot.playSound("death1-sound.wav");
    }
    public void gameIsOver()
    {
        Greenfoot.setWorld(new GameOverScreen());
    }
}