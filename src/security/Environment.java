/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import security.Agent.Status;

/**
 *
 * @author Ryan
 */
public class Environment {

    private List<Agent> agents;
    private List<Term> networkBuffer;
    private Protocol protocol;

    public Environment(Protocol protocol) {
        this.protocol = protocol;
        agents = new LinkedList<>();
        networkBuffer = new LinkedList<>();
    }

    public void run() {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        while (true) {
            System.out.println("1:CREATE AGENT\n2:TAKE STEP\nChoose Option: ");
            int n = reader.nextInt(); // Scans the next token of the input as an int.        
            if (n == 1) {
                System.out.println("Enter an Agent name: ");
                String name = reader.next();
                int id = createAgent(name);
                System.out.println("My name is: " + agents.get(id).getName() + "\nMy Run Identifier is: " + agents.get(id).getRunIdentifier());
                System.out.println("Give Role:\n " + protocol.getRole().get(0).getAgent() + "\n" + protocol.getRole().get(1).getAgent() + "\n" + protocol.getRole().get(2).getAgent());
                int roleAgent = reader.nextInt();
                
                agents.get(id).setRole(protocol.getRole().get(roleAgent));
                agents.get(id).setKnowledge(protocol.getRole().get(roleAgent).getKnowledge());
                for(Step step : agents.get(id).getRole().getSteps()) {
                    System.out.println(step.getAction().toString() + " " + step.getTerm().getTermString());
                }
            }
            else if (n==2)
            {
                System.out.println("foo");
            }
        }
    }

    public int createAgent(String name) {
        Agent agent = new Agent(name, Status.PARTICIPANT, agents.size());
        agents.add(agent);
        return agents.size()-1;
    }

    public void takeStep(int runIdentifier) {

    }

}
