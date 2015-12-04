/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: EventAppelPoliceEnCours
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/EventAppelPoliceEnCours.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/EventAppelPoliceEnCours.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event EventAppelPoliceEnCours() 
public class EventAppelPoliceEnCours extends RiJEvent implements AnimatedEvent {
    
    public static final int EventAppelPoliceEnCours_Default_id = 18621;		//## ignore 
    
    
    // Constructors
    
    public  EventAppelPoliceEnCours() {
        lId = EventAppelPoliceEnCours_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (EventAppelPoliceEnCours_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.EventAppelPoliceEnCours");
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
          String s="EventAppelPoliceEnCours(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/EventAppelPoliceEnCours.java
*********************************************************************/

