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
import security.Step.Action;

/**
 *
 * @author Ryan
 */
public class Environment {

    private List<Agent> agents;
    private List<Term> networkBuffer;
    private Protocol protocol;
    private Map<String, Integer> roleMap; //map for linking roles loaded from protocol to their posiition in the protocol role list eg. A->0 B->1 S->2
    private Map<Integer, String> agentMap; //map to link created agents to their position in the list eg. their run identifier. 
    private List<String> messageMap; //map to link a run identifier to a message sent to them !REVIEW!

    public Environment(Protocol protocol) {
        this.protocol = protocol;
        agents = new LinkedList<>();
        networkBuffer = new LinkedList<>();
        agentMap = new HashMap<>();
        roleMap = new HashMap<>();
        messageMap = new LinkedList<>();
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
                    System.out.println(agent.getRunIdentifier() + ": " + agent.getName());
                }
                int agent = reader.nextInt();
                boolean stepsDone = takeStep(agent, reader);
                System.out.println("Step Taken: " + stepsDone);
            }
        }
    }

    public int createAgent(String name) {
        Agent agent = new Agent(name, Status.PARTICIPANT, agents.size());
        agents.add(agent);
        agentMap.put(agent.getRunIdentifier(), name);
        //messageMap.add(new LinkedList<>());
        return agents.size()-1;
    }

    public boolean takeStep(int runIdentifier, Scanner reader) {
        int counter = agents.get(runIdentifier).getStepCounter();
        Step step;
        if(counter > agents.get(runIdentifier).getRole().getSteps().size()-1)
        {
            return false;
        }
        else
        {
            //int counteragents.get(runIdentifier).getStepCounter()
            step = agents.get(runIdentifier).getRole().getSteps().get(counter);
            System.out.println("Command: " + step.getAction() + " | Term: " + step.getTerm().getTermString() + " | To: " + step.getRecipiant());
            if(step.getAction().equals(Action.SEND))
            {
                System.out.println("Ree");
                //messageMap.get(runIdentifier).add(step.getTerm()); 
                //ask user whom they wish to send to
                System.out.println("Send to: ");
                //loop to list ALL people of 'ROLE S'
                for(Agent agent : agents)
                {
                    if(agent.getRole().getAgent().equals(step.getRecipiant()))
                    {
                        System.out.println(agent.getRunIdentifier() + ": " + agent.getName());
                    }
                }
                //take user input
                int runID = reader.nextInt();
                //CHECK TO SEE IF SELECTED RUN IDENTIFIER MATCHES AGENT OF ROLE S
                if(!agents.get(runID).getRole().getAgent().equals(step.getRecipiant()))
                {
                    //messageMap.add(step.getTerm().getTermString()+":"+runID);
                    return false;
                }
                else
                {
                    messageMap.add(step.getTerm().getTermString()+":"+runID);
                }
                //if so add to messageMap ::::APPEND RECIPIANT
                //add to network buffer
                networkBuffer.add(step.getTerm());
            }
            else if(step.getAction().equals(Action.RECIEVE))
            {
                //if there is a message for me check if it is in the messageMap
                
            }
            //step = agents.get(runIdentifier).getRole().getSteps().get(counter);
            agents.get(runIdentifier).incrementStep();
            //networkBufferMethod(step);
        }
        return true;
    }
    
    

}
