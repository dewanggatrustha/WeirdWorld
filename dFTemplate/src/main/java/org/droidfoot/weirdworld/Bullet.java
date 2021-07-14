package org.droidfoot.weirdworld;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int bulletTimeGone = 0;
    public Bullet()
    {
        setImage("bullet.png");
    }
    public void act() 
    {
        shoot();
        bulletTimeGone++;
        if(bulletTimeGone == 150)
        {
            getWorld().removeObject(this);
        }
    }
    public void shoot()
    {
        setLocation(getX()+2,getY());
    }
}
