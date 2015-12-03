/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: EventUrgenceRecu
//!	Generated Date	: Thu, 3, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/EventUrgenceRecu.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/EventUrgenceRecu.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event EventUrgenceRecu() 
public class EventUrgenceRecu extends RiJEvent implements AnimatedEvent {
    
    public static final int EventUrgenceRecu_Default_id = 18623;		//## ignore 
    
    
    // Constructors
    
    public  EventUrgenceRecu() {
        lId = EventUrgenceRecu_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (EventUrgenceRecu_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.EventUrgenceRecu");
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
          String s="EventUrgenceRecu(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/EventUrgenceRecu.java
*********************************************************************/

