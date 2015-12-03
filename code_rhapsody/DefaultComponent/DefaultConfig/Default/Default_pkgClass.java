/*********************************************************************
	Rhapsody	: 8.1.1
	Login		: marckan
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Default
//!	Generated Date	: Thu, 3, Dec 2015 
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
    
    public static CamionPompier itsCamionPompier;		//## classInstance itsCamionPompier 
    
    public static CentreGestionMessage itsCentreGestionMessage;		//## classInstance itsCentreGestionMessage 
    
    public static CentreTraitementUrgence itsCentreTraitementUrgence;		//## classInstance itsCentreTraitementUrgence 
    
    public static Pompier itsPompier;		//## classInstance itsPompier 
    
    public static Temoin itsTemoin;		//## classInstance itsTemoin 
    
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
    
    private static void renameGlobalInstances() {
        if(itsPompier != null)
            {
                AnimServices.setInstanceName(itsPompier, "itsPompier");
            }
        if(itsCamionPompier != null)
            {
                AnimServices.setInstanceName(itsCamionPompier, "itsCamionPompier");
            }
        if(itsCentreGestionMessage != null)
            {
                AnimServices.setInstanceName(itsCentreGestionMessage, "itsCentreGestionMessage");
            }
        if(itsCentreTraitementUrgence != null)
            {
                AnimServices.setInstanceName(itsCentreTraitementUrgence, "itsCentreTraitementUrgence");
            }
        if(itsVictime != null)
            {
                AnimServices.setInstanceName(itsVictime, "itsVictime");
            }
        if(itsTemoin != null)
            {
                AnimServices.setInstanceName(itsTemoin, "itsTemoin");
            }
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        itsCamionPompier = new CamionPompier(p_thread);
        itsCentreGestionMessage = new CentreGestionMessage(p_thread);
        itsCentreTraitementUrgence = new CentreTraitementUrgence(p_thread);
        itsPompier = new Pompier(p_thread);
        itsTemoin = new Temoin(p_thread);
        itsVictime = new Victime(p_thread);
        renameGlobalInstances();
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsCamionPompier.startBehavior();
        done &= itsCentreGestionMessage.startBehavior();
        done &= itsCentreTraitementUrgence.startBehavior();
        done &= itsPompier.startBehavior();
        done &= itsTemoin.startBehavior();
        done &= itsVictime.startBehavior();
        return done;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Default_pkgClass.java
*********************************************************************/

