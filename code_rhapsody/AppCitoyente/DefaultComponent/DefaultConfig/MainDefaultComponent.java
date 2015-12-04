/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: DefaultConfig
//!	Generated Date	: Fri, 4, Dec 2015 
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
        
            Class.forName("Default.EnvoieDonnees");
            Class.forName("Default.EventAnalyseDonnees");
            Class.forName("Default.EventAnalyseSituation");
            Class.forName("Default.EventEnAttente");
            Class.forName("Default.EventEnvoieDonneesToCentre");
            Class.forName("Default.EventEnvoieDonneesToServer");
            Class.forName("Default.EventEnvoieRequeteToUser");
            Class.forName("Default.EventEtatNormal");
            Class.forName("Default.EventFaitRequeeServeur");
            Class.forName("Default.EventFaitRequeteServeur");
            Class.forName("Default.EventFaitRequteServeur");
            Class.forName("Default.EventRecoieRequeteFromServer");
            Class.forName("Default.EventRecoitDonneesFromUser");
            Class.forName("Default.EventRecoitRequete");
            Class.forName("Default.EventRecoitRequeteFromCentre");
            Class.forName("Default.EventRecolteRenseignements");
            Class.forName("Default.EventRegroupeInformations");
            Class.forName("Default.EventRequeteAttente");
            Class.forName("Default.EventRequeteBDD");
            Class.forName("Default.EventRequeteExecute");
            Class.forName("Default.EventRetourNormalServer");
            Class.forName("Default.EventRetourNormalUser");
            Class.forName("Default.EventVoitIncident");
            Class.forName("Default.RecoitRequeteServeur");
    
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

