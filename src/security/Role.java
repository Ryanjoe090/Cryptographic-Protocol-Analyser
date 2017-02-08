/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Think
 */
public class Role {
    //public enum Action {SEND, RECIEVE, FRESH}
    
    //private String agent;
    //private Term initialKnowledge;
    //private Action action;
    /////^^^^REDUNDANT^^^^
    private List<Step> steps;
    private String agent;
    private List<Term> initialKnowledge;
    /*public Role(String agent,Term initialKnowledge,Action action)
    {
        this.agent = agent; //IN FUTURE CHANGE TO AGENT CLASS
        this.initialKnowledge = initialKnowledge;
        this.action = action;
    }*/
    
    public Role(String agent)
    {
        this.agent = agent;
        steps = new LinkedList<>();
        initialKnowledge = new LinkedList<>();
    }
    
    public void add(Step step)
    {
        steps.add(step);
    }
    
    public void addKnowledge(Term knowledge)
    {
        initialKnowledge.add(knowledge);
    }
    
    public String getAgent()
    {
        return agent;
    }
    
    public List<Step> getSteps()
    {
        return steps;
    }
    
    public List<Term> getKnowledge()
    {
        return initialKnowledge;
    }
}
