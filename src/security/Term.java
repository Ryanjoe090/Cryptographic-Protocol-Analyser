/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ryanrobinson
 */
public class Term {
    
    public enum Type {PUBLIC, FRESH, HASH, AENC, ADEC, PK, SK}
    
    private String termString;
    private Type type;    
    private List<Term> subTerms;
    private int arity;
    
    public Term(String name, Type type, int arity)
    {
        this.termString = name;
        this.type = type;
        this.subTerms = new ArrayList<>();
        this.arity = arity;
    }
    
    public Term()
    {
        
    }
    
    /*
        Encrytps the encryptee with the key
        Creates the string in Alice and Bob type notation
        Just Asymmetric at the moment
        
        TODO
        some sort of key verfication. like check it is actually a key and not
        a random term. Some sort of knowlege checking maybe.
    */
    public static Term encrypt(Term encryptee, Term key)
    {
        String termString = "{" + encryptee.termString + "}" + key.termString;
        Term term = new Term(termString, Type.AENC, 2);
        term.subTerms.add(encryptee);
        term.subTerms.add(key);
        
        return term;
    }
    
    public static List<Term> decrypt(Term decryptee, Term key)
    {
        if(decryptee.subTerms.contains(key))
        {
            return decryptee.subTerms;
        }
        else return null;
    }
    
    
    public static List<Term> registerAsymmetic(Term agent)
    {
        List<Term> keys = new ArrayList<>();
        String publicKeyString = "pk(" + agent.termString + ")";
        String privateKeyString = "sk(" + agent.termString + ")";
        Term publicKey = new Term(publicKeyString, Type.PK, 1);
        Term privateKey = new Term(privateKeyString, Type.SK, 1);
        publicKey.subTerms.add(agent);
        privateKey.subTerms.add(agent);
        
        keys.add(publicKey);
        keys.add(privateKey);
        
        return keys;
    }
    
    public static Term hash(Term hashee)
    {
        String hashString = "h(" + hashee.termString + ")";
        Term hash = new Term(hashString, Type.HASH, 1);
        hash.subTerms.add(hashee);
        return hash;
    }
    
    public void setSubNodes(Term term)
    {
        subTerms.add(term);
    }
    
    
    public String getTermString()
    {
        return termString;
    }
    
    public static Term generateFresh(String name)
    {
        Term term = new Term(name, Type.FRESH, 0);
        return term;
    }
}
