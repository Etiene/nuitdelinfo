/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: EventTerroristeNeutralise
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/EventTerroristeNeutralise.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/EventTerroristeNeutralise.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event EventTerroristeNeutralise() 
public class EventTerroristeNeutralise extends RiJEvent implements AnimatedEvent {
    
    public static final int EventTerroristeNeutralise_Default_id = 18618;		//## ignore 
    
    
    // Constructors
    
    public  EventTerroristeNeutralise() {
        lId = EventTerroristeNeutralise_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (EventTerroristeNeutralise_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.EventTerroristeNeutralise");
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public Object getFieldValue(java.lang.reflect.Field f, Object userInstance) { 
         Object obj = null;
         try {
             obj = f.get(userInstance);
         } catch(Exception e) {
              java.lang.System.err.println("Exception: getting Field value: " + e);
              e.printStackTrace();
         }
         return obj;
    }
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public void addAttributes(AnimAttributes msg) {      
    }
    public String toString() {
          String s="EventTerroristeNeutralise(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/EventTerroristeNeutralise.java
*********************************************************************/

