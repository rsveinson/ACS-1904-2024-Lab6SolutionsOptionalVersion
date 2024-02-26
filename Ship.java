/** 
 * ACS-1904 lab 6
 * @Sveinson
*/

public abstract class Ship{
    protected String shipName;
    protected String flag;
    protected int year;
    protected Propulsion propulsion;
    
    // constructors
    public Ship(){
        shipName = "unknown";
        flag = "unknown";
        year = 0;
    }
    
    public Ship(String n, String f, int y, Propulsion p){
        shipName = n;
        flag = f;
        year = y;
        propulsion = p;
    }
    
    // getters
    public String getShipName(){
        return shipName;
    }
    
    
    // setters
    public void setShipName(String n){
        shipName = n;
    }
    
    // other
     
    public abstract String getName();
    
    /*****************************************
    * Description: overrides toString()
    * 
    * @return      String: ship info
    * ****************************************/ 
    @Override
    public String toString(){
        return shipName + ": " + year + "\n" + propulsion;
    }

}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
