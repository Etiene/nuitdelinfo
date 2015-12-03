/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: EventCamionPompierArrive
//!	Generated Date	: Thu, 3, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/EventCamionPompierArrive.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/EventCamionPompierArrive.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event EventCamionPompierArrive() 
public class EventCamionPompierArrive extends RiJEvent implements AnimatedEvent {
    
    public static final int EventCamionPompierArrive_Default_id = 18624;		//## ignore 
    
    
    // Constructors
    
    public  EventCamionPompierArrive() {
        lId = EventCamionPompierArrive_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (EventCamionPompierArrive_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.EventCamionPompierArrive");
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
          String s="EventCamionPompierArrive(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/EventCamionPompierArrive.java
*********************************************************************/

