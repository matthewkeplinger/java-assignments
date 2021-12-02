/*
 * Matt Keplinger, CSCI 1301
 * PAssign1c, Ideal Gas Law with no user-inputs. Hardcoded calculations 
 * 10 JUN 2018
 */
package passign1;

public class PAssign1c {
    //set value of constant R   
      public static final double R = 8.31446;
    public static void main (String[] args) {
        // Ideal gas law PV= nRT
          
        //values of the gas attributes
        double volume =  .25; //volume at .25m^3 (V)
        double moles = 1.0;      //amount of gas set at 1 mole (n)
        
        //set temperature value (in kelvin)
        double temp = 313; //temperature set at 313K (T)
        
        //declare variable for pressure (P)
        double pressure = (moles * R * temp)/ volume;
        
        //output to user
        System.out.println("The pressure of " + moles + " mole(s) of an ideal gas with volume " + volume + " m^3 at temperature " 
                + temp + " K is " + pressure + " pascals.");
        
    }

}
