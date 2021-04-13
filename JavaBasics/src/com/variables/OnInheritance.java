package com.variables;
class Bike  
{  
	
	
    private String color;  
    private int maxSpeed;  
    public void bikeInfo()  
    {  
        System.out.println("Bike Color= "+color + " Max Speed= " + maxSpeed);  
    }  
    public void setColor(String color)  
    {  
        this.color = color;  
    }  
    public void setMaxSpeed(int maxSpeed)  
    {  
        this.maxSpeed = maxSpeed;  
    }  
}  
class Pulsar extends Bike  
{  
    public void PulsarStartDemo()  
    {  
         Engine PulsarEngine = new Engine();  
        PulsarEngine.stop();  
     }  
}  

class Engine  
{  
    public void start()  
    {  
        System.out.println("Started:");  
    }  
    public void stop()  
    {  
        System.out.println("Stopped:");  
    }  
}  

public class OnInheritance {
	public static void main(String[] args) {
		 Pulsar myPulsar = new Pulsar();  
	        myPulsar.setColor("BLACK");  
	        myPulsar.setMaxSpeed(136);  
	        myPulsar.bikeInfo();  
	       myPulsar.PulsarStartDemo();  
	}
}