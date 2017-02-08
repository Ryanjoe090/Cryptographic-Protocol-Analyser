/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
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
    private Map<String, Integer> roleMap;
    private Map<String, Integer> agentMap;

    public Environment(Protocol protocol) {
        this.protocol = protocol;
        agents = new LinkedList<>();
        networkBuffer = new LinkedList<>();
        agentMap = new HashMap<>();
        roleMap = new HashMap<>();
        for(int i=0;i<protocol.getRole().size();i++)
        {
            roleMap.put(protocol.getRole().get(i).getAgent(),i);
        }
    }

    public void run() {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        while (true) {
            System.out.println("\n\n\n1:CREATE AGENT\n2:TAKE STEP\nChoose Option: ");
            int n = reader.nextInt();        
            if (n == 1) {
                System.out.println("Enter an Agent name: ");
                String name = reader.next();
                int id = createAgent(name);
                System.out.println("My name is: " + agents.get(id).getName() + "\nMy Run Identifier is: " + agents.get(id).getRunIdentifier());
                System.out.println("Give Role:\n" + protocol.getRole().get(0).getAgent() + "\n" + protocol.getRole().get(1).getAgent() + "\n" + protocol.getRole().get(2).getAgent());
                String roleAgent = reader.next();
                
                agents.get(id).setRole(protocol.getRole().get(roleMap.get(roleAgent)));
                agents.get(id).setKnowledge(protocol.getRole().get(roleMap.get(roleAgent)).getKnowledge());
                for(Step step : agents.get(id).getRole().getSteps()) {
                    System.out.println(step.getAction().toString() + " " + step.getTerm().getTermString());
                }
            }
            else if (n==2)
            {
                System.out.println("\nCHOOSE AGENT TO STEP:");
                for(Agent agent : agents)
                {
                    System.out.println(agent.getName());
                }
                String agent = reader.next();
                boolean stepsDone = takeStep(agentMap.get(agent));
                System.out.println("Step Taken: " + stepsDone);
            }
        }
    }

    public int createAgent(String name) {
        Agent agent = new Agent(name, Status.PARTICIPANT, agents.size());
        agents.add(agent);
        agentMap.put(name, agent.getRunIdentifier());
        return agents.size()-1;
    }

    public boolean takeStep(int runIdentifier) {
        if(agents.get(runIdentifier).getStepCounter() > agents.get(runIdentifier).getRole().getSteps().size()-1)
        {
            return false;
        }
        else
        {
            agents.get(runIdentifier).incrementStep();
        }
        return true;
    }
    
    

}
