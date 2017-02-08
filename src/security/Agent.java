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
 * @author ryanrobinson
 */
public class Agent {
    
    public enum Status {PARTICIPANT, ADVERSARY}
    
    private List<Term> knowledge;
    private String name;
    private Role role;
    private Status status;
    private int runIdentifier;
    
    
    public Agent(String name, Status status, int runIdentifier)
    {
        this.name = name;
        this.status = status;
        this.runIdentifier = runIdentifier;
        this.knowledge = new LinkedList<>();
    }
    
    public void setRole(Role role)
    {
        this.role = role;
    }
    
    public void setKnowledge(List<Term> knowledge)
    {
        this.knowledge = knowledge;
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
    
}
