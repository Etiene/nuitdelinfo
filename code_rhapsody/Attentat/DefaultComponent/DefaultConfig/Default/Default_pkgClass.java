/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Default
//!	Generated Date	: Fri, 4, Dec 2015 
	File Path	: DefaultComponent/DefaultConfig/Default/Default_pkgClass.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;

//----------------------------------------------------------------------------
// Default/Default_pkgClass.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## ignore 
public class Default_pkgClass {
    
    public static CentreAppel itsCentreAppel;		//## classInstance itsCentreAppel 
    
    public static centreCommandement itsCentreCommandement;		//## classInstance itsCentreCommandement 
    
    public static GIGN itsGIGN;		//## classInstance itsGIGN 
    
    public static otage itsOtage;		//## classInstance itsOtage 
    
    public static Place itsPlace;		//## classInstance itsPlace 
    
    public static police itsPolice;		//## classInstance itsPolice 
    
    public static Secours itsSecours;		//## classInstance itsSecours 
    
    public static Temoin itsTemoin;		//## classInstance itsTemoin 
    
    public static Terroriste itsTerroriste;		//## classInstance itsTerroriste 
    
    public static Victime itsVictime;		//## classInstance itsVictime 
    
    
    // Constructors
    
    //## auto_generated 
    public  Default_pkgClass(RiJThread p_thread) {
        initRelations(p_thread);
        startBehavior();
    }
    
    //## auto_generated 
    protected void finalize() throws Throwable {
        
        super.finalize();
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        itsCentreAppel = new CentreAppel(p_thread);
        itsCentreCommandement = new centreCommandement(p_thread);
        itsGIGN = new GIGN(p_thread);
        itsOtage = new otage(p_thread);
        itsPlace = new Place(p_thread);
        itsPolice = new police(p_thread);
        itsSecours = new Secours(p_thread);
        itsTemoin = new Temoin(p_thread);
        itsTerroriste = new Terroriste(p_thread);
        itsVictime = new Victime(p_thread);
        itsVictime.setUnTerroriste(itsTerroriste);
        itsTemoin.setUnTerroriste(itsTerroriste);
        itsTemoin.setUnVictime(itsVictime);
        itsTemoin.setUnOtage(itsOtage);
        itsTemoin.setUnCentreAppel(itsCentreAppel);
        itsCentreAppel.setUnPolice(itsPolice);
        itsPolice.setUnCentreCommandement(itsCentreCommandement);
        itsCentreCommandement.setUnPlace(itsPlace);
        itsCentreCommandement.setUnTemoin(itsTemoin);
        itsCentreCommandement.setUnGIGN(itsGIGN);
        itsGIGN.setUnTerroriste(itsTerroriste);
        itsGIGN.setUnOtage(itsOtage);
        itsSecours.setUnVictime(itsVictime);
        itsSecours.setUnCentreCommandement(itsCentreCommandement);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsCentreAppel.startBehavior();
        done &= itsCentreCommandement.startBehavior();
        done &= itsGIGN.startBehavior();
        done &= itsOtage.startBehavior();
        done &= itsPlace.startBehavior();
        done &= itsPolice.startBehavior();
        done &= itsSecours.startBehavior();
        done &= itsTemoin.startBehavior();
        done &= itsTerroriste.startBehavior();
        done &= itsVictime.startBehavior();
        return done;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Default_pkgClass.java
*********************************************************************/

