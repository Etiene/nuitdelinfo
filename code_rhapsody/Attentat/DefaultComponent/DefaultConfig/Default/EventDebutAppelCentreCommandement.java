/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: EventDebutAppelCentreCommandement
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/EventDebutAppelCentreCommandement.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/EventDebutAppelCentreCommandement.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event EventDebutAppelCentreCommandement() 
public class EventDebutAppelCentreCommandement extends RiJEvent implements AnimatedEvent {
    
    public static final int EventDebutAppelCentreCommandement_Default_id = 18659;		//## ignore 
    
    
    // Constructors
    
    public  EventDebutAppelCentreCommandement() {
        lId = EventDebutAppelCentreCommandement_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (EventDebutAppelCentreCommandement_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.EventDebutAppelCentreCommandement");
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
          String s="EventDebutAppelCentreCommandement(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/EventDebutAppelCentreCommandement.java
*********************************************************************/

