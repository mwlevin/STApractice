/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sta;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author micha
 */
public class Network 
{
    private Node[] nodes;
    private Link[] links;
    private Zone[] zones;
    
    public Network(String name)
    {
        nodes = new Node[0];
        links = new Link[0];
        zones = new Zone[0];
        
        
        try
        {
            readNetwork(new File("data/"+name+"/net.txt"));
            readTrips(new File("data/"+name+"/trips.txt"));
        }
        catch(IOException ex)
        {
            ex.printStackTrace(System.err);
        }
    }
    
    
    public Network(Node[] nodes, Link[] links)
    {
        this.nodes = nodes;
        this.links = links;
        this.zones = zones;
    }
    
    
    public Link[] getLinks()
    {
        return links;
    }
    
    public Node[] getNodes()
    {
        return nodes;
    }
    
    public Zone[] getZones()
    {
        return zones;
    }
    
    
    
    
    public void readNetwork(File netFile) throws IOException
    {
        /* **********
        Exercise 5(b)
        ********** */
        
        
        /* **********
        Exercise 5(c)
        ********** */
        
       
        // fill this in
    }
    
    public void readTrips(File tripsFile) throws IOException
    {

        /* **********
        Exercise 5(d)
        ********** */
        
        // fill this in
        
    }
    
    /* **********
    Exercise 5(e)
    ********** */
    
    public Node findNode(int id)
    {
        // fill this in
        return null;
    }
    
    public Link findLink(Node i, Node j)
    {
        // fill this in
        return null;
    }
    
    
    
    public void dijkstras(Node r)
    {
        /* **********
        Exercise 6(b)
        ********** */
        
        /* **********
        Exercise 6(c)
        ********** */
        
        // fill this in
    }
    
    
    /* **********
    Exercise 6(d)
    ********** */
    public Path trace(Node r, Node s)
    {
        // fill this in
        return null;
    }
    
    
    /* **********
    Exercise 7
    ********** */
    public double getTSTT()
    {
        // fill this in
        return 0.0;
    }
    
    public double getSPTT()
    {
        // fill this in
        return 0.0;
    }
    
    public double getTotalTrips()
    {
        // fill this in
        return 0.0;
    }

    public double getAEC()
    {
        // fill this in
        return 0.0;
    }
    
    
    
    
    
    
    
    
    
    
    /* **********
    Exercise 8(b)
    ********** */
    public double calculateStepsize(int iteration)
    {
        // fill this in
        return 0.0;
    }

    public void calculateNewX(double stepsize)
    {
        // fill this in
    }
    
    
    /* **********
    Exercise 8(c)
    ********** */
    public void calculateAON()
    {
        // fill this in
    }
    
    
    /* **********
    Exercise 8(d)
    ********** */
    public void msa(int max_iteration)
    {
        System.out.println("Iteration\tAEC");
        
        // fill this in
    }
    
    
    
    
    
    
}
