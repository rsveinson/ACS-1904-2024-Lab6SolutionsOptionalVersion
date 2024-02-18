
/**
 * Enumeration class Propulsion - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Propulsion
{
    DIESEL("Diesel", "RT96-Turbo"), 
            DIESELELECTRIC("Diesel Electric", "Codag-DE Hybrid"),
            GASTURBINE("Gas Turbine", "GE-LM2500");
            
    String displayName;
    String model;
    
    private Propulsion(String n, String m){
        displayName = n;
        model = m;
    }
    
    @Override
    public String toString(){
       StringBuilder st = new StringBuilder();
       
       st.append(displayName);
       st.append(": ");
       st.append(model);
       
       return st.toString();
    }
    
    
            
}
