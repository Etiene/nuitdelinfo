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
//## auto_generated
import com.ibm.rational.rhapsody.oxfinst.*;

//----------------------------------------------------------------------------
// Default/Default_pkgClass.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## ignore 
public class Default_pkgClass {
    
    public static BaseDeDonnee itsBaseDeDonnee;		//## classInstance itsBaseDeDonnee 
    
    public static IngenieurInformaticien itsIngenieurInformaticien;		//## classInstance itsIngenieurInformaticien 
    
    public static ServeurApplication itsServeurApplication;		//## classInstance itsServeurApplication 
    
    public static Utilisateur itsUtilisateur;		//## classInstance itsUtilisateur 
    
    
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
    
    private static void renameGlobalInstances() {
        if(itsBaseDeDonnee != null)
            {
                AnimServices.setInstanceName(itsBaseDeDonnee, "itsBaseDeDonnee");
            }
        if(itsIngenieurInformaticien != null)
            {
                AnimServices.setInstanceName(itsIngenieurInformaticien, "itsIngenieurInformaticien");
            }
        if(itsUtilisateur != null)
            {
                AnimServices.setInstanceName(itsUtilisateur, "itsUtilisateur");
            }
        if(itsServeurApplication != null)
            {
                AnimServices.setInstanceName(itsServeurApplication, "itsServeurApplication");
            }
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        itsBaseDeDonnee = new BaseDeDonnee(p_thread);
        itsIngenieurInformaticien = new IngenieurInformaticien(p_thread);
        itsServeurApplication = new ServeurApplication(p_thread);
        itsUtilisateur = new Utilisateur(p_thread);
        itsIngenieurInformaticien.setUnServeurApplication(itsServeurApplication);
        itsServeurApplication.setUnUtilisateur(itsUtilisateur);
        itsBaseDeDonnee.setUnIngenieurInformaticien(itsIngenieurInformaticien);
        renameGlobalInstances();
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsBaseDeDonnee.startBehavior();
        done &= itsIngenieurInformaticien.startBehavior();
        done &= itsServeurApplication.startBehavior();
        done &= itsUtilisateur.startBehavior();
        return done;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Default_pkgClass.java
*********************************************************************/

