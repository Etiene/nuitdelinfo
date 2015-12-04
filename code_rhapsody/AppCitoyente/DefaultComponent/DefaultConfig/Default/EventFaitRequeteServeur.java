/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: EventFaitRequeteServeur
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/EventFaitRequeteServeur.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/EventFaitRequeteServeur.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event EventFaitRequeteServeur() 
public class EventFaitRequeteServeur extends RiJEvent implements AnimatedEvent {
    
    public static final int EventFaitRequeteServeur_Default_id = 18631;		//## ignore 
    
    
    // Constructors
    
    public  EventFaitRequeteServeur() {
        lId = EventFaitRequeteServeur_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (EventFaitRequeteServeur_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.EventFaitRequeteServeur");
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
          String s="EventFaitRequeteServeur(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/EventFaitRequeteServeur.java
*********************************************************************/

