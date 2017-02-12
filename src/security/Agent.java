/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;

import java.util.LinkedList;
import java.util.List;
import security.Term.Type;

/**
 *
 * @author ryanrobinson
 */
public class Agent {
    
    public enum Status {PARTICIPANT, ADVERSARY}
    
    private List<Term> knowledge;
    private String name;
    private Role role;
    private Status status;
    private int runIdentifier;
    private int stepCounter;
    
    
    public Agent(String name, Status status, int runIdentifier)
    {
        this.name = name;
        this.status = status;
        this.runIdentifier = runIdentifier;
        this.knowledge = new LinkedList<>();
        stepCounter = 0;
    }
    
    public void setRole(Role role)
    {
        this.role = role;
    }
    
    public void setKnowledge(List<Term> knowledge)
    {
        this.knowledge = knowledge;
    }
    
    public void addKnowledge(Term term)
    {
        if(knowledge.contains(term))
        {
            System.out.println("Already in knowledge");
        }
        else if(term.getType().equals(Type.LIST))
        {
            List<Term> listTerm = Derivation.breakdownTermList(term);
            for(Term t : listTerm)
            {
                if(!knowledge.contains(t))
                {
                    knowledge.add(t);
                }
            }
        }
        else
        {
            knowledge.add(term);
        }
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getRunIdentifier()
    {
        return runIdentifier;
    }
    
    public Role getRole()
    {
        return role;
    }
    
    public int getStepCounter()
    {
        return stepCounter;
    }
    
    public void incrementStep()
    {
        stepCounter++;
    }
    
}
