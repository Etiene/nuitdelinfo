/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: DefaultConfig
//!	Generated Date	: Thu, 3, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/MainDefaultComponent.java
*********************************************************************/


//## auto_generated
import Default.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.*;

//----------------------------------------------------------------------------
// MainDefaultComponent.java                                                                  
//----------------------------------------------------------------------------


//## ignore 
public class MainDefaultComponent {
    
    //#[ ignore
    // link with events in order to register them in the animation browser
    static {
      // Setting Animation Default Port 
      AnimTcpIpConnection.setDefaultPort(6423);
      // Registering Events 
      try {
        
            Class.forName("Default.EventCamionPompierArrive");
            Class.forName("Default.EventDecouvreVictime");
            Class.forName("Default.EventEnvoieCamionPompier");
            Class.forName("Default.EventIntervention");
            Class.forName("Default.EventMessageRecu");
            Class.forName("Default.EventMessageRelaye");
            Class.forName("Default.EventPasIntervention");
            Class.forName("Default.EventUrgenceRecu");
            Class.forName("Default.EventVaHopital");
            Class.forName("Default.VaHopital");
    
        // Registering Static Classes 
        
      }
      catch(Exception e) { 
         java.lang.System.err.println(e.toString());
         e.printStackTrace(java.lang.System.err);
      }
    }
    //#]
    
    private Default_pkgClass initializer_Default = new Default_pkgClass(RiJMainThread.instance());
    
    //## configuration DefaultComponent::DefaultConfig 
    public static void main(String[] args) {
        RiJOXF.Init(null, 0, 0, true, args);
        MainDefaultComponent initializer_DefaultComponent = new MainDefaultComponent();
        //#[ configuration DefaultComponent::DefaultConfig 
        //#]
        RiJOXF.Start();
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/MainDefaultComponent.java
*********************************************************************/

