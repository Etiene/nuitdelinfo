/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: EventEnvoieDonneesToServer
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/EventEnvoieDonneesToServer.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/EventEnvoieDonneesToServer.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event EventEnvoieDonneesToServer() 
public class EventEnvoieDonneesToServer extends RiJEvent implements AnimatedEvent {
    
    public static final int EventEnvoieDonneesToServer_Default_id = 18619;		//## ignore 
    
    
    // Constructors
    
    public  EventEnvoieDonneesToServer() {
        lId = EventEnvoieDonneesToServer_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (EventEnvoieDonneesToServer_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.EventEnvoieDonneesToServer");
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
          String s="EventEnvoieDonneesToServer(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/EventEnvoieDonneesToServer.java
*********************************************************************/

