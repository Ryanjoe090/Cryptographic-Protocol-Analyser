/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;


/**
 *
 * @author ryanrobinson
 */
public class Key {
    public enum Type{PRIVATE, PUBLIC, SYMMETRIC}
    private Type type; 
    
    public Key()
    {
        
    }
}
