/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;

import java.util.List;

/**
 *
 * @author ryanrobinson
 */
public class Agent {
    
    public enum Role {PARTICIPANT, ADVERSARY}
    
    private List<Term> knowledge;
    private String name;
    private List script;
    private Role role;
    
    
    public Agent(String name)
    {
        this.name = name;
    }
    
    
}
