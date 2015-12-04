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
        
            Class.forName("Default.EventAnalyseSituation");
            Class.forName("Default.EventAppelleCentreAppel");
            Class.forName("Default.EventAppelleCentreCommandement");
            Class.forName("Default.EventAppelPoliceEnCours");
            Class.forName("Default.EventAppelTemoin");
            Class.forName("Default.EventAssautEchec");
            Class.forName("Default.EventAssautReussi");
            Class.forName("Default.EventCooperation");
            Class.forName("Default.EventDebutAppelCentreAppel");
            Class.forName("Default.EventDebutAppelCentreCommandement");
            Class.forName("Default.EventDebutAppelPolice");
            Class.forName("Default.EventDebutAppelTemoin");
            Class.forName("Default.EventDemandeInformation");
            Class.forName("Default.EventEchec");
            Class.forName("Default.EventEnAttente");
            Class.forName("Default.EventEnAttenteInstruction");
            Class.forName("Default.EventEnCoursAssaut");
            Class.forName("Default.EventEnvoye");
            Class.forName("Default.EventEtatAlerte");
            Class.forName("Default.EventEtateAlerte");
            Class.forName("Default.EventFinAppel");
            Class.forName("Default.EventFinAppelCentreAppel");
            Class.forName("Default.EventFinAppelCentreCommandement");
            Class.forName("Default.EventFinAppelPolice");
            Class.forName("Default.EventFinAppelTemoin");
            Class.forName("Default.EventFinCooperation");
            Class.forName("Default.EventFinCopperation");
            Class.forName("Default.EventFinMission");
            Class.forName("Default.EventGIGNMort");
            Class.forName("Default.EventGIGNVivant");
            Class.forName("Default.EventLanceAssaut");
            Class.forName("Default.EventLibre");
            Class.forName("Default.EventMort");
            Class.forName("Default.EventNonSecurisee");
            Class.forName("Default.EventPriseOtage");
            Class.forName("Default.EventRecoitAppel");
            Class.forName("Default.EventReussi");
            Class.forName("Default.EventSecurisee");
            Class.forName("Default.EventSeFaitExploser");
            Class.forName("Default.EventSoigne");
            Class.forName("Default.EventTerroristeNeutralise");
            Class.forName("Default.EventTirSurVictime");
            Class.forName("Default.EventVictimeMort");
            Class.forName("Default.EventVictimeSecouru");
            Class.forName("Default.EventVictimeSurvie");
    
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

