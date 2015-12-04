/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: EventRecoitDonneesFromUser
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/EventRecoitDonneesFromUser.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/EventRecoitDonneesFromUser.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event EventRecoitDonneesFromUser() 
public class EventRecoitDonneesFromUser extends RiJEvent implements AnimatedEvent {
    
    public static final int EventRecoitDonneesFromUser_Default_id = 18624;		//## ignore 
    
    
    // Constructors
    
    public  EventRecoitDonneesFromUser() {
        lId = EventRecoitDonneesFromUser_Default_id;
    }
    
    public boolean isTypeOf(long id) {
        return (EventRecoitDonneesFromUser_Default_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("Default.EventRecoitDonneesFromUser");
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
          String s="EventRecoitDonneesFromUser(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/EventRecoitDonneesFromUser.java
*********************************************************************/

