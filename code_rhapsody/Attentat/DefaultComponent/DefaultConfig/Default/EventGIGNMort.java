/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: EventGIGNMort
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/EventGIGNMort.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/EventGIGNMort.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event EventGIGNMort() 
public class EventGIGNMort extends RiJEvent implements AnimatedEvent {
    
    public static final int EventGIGNMort_Default_id = 18635;		//## ignore 
    
    
    // Constructors
    
    public  EventGIGNMort() {
        lId = EventGIGNMort_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (EventGIGNMort_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.EventGIGNMort");
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
          String s="EventGIGNMort(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/EventGIGNMort.java
*********************************************************************/

